package io.swagger.api;

import io.swagger.model.GetEnigmaStepResponse;
import io.swagger.model.JsonApiBodyRequest;
import io.swagger.model.JsonApiBodyResponseErrors;
import io.swagger.model.JsonApiBodyResponseSuccess;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-04T15:40:01.381-05:00[America/Bogota]")
@Controller
public class GetStepApiController implements GetStepApi {

    private static final Logger log = LoggerFactory.getLogger(GetStepApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    
    /* inicio actualizar */
    private JsonApiBodyResponseSuccess response;
    private List<JsonApiBodyResponseSuccess> listResponse;
    private List<GetEnigmaStepResponse> enigmas;
    private GetEnigmaStepResponse enigma;
    /* final actualizar */
    
    @org.springframework.beans.factory.annotation.Autowired
    public GetStepApiController(ObjectMapper objectMapper, HttpServletRequest request, 
    		
    		/* inicio actualizar */
    		List<GetEnigmaStepResponse> enigmas, 
    		GetEnigmaStepResponse enigma,
    		JsonApiBodyResponseSuccess response,
    		List<JsonApiBodyResponseSuccess> listResponse
    		/* final actualizar */
    		
    		) {
        this.objectMapper = objectMapper;
        this.request = request;
        
        /* inicio actualizar */
        this.enigmas = enigmas;
        this.enigma = enigma;
        this.response = response;
        this.listResponse = listResponse;
        /* final actualizar */
        
    }

    public ResponseEntity<List<JsonApiBodyResponseSuccess>> getStep(@ApiParam(value = "request body get enigma step" ,required=true )  @Valid @RequestBody JsonApiBodyRequest body) {
        String accept = request.getHeader("Accept");
        
        /* inicio actualizar */
        enigma.setAnswer("Abrir el refrigerador");
        enigmas.add(enigma);
        response.setData(enigmas);
        listResponse.add(response);
        /* final actualizar */
        
        return new ResponseEntity<>(listResponse, HttpStatus.NOT_IMPLEMENTED);/*Aqui esta el error, toca solucionarlo*/
    }

}
