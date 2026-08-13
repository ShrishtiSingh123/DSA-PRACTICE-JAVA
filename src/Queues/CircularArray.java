package Queues;
class circularQueue {
    int [] arr;
    int f;
    int r;
    int size;
    circularQueue(int capacity) {
       arr=new int[capacity];
    }
    void add(int val) {
        if(size==arr.length){
            System.out.println("Overflow");
            return;
        }
        arr[r++]=val;
        if(r==arr.length) r=0;
         size++;
    }
    int remove() {
        if(size==0){
            System.out.println("Underflow");
            return -1;
        }
        int FrontVal=arr[f];
        f++;
        if(f==arr.length) f=0;
        size--;
        return FrontVal;
    }
    int peek() {
        if(size==0){
            System.out.println("Underflow");
        }
        return arr[f];
    }
    void display() {
        if(size==0){
            System.out.println("Underflow");
            return;
        }
        if(f>=r){
            for(int i=f;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            for(int i=0;i<r;i++){
                System.out.print(arr[i]+" ");
            }
        }
        else{
            for(int i=f;i<r;i++){
                System.out.print(arr[i]+" ");
            }
    }
System.out.println();
    }
}
public class CircularArray {
    public static void main(String[] args) {
      circularQueue q=new circularQueue(5);
      q.add(1); q.add(2); q.add(3); q.add(4); q.add(5);
      q.display();
      System.out.println(q.remove());
      q.display();
      q.add(60); q.add(70);
        q.display();
    }
}
