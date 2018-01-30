import java.util.Scanner;
/**
 * A FillInQuestion is constructed with a string that contains the answer
 *      surrounded by "_". For example, "The inventor of Java was _James
 *      Gosling_." The question should be displayed as:
 *      The inventor of Java was ______.
 *
 * @author dyang5200
 * @version 30 January 2018
 */
/*
 * The FillInQuestion class extends (ie: is a subclass of) the Question class
 */
public class FillInQuestion extends Question
{
    /*
     * Do not declare instance variables for text and answer.
     *      The text and answer instance variables are inherited from the Question class.
     */
    /**
     * 
     */
    public FillInQuestion()
    {
        
    }
    
    /**
     * This method overrides the setText method in the Question class.
     * 
     * Sets the question text.
     * @param questionText the text of this question
     * */
    public void setText(String questionText)
    {
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");
        String question = parser.next();     // extracts the question
        String answer = parser.next();      // extracts the answer
        question += "_____" + parser.next();
        
        /*
         * The inherited instance variables are private; they cannot be
         *      directly accessed. We must use mutator and accessor methods.
         */
        //this.text = question;
        //this.answer = answer;
        
        /*
         * Use the "super" reserved word to call the setText mthod
         *      as defined in the superclass (ie: Question).
         */
        super.setText(question);
        
        /*
         * Can use "this" reserved word to call the setAnswer method
         *      If the subclass doesn't override the method, it will call the 
         *      inherited method in the super class
         */
        this.setAnswer(answer);
    }
}
