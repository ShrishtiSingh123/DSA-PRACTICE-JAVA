package LinkedList;
class DNode {
    int val;
    DNode next;
    DNode prev;
    DNode (int val){
        this.val = val;
    }
        }
        class Dll{
DNode head;
DNode tail;
int size;
void insertAtHead(int val){
    DNode temp = new DNode(val);
   if(head==null){
       head=tail=temp;
   }else{
       temp.next=head;
       head.prev=temp;
       head=temp;
   }
   size++;
}
            void insertAtTail(int val){
                DNode temp = new DNode(val);
                if(head==null){
                    head=tail=temp;
                }else{
                    tail.next=temp;
                    temp.prev=tail;
                    tail=temp;
                }
                size++;
            }
            void Display(){
            DNode temp=head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
}
void displayReverse(){
    DNode temp=tail;
    while(temp!=null){
        System.out.print(temp.val+" ");
        temp=temp.prev;
    }
    System.out.println();
}
void insert(int idx,int val){
    if(idx<0||idx>size){
        System.out.println("Invalid index");
        return;
    }
    if(idx==0){
        insertAtHead(val);
        return;
    }
    if(idx==size){
        insertAtHead(val);
        return;
    }
    DNode a=new DNode(val);
    DNode temp=head;
    for(int i=0;i<idx-1;i++){
        temp=temp.next;
    }
    a.prev=temp;
    a.next=temp.next;
    a.next.prev=a;
    size++;
}
}
public class DoublyLL {
    public static void main(String[] args) {
      Dll list = new Dll();
      list.insertAtHead(1);
      list.insertAtHead(2);
      list.insertAtHead(3);
      list.insertAtHead(4);
      list.Display();
      list.insertAtTail(5);
      list.Display();
    }
}
