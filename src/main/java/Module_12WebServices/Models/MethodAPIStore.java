package Module_12WebServices.Models;

import Module_12WebServices.Models.EndPoints.EndPoints;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

public class MethodAPIStore {

    public Response createPet(String body){
        return given()
                .spec(createBaseSpec())
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .body(body)
                .post(EndPoints.new_OrderPet);
    }

    public Response getPetOrderId(int id){
        return given()
                .spec(createBaseSpec())
                .pathParam("orderId", id)
                .when()
                .get(EndPoints.pet_OrderId)
                .then()
                .extract()
                .response();
    }

    public Response petStatus(){
        return  given()
                .spec(createBaseSpec())
                .accept(ContentType.JSON)
                .when()
                .get(EndPoints.pet_Status)
                .then()
                .extract()
                .response();
    }

    public Response deletePetOrderId(int id) {
        return given()
                .spec(createBaseSpec())
                .pathParam("orderId", id)
                .when()
                .delete(EndPoints.pet_OrderId)
                .then()
                .extract()
                .response();
    }

    public static RequestSpecification createBaseSpec(){
        return RestAssured.given()
                .log().uri()
                .log().body()
                .baseUri(EndPoints.URL);
    }
}