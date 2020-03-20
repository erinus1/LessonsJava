package Module_12WebServices.Models;

import org.hamcrest.Matchers;
import org.junit.Test;


public class TestSamplePet {
    public static final MethodAPIStore API_STORE = new MethodAPIStore();

    Order order = new Order(8).status(Order.STATUS.APPROVED);

        @Test
        public void addOrderId() {
            API_STORE.createPet(order.toString())
                .then()
                .body("id", Matchers.equalTo(8))
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
                .body("status", Matchers.equalTo("placed"))
                .statusCode(200);
        }

        @Test
        public void deleteOrderById(){
            API_STORE.deletePetOrderId(22)
                 .then()
                 .statusCode(200);
        }
}