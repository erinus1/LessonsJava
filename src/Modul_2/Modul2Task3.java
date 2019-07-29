package src.Modul_2;

public class Modul2Task3 {

    public static void main(String[] args) {

        int year = 4;

        String[] zodiacs = {"monkey","rooster", "dog","pig", "rat" ,"ox",
                            "tiger","rabbit","dragon","snake", "horse", "sheep"};

        String[] colors = {"white", "black", "green", "red", "yellow"};

        int n = year % 12;

        String zodiac = zodiacs[n];
        String color = "";


        switch (year % 10){
            case 0:
            case 1:
                color = colors[0];
                break;
            case 2:
            case 3:
                color = colors[1];
                break;
            case 4:
            case 5:
                color = colors[2];
                break;
            case 6:
            case 7:
                color = colors[3];
                break;
            case 8:
            case 9:
                color = colors[4];
                break;
        }

        System.out.println("Your zodiac is: "  + color + " " + zodiac);

    }

}




