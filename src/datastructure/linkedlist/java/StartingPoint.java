package datastructure.linkedlist.java;

public class StartingPoint {

    public static void main(String[] args) {

        //java.util.LinkedList
        //LinkedList list = new LinkedList();
        //list.add(5);

        // datastructure.linkedlist.java.LinkedList
        LinkedList list = new LinkedList();
        list.insertEnd(12);
        list.insertEnd(8);
        list.insertEnd(17);

        list.insertStart(5);
        list.insertStart(6);

        list.insertAt(22, 33);
        list.insertAt(404, 4);

        list.deleteAt(4);
        list.deleteAt(0);
        list.deleteAt(10);

        list.traverse();
    }
}
