package co.com.ortega1.microservice.resolveEnigmaApi.api;

import co.com.ortega1.microservice.resolveEnigmaApi.model.JsonApiBodyRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GetStepApiControllerIntegrationTest {

    @Autowired
    private GetStepApi api;

    @Test
    public void getStepTest() throws Exception {
        ResponseEntity<String> responseEntity = api.getStepString();
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals("Abrir el refrigerador", responseEntity.getBody());
    }
}
