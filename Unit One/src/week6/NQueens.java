import java.util.Stack;
import week6.Queen;

public class NQueens {
  public static void main(String[] args) {
    solveNQueens(4);
  }

  private static Stack<Queen> solveNQueens(int n) {
    Stack<Queen> goodQueens = new Stack<Queen>();
    int numFilled = 0;
    Queen q = new Queen(1, 1);
    goodQueens.push(q);
    numFilled++;

    while (numFilled != n) {
      int row = numFilled + 1;
      int col = 1;
      if (!conflict(new Queen(row, col), goodQueens)) {
        goodQueens.push(new Queen(row, col));
        numFilled++;
      } else {
        // can we move over one? increase col then we try to increase col
        // if we cannot the numFilled-- and pop the stack
      }
    }

    return goodQueens;
  }

  private static boolean conflict(Queen queen, Stack<Queen> goodQueens) {
    Stack<Queen> temp = new Stack<Queen>();

    while(!goodQueens.isEmpty()){
      Queen q = goodQueens.peek();

      if (q.getCol() == queen.getCol() || q.getRow() == queen.getRow()
          || (Math.abs(q.getCol() - queen.getCol()) == Math.abs(q.getRow() - queen.getRow())) {
        while (!temp.isEmpty())
          goodQueens.push(temp.pop());
        return true;
      }else{
        temp.push(goodQueens.pop());
      }
    }
    return false;  
  }
}
