package sg.edu.nus.iss.vttp5_ssf_day17l.service;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import sg.edu.nus.iss.vttp5_ssf_day17l.constant.Url;
import sg.edu.nus.iss.vttp5_ssf_day17l.model.Carpark;
import jakarta.json.Json;
import jakarta.json.JsonArray;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;

@Service
public class CarparkRestService {
    RestTemplate restTemplate = new RestTemplate();


    public List<Carpark> getCarparkList(){ //getforentity, getforobject, exchange
        ResponseEntity<String> carparkJsonStringEntity = restTemplate.getForEntity(Url.carparkUrl, String.class);
        String carparkJsonString = carparkJsonStringEntity.getBody();
        // or can just do responsebody straight away

        StringReader sr = new StringReader(carparkJsonString);
        JsonReader jsonReader = Json.createReader(sr);
        JsonObject jsonObject = jsonReader.readObject();

        JsonObject result = jsonObject.getJsonObject("result");
        JsonArray records = result.getJsonArray("records");


        List<Carpark> carparkList = new ArrayList<>();
        for (int i=0; i<records.size(); i++){
            JsonObject carparkEntry = records.getJsonObject(i);           
            Carpark carparki = new Carpark();
            carparki.setId(carparkEntry.getInt("_id"));
            carparki.setAddress(carparkEntry.getString("carpark"));
            carparki.setRegion(carparkEntry.getString("category"));
            carparki.setWeekdayRate1(carparkEntry.getString("weekdays_rate_1"));
            carparki.setWeekdayRate2(carparkEntry.getString("weekdays_rate_2"));
            carparki.setSaturdayRate(carparkEntry.getString("saturday_rate"));
            carparki.setSundayPublicHolRate(carparkEntry.getString("sunday_publicholiday_rate"));
            
            carparkList.add(carparki);
        }

        //System.out.println("\n\n\n\n\n\n\n" + carparkList.toString());
        return carparkList;

    }
}
