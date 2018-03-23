package remote;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Map;

public class Operator {


    public void getTotalMoneyByLocation(String location, Map<String, String> locationMap) {

        double total = 0;


        for (Map.Entry<String, String> m : locationMap.entrySet()) {
            if (m.getValue().equalsIgnoreCase(location)) {
                total += sendMoneyCall(m.getKey());
            }
        }
        System.out.println(total);

    }

    public void getCoinQuantity(String ID){
        String tURL = "http://192.168.88." + ID + ":8080/requestCoinAmount";
        UriComponentsBuilder builder = UriComponentsBuilder.
                fromUriString(tURL);

        RestTemplate restTemplate = new RestTemplate();

        String response = restTemplate.getForObject(builder.toUriString(), String.class);
        System.out.println(response);
    }

    public double sendMoneyCall(String ID) {

        String tURL = "http://192.168.88." + ID + ":8080/requestMoneyAmount";
        UriComponentsBuilder builder = UriComponentsBuilder.
                fromUriString(tURL);

        RestTemplate restTemplate = new RestTemplate();


        double response = restTemplate.getForObject(builder.toUriString(), double.class);
        System.out.println(response);
        return response;
    }

}
