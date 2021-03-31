package week5;

public class LinkedListDriver {
  public static void main(String[] args) {

    /*
     * IntLinkedList list = new IntLinkedList(); list.add(7); list.add(6);
     * list.add(3); list.add(17); list.add(6); list.add(3); list.addFront(9);
     * System.out.println(list); list.remove(17); list.remove(117);
     * System.out.println(list);
     * 
     * ContactLinkedList contacts = new ContactLinkedList();
     */

    Contact c = new Contact("Steve", "Henry", "4165551212");
    Contact c1 = new Contact("Steve", "Henri", "4165551212");

    System.out.println(c.compareTo(c1));

  }
}
