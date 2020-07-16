package i5.las2peer.services.res;

import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.ParseException;

public class classes {

    class m1 {

    public m1() {}
    
    private String test;

    public void setTest(String setValue) {
        this.test = setValue;
    }

    public String getTest() {
        return this.test;
    }

    public JSONObject toJSON() {

        JSONObject jo = new JSONObject();
        jo.put("Test", this.Test); 

        return jo;
    }

    public void fromJSON(String jsonString) throws ParseException {
        JSONObject jsonObject = (JSONObject) JSONValue.parseWithException(jsonString);
        this.Test = (String) jsonObject.get("Test"); 

    }

}

    
}
