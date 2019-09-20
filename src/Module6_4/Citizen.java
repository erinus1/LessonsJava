package Module6_4;

public class Citizen {
    String firstName;
    String lastName;

    public Citizen (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String sayYourName() {
        return firstName + " " + lastName;
    }
}
