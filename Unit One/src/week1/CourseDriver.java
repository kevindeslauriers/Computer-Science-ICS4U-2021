package week1;

public class CourseDriver {
  public static void main(String[] args) {
    Course compSci = new Course("ICS4U");
    Student student1 = new Student("Daniel", "Rad");
    Student student2 = new Student("Aryo", "Jabbarzadeh");
    compSci.addStudent(student1);
    compSci.addStudent(student2);

    Assessment a1 = new Assessment("Unit One Test", 50, 42);
    Assessment a2 = new Assessment("Unit One Test", 50, 41);
    Assessment a3 = new Assessment("Unit Two Test", 60, 49);
    Assessment a4 = new Assessment("Unit Two Test", 60, 51);

    student1.addAssessment(a1);
    student1.addAssessment(a3);
    student2.addAssessment(a2);
    student2.addAssessment(a4);

    compSci.displayGradeBook();

  }
}
