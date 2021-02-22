package week5;

public class ContactLinkedList {
  private ContactNode head;

  public ContactLinkedList() {
    this.head = null;
  }

  public void add(Contact c) {
    ContactNode node = new ContactNode(c, null);
    if (head == null)
      head = node;
    else {
      // iterate to the end and add it there
      ContactNode ptr = head;
      while (ptr.getLink() != null) {
        ptr = ptr.getLink();
      }

      ptr.setLink(node);
    }
  }

  public void remove(String phone) {
    if (head == null)
      return;
    else if (head.getData().getPhone().equals(phone))
      head = head.getLink();
    else {
      ContactNode ptr = head;
      while (ptr.getLink() != null && !ptr.getLink().getData().getPhone().equals(phone)) {
        ptr = ptr.getLink();
      }
      if (ptr.getLink() == null)
        return;
      else
        ptr.setLink(ptr.getLink().getLink());
    }

  }

}
