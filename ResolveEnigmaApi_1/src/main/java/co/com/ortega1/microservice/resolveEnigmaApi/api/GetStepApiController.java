package co.com.ortega1.microservice.resolveEnigmaApi.api;

import co.com.ortega1.microservice.resolveEnigmaApi.model.JsonApiBodyRequest;
import co.com.ortega1.microservice.resolveEnigmaApi.model.JsonApiBodyResponseErrors;
import co.com.ortega1.microservice.resolveEnigmaApi.model.JsonApiBodyResponseSuccess;
import co.com.ortega1.microservice.resolveEnigmaApi.model.GetEnigmaStepResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-11T15:01:29.550-05:00[America/Bogota]")
@Controller
public class GetStepApiController implements GetStepApi {

    private final ObjectMapper objectMapper;
    private final HttpServletRequest request;

    public GetStepApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<JsonApiBodyResponseSuccess>> getStep(@Valid @RequestBody JsonApiBodyRequest body) {
        String accept = request.getHeader("Accept");

        JsonApiBodyResponseSuccess response = new JsonApiBodyResponseSuccess();
        List<GetEnigmaStepResponse> enigmas = new ArrayList<>();
        GetEnigmaStepResponse enigma = new GetEnigmaStepResponse();
        enigma.setAnswer("Abrir el refrigerador");
        enigmas.add(enigma);
        response.setData(enigmas);

        List<JsonApiBodyResponseSuccess> listResponse = new ArrayList<>();
        listResponse.add(response);

        return new ResponseEntity<>(listResponse, HttpStatus.OK);
    }

    public ResponseEntity<String> getStepString() {
    	try {
            String accept = request.getHeader("Accept");
            return new ResponseEntity<>("Abrir el refrigerador", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
