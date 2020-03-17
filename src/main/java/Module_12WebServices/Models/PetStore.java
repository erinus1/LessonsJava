package Module_12WebServices.Models;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class PetStore {

    public void createPet(){

    }

    public Response getPetOrderId(int id){
        return given()
                .spec(createBaseSpec())
                .pathParam("orderId", id)
                .when()
                .get(Config.pet_OrderId)
                .then()
                .extract()
                .response();
    }

    public Response petStatus(String status){
        return  given()
                .spec(createBaseSpec())
                .queryParam("status", status)
                .when()
                .get(Config.pet_Status)
                .then()
                .extract()
                .response();
    }

    public Response deletePetOrderId(int id) {
        return given()
                .spec(createBaseSpec())
                .pathParam("orderId", id)
                .when()
                .get(Config.pet_OrderId)
                .then()
                .extract()
                .response();
    }

    private static RequestSpecification createBaseSpec(){
        return RestAssured.given()
                .log().uri()
                .baseUri(Config.URL);
    }
}
