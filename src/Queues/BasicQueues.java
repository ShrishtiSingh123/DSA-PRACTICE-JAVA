package Queues;
import java.util.*;
public class BasicQueues {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q);
        q.remove();
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);

    }


}

