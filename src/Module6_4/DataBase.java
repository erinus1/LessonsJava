package Module6_4;

import java.util.HashMap;

public class DataBase {
    HashMap<Passport, Citizen> dataBase;

    public DataBase(){
        dataBase = new HashMap<Passport, Citizen>();
    }

    public void add(Passport passport, Citizen citizen) {
        dataBase.put(passport, citizen);
    }
    public Citizen findBy(Passport passport) {
        return dataBase.get(passport);
    }

}
