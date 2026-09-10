package Heaps;
import java.util.*;
public class PriorityQueueStl {
    public static void main(String[] args) {
        PriorityQueue <Integer> pq = new PriorityQueue();
        pq.add(10);
        pq.add(20);
        pq.add(3);
        System.out.println(pq.peek());
       System.out.println(pq.poll());
        System.out.println(pq.size());
        System.out.println(pq.remove());
        System.out.println(pq);
        pq.add(15);  pq.add(4);
        pq.add(24);
        pq.add(67);
        pq.add(21);
        pq.add(36);

       for(int ele:pq){
           System.out.println(ele+" ");
       }

    }
}
