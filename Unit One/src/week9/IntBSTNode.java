package week9;

/**
 * IntBSTNode
 */
public class IntBSTNode {
  private int data;
  private IntBSTNode left;
  private IntBSTNode right;
  // test

  public IntBSTNode(int data) {
    this.data = data;
  }

  public IntBSTNode(int data, IntBSTNode left, IntBSTNode right) {
    this.data = data;
    this.left = left;
    this.right = right;
  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public IntBSTNode getLeft() {
    return left;
  }

  public void setLeft(IntBSTNode left) {
    this.left = left;
  }

  public IntBSTNode getRight() {
    return right;
  }

  public void setRight(IntBSTNode right) {
    this.right = right;
  }

}