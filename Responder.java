import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;

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
    private HashMap<String,String> responsesMap;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        rand_gen = new Random();
        responses = new ArrayList<>();
        responsesMap = new HashMap<>();
        fillResponse();
        fillResponseMap();
    }
    private void fillResponseMap(){
        responsesMap.put("crash","Try to reboot your computer");
        responsesMap.put("john","John Wick is comming");
        responsesMap.put("steve","I am  Steve");
    }
    private String pickDefaultResponse(){
        return "no idea"
    }
    
    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     *
     */
    public String generateResponse(String word)
    {
        String response = responsesMap.get(word);
        if(response == null){
            response = pickDefaultResponse();
        }
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

