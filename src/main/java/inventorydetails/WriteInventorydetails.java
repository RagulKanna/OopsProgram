package inventorydetails;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class WriteInventorydetails
{
    @SuppressWarnings("unchecked")
    public static void main( String[] args )
    {

        JSONObject Details = new JSONObject();
        Details.put("Name", "Rice");
        Details.put("weight in kg", "10");
        Details.put("perkg price", "50");

        JSONObject Detailsobject = new JSONObject();
        Detailsobject.put("Details", Details);


        JSONObject Details2 = new JSONObject();
        Details2.put("Name", "Pulses");
        Details2.put("weight in kg", "15");
        Details2.put("perkg price", "30");

        JSONObject Detailsobject2 = new JSONObject();
        Detailsobject2.put("Details", Details2);


        JSONObject Details3 = new JSONObject();
        Details3.put("Name", "wheat");
        Details3.put("weight in kg", "30");
        Details3.put("perkg price", "45");

        JSONObject Detailsobject3 = new JSONObject();
        Detailsobject3.put("Details", Details3);


        JSONArray inventoryList = new JSONArray();
        inventoryList.add(Detailsobject);
        inventoryList.add(Detailsobject2);
        inventoryList.add(Detailsobject3);


        try (FileWriter file = new FileWriter("inventorydetails.json")) {

            file.write(inventoryList.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
