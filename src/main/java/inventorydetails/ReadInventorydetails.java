package inventorydetails;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ReadInventorydetails
{
    public static void main(String[] args)
    {

        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("inventorydetails.json"))
        {

            Object obj = jsonParser.parse(reader);

            JSONArray inventoryList = (JSONArray) obj;
            System.out.println(inventoryList);


            inventoryList.forEach( det -> parseDetailsobject( (JSONObject) det ) );

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }



    private static void parseDetailsobject(JSONObject det)
    {
        JSONObject Detailsobject = (JSONObject) det.get("Details");


        String firstName = (String) Detailsobject.get("Name");
        System.out.println(firstName);


        String lastName = (String) Detailsobject.get("weight in kg");
        System.out.println(lastName);


        String website = (String) Detailsobject.get("perkg price");
        System.out.println(website);
    }
}
