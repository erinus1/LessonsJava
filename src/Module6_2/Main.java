package Module6_2;

public class Main {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
        Decode str = new Decode();

        // "3" => "3"
        //String res1 = str.decompress("3");
        // "3h" => "hhh"
        //String res2 = str.decompress("3h");
        // "3h\22b" => "hhh\2bb"
        String res3 = str.decompress("3h\\22b");

        //System.out.println("Test 1 = " + (res1.equals("3") ? true : res1));
        //System.out.println("Test 2 = " + (res2.equals("hhh") ? true : res2));
        System.out.println("Test 3 = " + (res3.equals("hhh\\2bb") ? true : res3));

    }
}
