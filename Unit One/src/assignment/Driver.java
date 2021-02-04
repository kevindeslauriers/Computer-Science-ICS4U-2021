package assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {

  private static final int MAX_CLASSES = 50;
  private static final int MAX_STUDENTS = 1000;

  private static QuestionBank qBank;
  private static Student[] students;
  private static Class[] classes;


  public Driver(){
    qBank = new QuestionBank("src\\assignment\\questionBank.dat");

    /**
     * Create a list of students (Load from a file)
     */
    loadAllStudents("src\\assignment\\students.dat");
  
     /**
      * Create a list of classes (Load from a file)
      */
    loadAllClasses("src\\assignment\\courses.dat");
  
  }


public static void main(String[] args) {
  Driver driver = new Driver();

  
  /**
   * Create a menu with the following functionality.
   * 1. Create new class
   * 2. Create new student
   * 3. Assign a student to a class
   * 4. Create a new question to add to the question bank
   * 5. Create a new assignment and assign to a class.
   * 5a. Choose questions to add to the Assessment
   * 6. Allow a student to take a test from a specific class.
   * 7. Display a student's average.
   * 8. Display a student's results for a specific course/class.
   * 9. Display the average for all of the students in a class.
   * 10. Display the average for a specific course.
   * 11. Display all the students by grade
   * 12. Display all the students by cohort
   */
}

private static void loadAllClasses(String fileName) {
  try{
    Scanner scanner = new Scanner(new File(fileName));
    int numClasses = 0;
    classes = new Class[MAX_CLASSES];
    while(scanner.hasNextLine()){
      String name = scanner.nextLine().split(":")[1].trim();
      String courseCode = scanner.nextLine().split(":")[1].trim();

      Class c = new Class(name, courseCode);
      classes[numClasses] = c;
      numClasses++;
    }
  }catch(FileNotFoundException ex){

  }


}

private static Student[] loadAllStudents(String string) {
  return null;
}
  
}
