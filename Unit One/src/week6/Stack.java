package week6;

/* An Array implementation of the stack where manyItems-1 is the top */
public class Stack {
  int[] data;
  int manyItems;
  private static final int DEFAULT_CAPACITY = 10;

  public Stack() {
    data = new int[DEFAULT_CAPACITY];
    manyItems = 0;
  }

  public Stack(int initialCapacity) {
    data = new int[initialCapacity];
    manyItems = 0;
  }

  public boolean isEmpty() {
    return manyItems == 0;
  }

  public void push(int el) {
    if (manyItems == data.length)
      throw new IllegalStateException();
    data[manyItems] = el;
    manyItems++;
  }

  public int peek() {
    if (!isEmpty())
      return data[manyItems - 1];
    else
      throw new IllegalStateException();
  }

  public int pop() {
    if (!isEmpty()) {
      manyItems--;
      return data[manyItems];
    } else
      throw new IllegalStateException();
  }

  public int search(int el) {
    int depth = 0;
    for (int i = manyItems - 1; i >= 0; i--) {
      if (data[i] == el)
        return depth;
      else
        depth++;
    }

    return -1;
  }

}
