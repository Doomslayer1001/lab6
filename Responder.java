import java.util.ArrayList;
import java.util.Random;

/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class Responder
{
    private Random rand_gen;
    private ArrayList<String> responses;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        rand_gen = new Random();
        responses = new ArrayList<>();
        fillResponse();
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     *
     */
    public String generateResponse()
    {
        int index = rand_gen.nextInt(responses.size());
        return responses.get(index);
    }

        /**
     * 22)
     */private void fillResponse(){
        responses.add("yes");
        responses.add("no");
        responses.add("who knows");
        responses.add("i dont know");
        responses.add("maybe");
        responses.add("Doo doo");
        }
    
    
    }

