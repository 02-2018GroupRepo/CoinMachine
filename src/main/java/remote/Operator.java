package remote;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Map;

public class Operator {

public void getTotalMoneyByLocation(String location, Map<String, String> locationMap){

    double total = 0;

    for(Map.Entry<String, String> m : locationMap.entrySet()){
        if(m.getValue().equals(location)){
            total += sendMoneyCall(m.getKey());
        }
    }


}

private double sendMoneyCall(String ID){

    String tURL = "http://192.168.88."+ ID + ":8080/requestAmount";
    UriComponentsBuilder builder = UriComponentsBuilder.
            fromUriString(tURL);

    RestTemplate restTemplate = new RestTemplate();


    double response = restTemplate.getForObject(builder.toUriString(), double.class);
    return response;
}
}
