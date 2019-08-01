package src.Modul3_3;

import java.util.Random;

public class Information extends Employee {


    Information() {
        id = random.nextInt(100);
    }

    Information(String n, String s, String st) {
        this.name = n;
        this.surname = s;
        this.status = st;

    }
}

