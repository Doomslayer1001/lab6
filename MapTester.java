import java.util.HashMap;
/**
 * Write a description of class MapTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MapTester
{
    //24) HashMap is use for implamiting the base of the map interface and provides
    //27)the class is created
    //28)update the value
    private HashMap<String,String> contact;

    /**
     * Constructor for objects of class MapTester
     */
    public MapTester()
    {
        contact = new HashMap<>();
        fillcontact();
    }
    private void fillcontact(){
        contact.put("Danush","5527245242424525");
        contact.put("Kenny bin Landin","45245424245");
        contact.put("MrShanba","553737373455");
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void enterNumber(String name,String number){
        contact.put(name,number);
    }
    
    public String lookupNumber(String name){
        String number = contact.get(name);
        return number;
    }
}
