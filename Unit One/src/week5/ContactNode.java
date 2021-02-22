package week5;

public class ContactNode {
  Contact data;
  ContactNode link;

  public ContactNode(Contact data, ContactNode link) {
    this.data = data;
    this.link = link;
  }

  public Contact getData() {
    return data;
  }

  public void setData(Contact data) {
    this.data = data;
  }

  public ContactNode getLink() {
    return link;
  }

  public void setLink(ContactNode link) {
    this.link = link;
  }

  @Override
  public String toString() {
    return "ContactNode [data=" + data + ", link=" + link + "]";
  }

}
