package com.restaurantapp.RestaurantApp.Bestelling;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BestellingControllerIntegrationTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    //@Test
    //public void getSingleTest(){

    //   ResponseEntity<Bestelling> response = testRestTemplate.getForEntity("http://localhost:8080/api/v1/orders/1", Bestelling.class);

    //    assertFalse(response.getBody().isComplete);
    //    assertFalse(response.getBody().isComplete);
    //    assertFalse(response.getBody().isComplete);
    //    assertFalse(response.getBody().isComplete);

    //}
}
