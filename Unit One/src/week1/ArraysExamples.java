package week1;

public class ArraysExamples {
  public static void main(String[] args) {
    exampleOne();
    double[] arr = {2.3, 1.4, 7.6, 0.4};
    exampleTwo(arr);
    System.out.println(arr);
  }

  private static void exampleTwo(double[] arr1) {
    double sum = 0;

    for (double x : arr1) {
      x++;
      System.out.println(x);
    }

    System.out.println(sum);
  }

  private static void exampleOne() {
    int[] arr = new int[10];

    for (int i=0;i<arr.length; i++){
      arr[i] = (int)(Math.random()*10 + 1);
    }
    int sum = 0;

    for (int x : arr){
      sum += x;
    }

    System.out.println(sum);
  }
}
