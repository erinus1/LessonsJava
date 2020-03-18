package Module_12WebServices.Models;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(chain = true, fluent = true)
@Setter
@Getter
public class Order {
    private int id;
    private int petId;
    private int quantity;
    private String shipData;
    private Status status;
    private boolean complete;

    public enum Status {
        placed,
        approved,
        delivered
    }

    public Order(int id) {
        this.id = id;
        petId = id;
        quantity = 1;
        shipData = "2020-03-18T17:21:13.045Z";
        status = Status.placed;
        complete = true;
    }

    @Override
    public String toString() {
        return "{\r\n" +
                "  \"id\": " + id + ",\n" +
                "  \"petId\": " + petId + ",\n" +
                "  \"quantity\": " + quantity + ",\n" +
                "  \"shipDate\": \"" + shipData + "\",\n" +
                "  \"status\": \"" + status + "\",\n" +
                "  \"complete\": " + complete + "\n" +
                "}";
    }
}