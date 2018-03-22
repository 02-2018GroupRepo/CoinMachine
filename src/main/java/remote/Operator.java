package remote;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.ArrayList;

public class Operator {

public void getTotalMoneyByLocation(String location){

    String tURL = "http://192.168.88.167:8080/requestAmount";
    UriComponentsBuilder builder = UriComponentsBuilder.
            fromUriString(tURL);

    RestTemplate restTemplate = new RestTemplate();


    String response = restTemplate.getForObject(builder.toUriString(), String.class);
}
}
