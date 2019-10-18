package datastructure.linkedlist.java;

class LinkedList {
    private Node head;

    void insertEnd(int data) {
        Node newNode = new Node();
        newNode.data = data;
        //newNode.next = null   // by default newNode.next will be null

        if (head == null) {
            head = newNode;
        } else {
            Node node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = newNode;
        }
    }

    void insertStart(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }

    void insertAt(int data, int index) {
        if (index == 0 || head == null) {
            insertStart(data);
            return;
        }

        Node newNode = new Node();
        newNode.data = data;

        //int tempIndex = 0;
        Node tempNode = head;

        /*while (tempIndex != index && tempNode.next != null) {
            tempIndex++;

            if (tempIndex != index) {
                tempNode = tempNode.next;
            }
        }*/

        for (int i = 0; i < index - 1; i++) {
            if (tempNode == null) {
                System.out.println("Invalid index");
                return;
            }
            tempNode = tempNode.next;
        }

        newNode.next = tempNode.next;
        tempNode.next = newNode;
    }

    void deleteAt(int index) {
        if (head == null) {
            System.out.println("We don't have node, So can not perform delete operation ");
            return;
        }
        Node temp = head;
        if (index == 0) {
            head = head.next;
            temp = null;
            return;
        }
        for (int i = 0; i < index - 1; i++) {
            if (temp == null) {
                System.out.println("Invalid delete operation");
                return;
            }
            temp = temp.next;
        }
        Node nextTemp = temp.next;
        temp.next = nextTemp.next;
        nextTemp = null;
    }

    void traverse() {
        Node node = head;
        int index = 0;
        while (node.next != null) {
            System.out.println(index + ", " + node.data);
            node = node.next;
            index++;
        }
        System.out.println(index + ", " + node.data);
    }
}
