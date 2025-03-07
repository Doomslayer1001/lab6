import java.util.Random;
import java.util.ArrayList;

/**
 * Write a description of class RandomTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomTester
{
    // instance variables - replace the example below with your own
    private Random rand_gen;
    private ArrayList<String> responses;

    /**
     * Constructor for objects of class RandomTester
     */
    public RandomTester()
    {
        // initialise instance variables
        rand_gen = new Random();
        responses = new ArrayList<>();
        fillResponse();
    }
    /**
     * 22
     */private void fillResponse(){
        responses.add("yes");
        responses.add("no");
        responses.add("who knows");
        responses.add("i dont know");
        responses.add("maybe");
        responses.add("Doo doo");
        }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printOneRandom()
    {
        // put your code here
        System.out.println("New Interger: " + rand_gen.nextInt(10000));
    }
    
    /*
     * Question 14
     */public void printMultiRandom(int howMany){
        int index =0;
        while(index < howMany){
            printOneRandom();
            index++;
        }
    }

    /**
     * question 16
     */public void throwDice(){
       int index = 1;
       
    }
     /**
      * question 17
      */
     public String getResponse(){
        int index = rand_gen.nextInt(3);
         if(index == 0){
             return "yes";
            }
         else if (index == 1){
             return "no"; 
        }
        else{
            return "maybe";
        } 
    }
    
    /*
     * 18)
     */public String getBetterResponse(int index){
        index = rand_gen.nextInt(responses.size());
        return responses.get(index);
    }

}

