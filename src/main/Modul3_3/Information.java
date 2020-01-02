package main.Modul3_3;

public class Information extends Employee {

    Information() {
        setIDRandom();
    }

    Information(String n, String s, String st) {
        this.name = n;
        this.surname = s;
        this.status = st;
        setIDRandom();
    }
}