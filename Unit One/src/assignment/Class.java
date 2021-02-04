package assignment;


public class Class {
  private static final int MAX_STUDENTS = 22;
  private static final int MAX_ASSESSMENTS = 50;

  private Student[] students;
  private Assessment[] assessments;

  private String courseName;
  private String courseCode;
  private int numStudentsEnrolled;
  private int numAssessments;
  
  /** Constructor
   * 
   */
  public Class(String name, String courseCode) {
    this.courseName = name;
    this.courseCode = courseCode;
    
    numStudentsEnrolled = 0;
    numAssessments = 0;
    
    students = new Student[MAX_STUDENTS];
    assessments = new Assessment[MAX_ASSESSMENTS];
	}

    
}