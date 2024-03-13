package co.com.ortega1.microservice.resolveEnigmaApi.api;

import co.com.ortega1.microservice.resolveEnigmaApi.model.JsonApiBodyRequest;
import co.com.ortega1.microservice.resolveEnigmaApi.model.JsonApiBodyResponseErrors;
import co.com.ortega1.microservice.resolveEnigmaApi.model.JsonApiBodyResponseSuccess;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-11T15:01:29.550-05:00[America/Bogota]")
@Api(value = "getStep", description = "the getStep API")
public interface GetStepApi {

    @ApiOperation(value = "Get one enigma step API", nickname = "getStep", notes = "Get one enigma step API", response = JsonApiBodyResponseSuccess.class, responseContainer = "List", tags={  })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "search results matching criteria", response = JsonApiBodyResponseSuccess.class, responseContainer = "List"),
        @ApiResponse(code = 424, message = "bad input parameter", response = JsonApiBodyResponseErrors.class, responseContainer = "List")
    })
    @RequestMapping(value = "/getStep", produces = {"application/json"}, method = RequestMethod.GET)
    ResponseEntity<List<JsonApiBodyResponseSuccess>> getStep(@ApiParam(value = "request body get enigma step" ,required=true )  @Valid @RequestBody JsonApiBodyRequest body);

    @ApiOperation(value = "Get one enigma step string API", nickname = "getStepString", notes = "Get one enigma step string API", response = String.class, tags={  })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "search results matching criteria", response = String.class),
        @ApiResponse(code = 424, message = "bad input parameter", response = JsonApiBodyResponseErrors.class)
    })
    @RequestMapping(value = "/getStepString", produces = {"application/json"}, method = RequestMethod.GET)
    ResponseEntity<String> getStepString();
}
