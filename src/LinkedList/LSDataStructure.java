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
int search(int value) {
        if (head == null)
            return-1;
        LNode temp=head;
        int idx=0;
        while (temp.next != null) {
            if(temp.value==value) return idx;
            temp=temp.next;
            idx++;
        }
        return -1;
    }

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

    public void insert(int val, int idx) {
     LNode temp = null;
        if (idx < 0 || idx > size) {
            System.out.println("Index out of bounds");
            return;
        } else if (idx == 0) addAtHead(val);
        else if (idx == size) addAtTail(val);
        else {
            temp = new LNode(val);
            temp.next = head;
            head = temp;
        }
        LNode t = new LNode(val);
        t.next = temp.next;
        temp.next = t;
        size++;
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
        ll.insert(5,2); ll.display();
    }
}