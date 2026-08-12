package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
public class ReverseQueue {
    public static void main(String[] args) {

    }
    public  Queue<Integer> reverse(Queue<Integer> q) {
        // code here
Stack<Integer> st=new Stack<>();
    while(q.size()>0){
  st.push(q.remove());
    }
    while(st.size()>0){
        q.add(st.pop());
    }
    return q;
    }
}
