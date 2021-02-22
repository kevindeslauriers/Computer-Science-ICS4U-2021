package week5;

public class IntLinkedList {
  private IntNode head;

  public IntLinkedList() {
    head = null;
  }

  public void add(int x) {
    IntNode node = new IntNode(x);
    if (head == null)
      head = node;
    else {
      // iterate to the end and add it there
      IntNode ptr = head;
      while (ptr.getLink() != null) {
        ptr = ptr.getLink();
      }

      ptr.setLink(node);
    }
  }

  public void addFront(int x) {
    head = new IntNode(x, head);
  }

  public void remove(int x) {
    if (head == null)
      return;
    else if (head.getData() == x)
      head = head.getLink();
    else {
      IntNode ptr = head;
      while (ptr.getLink() != null && ptr.getLink().getData() != x) {
        ptr = ptr.getLink();
      }
      if (ptr.getLink() == null)
        return;
      else
        ptr.setLink(ptr.getLink().getLink());
    }

  }

  public String toString() {
    String temp = "[";
    IntNode ptr = head;
    while (ptr != null) {
      temp += ptr.getData() + " ";
      ptr = ptr.getLink();
    }
    temp = temp.substring(0, temp.length() - 1) + "]";

    return temp;
  }
}
