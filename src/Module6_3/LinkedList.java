package Module6_3;

public class LinkedList {

    Node head; //first element

    public void add(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null){
            head = node;
        }
        else{
            Node nod = head;
            while (nod.next != null){
                nod = nod.next;
            }
            nod.next = node;
        }
    }

    public void deleteAt(int index)
    {
        if(index==0)
        {
            head = head.next;
        }
        else
        {
            Node n = head;
            Node n1 = null;
            for(int i=0; i<index-1; i++)
            {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            n1 = null;
        }
    }

    public int get(int index){
        System.out.println("Get this index: " + index);
        return index;
    }

    public void showList()
    {
        Node node = head;
        while(node.next!=null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}
