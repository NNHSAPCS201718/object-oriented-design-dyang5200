import java.util.Scanner;

/**
   This program shows a simple quiz with one question.
*/
public class QuestionDemo1
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      ChoiceQuestion cq = new ChoiceQuestion();
      cq.addChoice("Alan Kay",false);
      cq.addChoice("James Gosling", true);

      Question q = cq;
      q.display();
      System.out.print("Your answer: ");
      String response = in.nextLine();
      System.out.println(q.checkAnswer(response));
   }
}

