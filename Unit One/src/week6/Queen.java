package week6;

public class Queen {
  private int row;
  private int col;

  public int getRow() {
    return row;
  }

  public void setRow(int row) {
    this.row = row;
  }

  public int getCol() {
    return col;
  }

  public void setCol(int col) {
    this.col = col;
  }

  public Queen(int row, int col) {
    this.row = row;
    this.col = col;
  }

  public static boolean isConflict(Queen q) {
    return true;
  }

}
