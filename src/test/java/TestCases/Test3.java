package TestCases;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;
//import org.json.JSONObject;
//import org.json.JSONArray;
public class Test3 {

	
	private static void parseEmployeeObject(JSONObject employee) 
    {
        //Get employee object within list
        JSONObject employeeObject = (JSONObject) employee.get("valuation_percentage");
         
        //Get employee first name
        String context = (String) employeeObject.get("context");    
        System.out.println(context);
         
        //Get employee last name
        String value = (String) employeeObject.get("value");  
        System.out.println(value);
         
        //Get employee website name
     //   String website = (String) employeeObject.get("website");    
      //   System.out.println(website);
    }
	public static void main(String[] args) throws ParseException {
		
		
		//JSON parser object to parse read file
      //  @SuppressWarnings("deprecation")
		JSONParser jsonParser = new JSONParser();
        //JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader("E:/office_lap/selenium_projects/COD/src/test/java/TestCases/test4.json"))
        {
            //Read JSON file
        	JSONObject obj = (JSONObject) jsonParser.parse(reader);
          // JSONObject jsonobj = new JSONObject();
           
           JSONObject jsonobj= (JSONObject) obj;
 //Object obj1= (JSONObject) obj;
 String str=jsonobj.toJSONString();
 
 
 for (int i=0; i<jsonobj.size();i++) {
	 
	 System.out.println(jsonobj.keySet());
	 
 }
 

 //String str1=jsonobj.toString();

//String str1="[{\"Rounding -- recall\":{\"context\":\"NA\",\"value\":\"down\"},\"gracePeriod\":{\"context\":\"NA\",\"value\":\"\"},\"Base Currency\":{\"context\":\"NA\",\"value\":\"NA\"},\"principalFixedThresholdType\":{\"context\":\"NA\",\"value\":\"fixed\"},\"Rounding -- Delivery\":{\"context\":\"NA\",\"value\":\"up\"},\"settlementDateAbbriviated\":{\"context\":\"NA\",\"value\":\"NA\"},\"calcRule\":{\"context\":\"NA\",\"value\":\"First of the Month\"},\"Principal Fixed Rounding Amount\":{\"context\":\"NA\",\"value\":\"NA\"},\"Principal Minimum Transfer Amount Value\":{\"context\":\"NA\",\"value\":\"NA\"},\"applicable_to_both\":{\"context\":\"cash and bond agreement\",\"value\":\"false\"},\"frequency\":{\"context\":\"NA\",\"value\":\"DAILY\"},\"valuation_agent\":{\"context\":\"NA\",\"value\":\"NA\"},\"Counterparty Fixed Trigger Threshold Value\":{\"context\":\"NA\",\"value\":\"0\"},\"Principal Fixed Trigger Threshold Type\":{\"context\":\"NA\",\"value\":\"fixed\"},\"Counterparty Fixed Threshold Currency\":{\"context\":\"NA\",\"value\":\"NA\"},\"resolution_date\":{\"context\":\"NA\",\"value\":\"NA\"},\"valuation_percentage\":{\"context\":\"NA\",\"value\":\"100\"},\"interest_settlement_date\":{\"context\":\"NA\",\"value\":\"Same Day\"},\"Principal Minimum Transfer Amount Currency\":{\"context\":\"NA\",\"value\":\"NA\"},\"Principal Fixed Trigger Threshold Currency\":{\"context\":\"NA\",\"value\":\"NA\"},\"cptyFixedThresholdType\":{\"context\":\"NA\",\"value\":\"fixed\"},\"netting_MTM_And_IA\":{\"context\":\"NA\",\"value\":\"NET\"},\"compound_interest_calc\":{\"context\":\"NA\",\"value\":\"NA\"},\"enableInterestCalc\":{\"context\":\"NA\",\"value\":\"NA\"},\"fixedVal\":{\"context\":\"NA\",\"value\":\"TRUE\"},\"cash_only\":{\"value\":\"NA\"},\"Counterparty Fixed Rounding Amount Currency\":{\"context\":\"NA\",\"value\":\"NA\"},\"negative_interest\":{\"context\":\"NA\",\"value\":\"NA\"},\"Notification Time\":{\"context\":\"NA\",\"value\":\"NA\"},\"cptytriggertype\":{\"context\":\"NA\",\"value\":\"Fixed Values\"},\"Counterparty Fixed Rounding Amount\":{\"context\":\"NA\",\"value\":\"NA\"},\"Counter Party Minimum Transfer Amount Currency\":{\"context\":\"NA\",\"value\":\"NA\"},\"Counter Party Minimum Transfer Amount Value\":{\"context\":\"NA\",\"value\":\"NA\"},\"netting_Interest\":{\"context\":\"NA\",\"value\":\"Net\"},\"rehypothecation_flag\":{\"context\":\"NA\",\"value\":\"NA\"},\"assetName\":{\"context\":\"NA\",\"value\":\"NA\"},\"holiday_centre\":{\"context\":\"NA\",\"value\":\"NA\"},\"principaltriggertype\":{\"context\":\"NA\",\"value\":\"Fixed Values\"},\"resolution_time\":{\"context\":\"NA\",\"value\":\"NA\"},\"Principal Fixed Rounding Amount Currency\":{\"context\":\"NA\",\"value\":\"NA\"},\"Rating Method\":{\"context\":\"NA\",\"value\":\"Issue\"},\"Principal Fixed Trigger Threshold Value\":{\"context\":\"NA\",\"value\":\"0\"}}\r\n" + 
	//	"]";


 //JSONObject valuation_percentage =(JSONObject)jsonobj.get("valuation_percentage");
 //JSONObject json = new JSONObject(str);
// String dd=json.toString();
System.out.println(jsonobj.size());




 
 
// System.out.println(valuation_percentage.toJSONString());
         //   JSONArray valuation_percentage1 = (JSONArray) valuation_percentage.get("valuation_percentage");
            
          //  System.out.println(valuation_percentage1);
             
            //Iterate over employee array
          //  valuation_percentage.forEach( emp -> parseEmployeeObject( (JSONObject) emp ) );
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
	
		
		
	}
}

