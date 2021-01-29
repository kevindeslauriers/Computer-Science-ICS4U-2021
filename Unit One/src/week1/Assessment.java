package week1;

public class Assessment {
  private String name;
  private int maxScore;
  private int studentScore;

  public Assessment(String name, int maxScore){
    this.name = name;
    this.maxScore = maxScore;
    this.studentScore = 0;
  }

  public Assessment(String name, int maxScore, int studentScore){
    this.name = name;
    this.maxScore = maxScore;
    this.studentScore = studentScore;
  }

  public double getAverage(){
    return (studentScore / (double)maxScore) * 100 ;
  }

  public String toString(){
    return name + ": " + getAverage();
  }

  public int getScore(){
    return studentScore;
  }

  public int getMaxScore(){
    return maxScore;
  }

}
