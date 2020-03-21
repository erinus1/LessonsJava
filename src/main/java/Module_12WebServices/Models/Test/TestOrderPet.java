package Module_12WebServices.Models.Test;

import Module_12WebServices.Models.MethodAPIStore;
import Module_12WebServices.Models.Order;
import net.thucydides.core.annotations.Title;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class TestOrderPet {
    public static final MethodAPIStore API_STORE = new MethodAPIStore();

    Order order8 = new Order(8).status(Order.STATUS.APPROVED);

    @Title("Positive test- check created order")
    @Test(priority = 0)
    public void petInventory() {
        API_STORE.petStatus()
                .then()
                .statusCode(200);
    }

    @Test(priority = 1)
    public void addOrderId() {
        API_STORE.createPet(order8.toString())
                .then()
                .body("id", Matchers.equalTo(order8.id()))
                .body("status", Matchers.equalTo(order8.status().toString().toLowerCase()))
                .statusCode(200);
    }

    @Test(priority = 2)
    public void getOrderId() {
        API_STORE.getPetOrderId(order8.id())
                .then()
                .statusCode(200);
    }

    @Test(priority = 3)
    public void deleteOrderById() {
        API_STORE.deletePetOrderId(order8.id())
                .then()
                .statusCode(200);
    }

    @Test(priority = 4)
    public void getDeletedOrderId() {
        API_STORE.getPetOrderId(order8.id())
                .then()
                .statusCode(404);
    }
    }