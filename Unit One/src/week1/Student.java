package week1;

public class Student {
  private String firstName;
  private String lastName;
  private Assessment[] assessments; // a partially filled array
  private int numAssessmentsCompleted;

  public Student(String fName, String lName){
    firstName = fName;
    lastName = lName;
    assessments = new Assessment[Course.NUM_ASSESSMENTS];
    numAssessmentsCompleted = 0;
  }

  public String getName(){
    return lastName + ", " + firstName;
  }

  public void addAssessment(Assessment assessment){
    assessments[numAssessmentsCompleted] = assessment;
    numAssessmentsCompleted++;
  }

  public double getAverage(){
    if (numAssessmentsCompleted == 0)
      return 0;

    double totalMarks = 0;
    double totalMaxScore = 0;


    for (int i=0; i < numAssessmentsCompleted; i++){
      totalMarks += assessments[i].getScore();
      totalMaxScore += assessments[i].getMaxScore();
    }

    return totalMarks / totalMaxScore;
  }


  public void displayStudentResults(){
    for (int i=0; i < numAssessmentsCompleted; i++){
      System.out.println(assessments[i]);
    }
  }

}
