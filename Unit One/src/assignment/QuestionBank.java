package assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QuestionBank {

  private static final int MAX_QUESTIONS = 1000;
  private Question[] questions;
  private int numQuestions;

  public QuestionBank(String fileName) {
    questions = new Question[MAX_QUESTIONS];
    addAllQuestions(fileName);
  }


  /**
   * Add Question
   */


/**
    * Add all Questions
    */
  public void addAllQuestions(String fileName){
    try{
      Scanner scanner = new Scanner(new File(fileName));

      while(scanner.hasNextLine()){
        String question = scanner.nextLine().split(":")[1].trim();
        String answer = scanner.nextLine().split(":")[1].trim();
        int marks = Integer.parseInt(scanner.nextLine().split(":")[1].trim());

        Question q = new Question(question, answer, marks);
        questions[numQuestions] = q;
        numQuestions++;
      }
    }catch(FileNotFoundException ex){

    }

  }
}
