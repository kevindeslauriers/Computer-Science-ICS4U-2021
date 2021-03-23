package week9;

public class IntBST {
  private IntBSTNode root;

  public IntBST() {
  }

  public IntBST(IntBSTNode root) {
    this.root = root;
  }

  public IntBSTNode getRoot() {
    return root;
  }

  public void setRoot(IntBSTNode root) {
    this.root = root;
  }

  public void add(int x) {
    if (root == null)
      root = new IntBSTNode(x);
    else {
      add(x, root);
    }
  }

  private void add(int x, IntBSTNode root) {
    if (x < root.getData() && root.getLeft() != null)
      add(x, root.getLeft());
    else if (x >= root.getData() && root.getRight() != null)
      add(x, root.getRight());
    else if (x < root.getData())
      root.setLeft(new IntBSTNode(x));
    else
      root.setRight(new IntBSTNode(x));
  }
}
