package Stack;

import java.util.Stack;

public class BasicSTL {
    public static void main(String[] args) {
       Stack<String> st = new Stack<>();
       st.push("a");
       st.push("b");
       st.push("c");
       st.push("d");
       System.out.println(st.size());
       System.out.println(st);
       System.out.println( st.pop());
    }
}
