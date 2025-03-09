import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
/**
 * Write a description of class ResponseforHasMap here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Responder2
{
    private Random rand_gen;
    private ArrayList<String> responses;
    private HashMap<String,String> responsesMap;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder2()
    {
        rand_gen = new Random();
        responses = new ArrayList<>();
        responsesMap = new HashMap<>();
        fillResponseMap();
    }
    private void fillResponseMap(){
        responsesMap.put("crash","Try to reboot your computer");
        responsesMap.put("john","John Wick is comming");
        responsesMap.put("steve","I am  Steve");
    }
    private String pickDefaultResponse(){
        return "no idea";
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
        return response;
    }


     

}


