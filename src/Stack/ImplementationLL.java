package Stack;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class Mystack{
    Node head;
    int len;
    int peek(){
        if(head==null) return -1;
        return head.data;
    }
    int pop() throws Exception {
        if (head == null) {
            throw new Exception("Stack Underflow");
        }
            return -1;
//        int x=head.data;
//        head=head.next;
//        return x;

        }

//
    void push(int ele){
        Node temp=new Node(ele);
        if(len==0){
            head=temp;
        }else{
            temp.next=head;
            head=temp;
        }
        len++;

    }
    int size(){
        return len;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
public class ImplementationLL {
    public static void main(String[] args) throws Exception {
//        stack.display();
//stack.pop();

        Mystack stack=new Mystack();
        stack.pop();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

stack.display();
stack.pop();
stack.display();
    }
}
