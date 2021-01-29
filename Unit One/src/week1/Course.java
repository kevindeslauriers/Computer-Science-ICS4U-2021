package week1;

public class Course {

  public static final int NUM_ASSESSMENTS = 10;
  public static final int MAX_STUDENTS = 22;
  
  private String name;
  private Student[] students;
  private int numStudentsEnrolled;

  public Course(String name) {
    this.name = name;
    this.students = new Student[MAX_STUDENTS];
    this.numStudentsEnrolled = 0;
  }

  public void addStudent(Student student){
    students[numStudentsEnrolled] = student;
    numStudentsEnrolled++;
  }

  public void displayGradeBook(){
    for (int i=0; i < numStudentsEnrolled; i++){
      System.out.println(students[i].getName());
      System.out.println("---------------");
      students[i].displayStudentResults();
      System.out.println();
    }
    
    
  }
}
