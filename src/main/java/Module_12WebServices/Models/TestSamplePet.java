package Module_12WebServices.Models;

import org.hamcrest.Matchers;
import org.junit.Test;
public class TestSamplePet {

    public static final MethodAPIStore API_STORE = new MethodAPIStore();

        @Test
        public void addOrderId() {
            API_STORE.createPet(new Order(22).status(Order.Status.approved).toString())
                .then()
                .body("id", Matchers.equalTo(22))
                .body("status", Matchers.equalTo("approved"))
                .statusCode(200);
        }
        @Test
        public void getOrderId() {
            API_STORE.getPetOrderId(22)
                .then()
                .statusCode(200);
        }

        @Test
        public void petStatusById() {
            API_STORE.petStatus("placed")
                .then()
                .statusCode(200);
        }

        @Test
        public void deleteOrderById(){
            API_STORE.deletePetOrderId(3)
                 .then()
                 .statusCode(200);
        }
}