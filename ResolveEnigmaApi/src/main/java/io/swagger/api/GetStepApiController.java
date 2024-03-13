package io.swagger.api;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GetStepApiController implements GetStepApi {

    public ResponseEntity<String> getStepString() {
        RestTemplate restTemplate = new RestTemplate();

        String service1Url = "http://localhost:8081/v1/getOneEnigma/getStepString";
        String service2Url = "http://localhost:8082/v1/getOneEnigma/getStepString";
        String service3Url = "http://localhost:8083/v1/getOneEnigma/getStepString";

        List<String> messages = new ArrayList<>();

        messages.addAll(getMessageFromService(restTemplate, service1Url));
        messages.addAll(getMessageFromService(restTemplate, service2Url));
        messages.addAll(getMessageFromService(restTemplate, service3Url));

        String concatenatedMessages = String.join(" ", messages);
        return ResponseEntity.ok(concatenatedMessages);
    }

    private List<String> getMessageFromService(RestTemplate restTemplate, String url) {
        List<String> messages = new ArrayList<>();

        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        if (response.getStatusCode().is2xxSuccessful()) {
            String message = response.getBody(); 
            messages.add(message);
        } else {
            // Handle error properly
        }

        return messages;
    }
}
