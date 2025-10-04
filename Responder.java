import java.util.HashMap;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 7.0
 */
public class Responder
{
    private HashMap<String,String> responseMap;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        responseMap = new HashMap<>();
        fillResponseMap();
    }
    
    /**
     * 
     */
    public void fillResponseMap(){
        responseMap.put("slow",
        "I think this has to do with your hardware.Upgrading/n" + "your processor should slove all performance problems./n"
        + "Have you got a problem with our software?");
        responseMap.put("finish",
        "Your system has been completed. You may leave");
        responseMap.put("crash",
        "Your system has crashed. Please restart your device.");
        responseMap.put("no action",
        "Your action can not be completed. Please try again.");
    }
    
    /**
     * 
     */
    public String generateResponse(String word) {
        String response = responseMap.get(word);
        if(response !=null){
            return response; 
        }
        else{
            //if we get here, the word hasnt been recognized.In this
            //case we pick our Default responses.
            return pickDefaultResponse();
        }
        }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String pickDefaultResponse()
    {
        return "That sounds interesting. Tell me more...";
    }
}

