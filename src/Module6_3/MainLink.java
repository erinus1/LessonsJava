package Module6_3;

class MainLink{

public static void main(String[] args) {

    LinkList theLinkedList = new LinkList();
    // Insert Link and add a reference to the book Link added just prior
    // to the field next


        theLinkedList.insertFirstLink("1. Don Quixote", 500);
        theLinkedList.insertFirstLink("2. A Tale of Two Cities", 200);
        theLinkedList.display();

        System.out.println("Value of first in LinkedList " + theLinkedList.firstLink + "\n");
        // Removes the last Link entered
        theLinkedList.removeFirst();
        theLinkedList.display();

        System.out.println(theLinkedList.find("2. A Tale of Two Cities").bookName + " Was Found");

        System.out.println("delete is" + theLinkedList.removeLink("Don Quixote")) ;

        theLinkedList.display();

        }
}
