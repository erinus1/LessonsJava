package Module_12WebServices.Models;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Matcher;

public class TestSamplePet {

    public static final PetStore PET_STORE = new PetStore();

    /*
    @Test
    public void addOrderId() {
         String bodyRequest = "{\r\n" + "  \"id\": 2,\n" +
                 "  \"petId\": 1,\n" +
                 "  \"quantity\": 4,\n" +
                 "  \"shipDate\": \"2020-03-15T16:24:53.088+0000\",\n" +
                 "  \"status\": \"placed\",\n" +
                 "  \"complete\": true\n" +
                 "}";

         given().spec(PetStore.createBaseSpec())
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .body(bodyRequest)
                .post(Config.new_OrderPet)
                .then()
                .body("id", Matchers.equalTo(2));
    }

     */

    @Test
    public void getOrderId() { 
        PET_STORE.getPetOrderId(2);
        given()
                .then()
                .statusCode(200);
    }

        @Test
        public void petStatusById() {
            PET_STORE.petStatus("placed")
                    .then()
                    .statusCode(200);
        }

        @Test
        public void deleteOrderById(){
            PET_STORE.deletePetOrderId(3)
                    .then()
                    .statusCode(200);
    }
}
