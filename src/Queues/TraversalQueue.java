package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class TraversalQueue {
    public static void display(Queue<Integer> q) {
        int n = q.size();
        for (int i = 1; i <= n; i++) {
            System.out.print(q.peek()+" ");
            q.add(q.remove());
    }
    System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1); q.add(2); q.add(3); q.add(4); q.add(5);
              display(q);
addAtIdx(q,2,60);
display(q);
        }

    private static void addAtIdx( Queue<Integer> q,int idx, int val) {
        if(idx<0||idx>q.size()){
            System.out.println("Index out of bounds");
            return;
        }
int n=q.size();
for (int i = 1; i <= idx; i++) {
    q.add(q.remove());
}
q.add(val);
for(int i=1;i<=n-idx;i++){
    q.add(q.remove());
}
    }
    private static int removeAtIdx(int idx) {
        return -1;
    }
    private static int peek(int idx) {
       return -1;
    }
}

