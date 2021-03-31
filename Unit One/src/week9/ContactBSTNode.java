package week9;

import week5.Contact;

/**
 * ContactBSTNode
 */
public class ContactBSTNode {
  private Contact data;
  private ContactBSTNode left;
  private ContactBSTNode right;
  // test

  public ContactBSTNode(Contact data) {
    this.data = data;
  }

  public ContactBSTNode(Contact data, ContactBSTNode left, ContactBSTNode right) {
    this.data = data;
    this.left = left;
    this.right = right;
  }

  public Contact getData() {
    return data;
  }

  public void setData(Contact data) {
    this.data = data;
  }

  public ContactBSTNode getLeft() {
    return left;
  }

  public void setLeft(ContactBSTNode left) {
    this.left = left;
  }

  public ContactBSTNode getRight() {
    return right;
  }

  public void setRight(ContactBSTNode right) {
    this.right = right;
  }

}