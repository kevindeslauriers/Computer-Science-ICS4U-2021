package week6;

/**
 * Array implementation of Queue where the front of the queue is at index 0. The
 * back of the queue is loacted at manyItems-1
 */
public class Queue {
  int[] data;
  int manyItems;
  private static final int DEFAULT_CAPACITY = 10;

  public Queue() {
    data = new int[DEFAULT_CAPACITY];
    manyItems = 0;
  }

  public Queue(int initialCapacity) {
    data = new int[initialCapacity];
    manyItems = 0;
  }

  public boolean isEmpty() {
    return manyItems == 0;
  }

  public void enqueue(int el) {
    if (manyItems == data.length)
      throw new IllegalStateException();
    data[manyItems] = el;
    manyItems++;
  }

  public void clear() {
    manyItems = 0;
  }

  public int peek() {
    if (!isEmpty())
      return data[0];
    else
      throw new IllegalStateException();
  }

  public int dequeue() {
    if (isEmpty())
      throw new IllegalStateException();

    int el = data[0];

    for (int i = 0; i < manyItems - 1; i++) {
      data[i] = data[i + 1];
    }

    manyItems--;
    return el;
  }

}
