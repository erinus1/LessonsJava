package main.Modul_2;

public class Modul2Task5 {

    public static void main(String[] args) {

        int[] arr = {158, 207, 392, 62, 315, 434, 487, 268, 405, 241};
        int key = 315;

        int keyPositionInArray = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                keyPositionInArray = i;
                break;
            }
        }
        if (keyPositionInArray == -1) {
            System.out.println("No key");
        } else {
            System.out.println(keyPositionInArray);
        }
    }
}