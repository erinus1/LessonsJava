package Module6_3;

class MainLink{

public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.add(18);
        list.add(45);
        list.add(65);
        list.deleteAt(0);
        list.showList();
        list.get(65);

    }
}
