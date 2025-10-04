import java.util.HashMap;
import java.util.Set;

/**
 * Write a description of class MapTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MapTester
{
    // instance variables - replace the example below with your own
    private HashMap<String,String> phonebook;

    /**
     * Constructor for objects of class MapTester
     */
    public MapTester()
    {
        phonebook = new HashMap<>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void enterNumber(String name, String number)
    {
        //use the put method
        phonebook.put(name, number);
    } 
    
    /**
     * 
     */
    public String lookupNumber(String name) {
        //use the get method
        return phonebook.get(name); 
    } 
}