package LinkedList;

class LNode {
    int value;
    LNode next;

    LNode(int value) {
        this.value = value;
    }
}

class LinkedList {

    LNode head;
    LNode tail;
    int size;

    void addAtHead(int value) {
        LNode temp = new LNode(value);

        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void addAtTail(int value) {
        LNode temp = new LNode(value);

        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void deleteAtHead() {
        if (head == null)
            return;

        head = head.next;

        if (head == null)
            tail = null;
        size--;
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        LNode temp = head;

        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

public class LSDataStructure {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.addAtTail(88);
        ll.display();

        ll.addAtTail(89);
        ll.display();

        ll.addAtTail(90);
        ll.display();

        ll.addAtTail(91);
        ll.display();

        ll.addAtHead(11);
        ll.display();

        ll.deleteAtHead();
        ll.display();
        System.out.println(ll.size);
    }
}