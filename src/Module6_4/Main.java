package Module6_4;

public class Main {

    public static void main(String[] args) {
        DataBase dataBase = new DataBase();

        Passport passport = new Passport("EH", 0567);
        Citizen citizen = new Citizen("Petr","Petrov");

        dataBase.add(passport, citizen);

        Citizen first = dataBase.findBy(passport);

        if (first != null) {
            System.out.println(first.sayYourName());
        }

        Passport fakePass = new Passport("EH", 0567);

        Citizen second = dataBase.findBy(fakePass);

        if (second != null) {
            System.out.println(second.sayYourName());
        }
    }
}
