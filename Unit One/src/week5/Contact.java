package week5;

public class Contact {
  private String fName;
  private String lName;
  private String phone;

  public Contact(String fName, String lName, String phone) {
    this.fName = fName;
    this.lName = lName;
    this.phone = phone;
  }

  @Override
  public String toString() {
    return "Contact [fName=" + fName + ", lName=" + lName + ", phone=" + phone + "]";
  }

  public String getfName() {
    return fName;
  }

  public void setfName(String fName) {
    this.fName = fName;
  }

  public String getlName() {
    return lName;
  }

  public void setlName(String lName) {
    this.lName = lName;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

}
