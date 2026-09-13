package Maps_And_Sets;
import java.util.*;
public class Sets_STL {
    public static void main(String[] args) {
//       TreeSet<Integer> set = new TreeSet<>();
        HashSet<Integer> set = new HashSet<>();
       set.add(21);
       set.add(47);
       set.add(67);
       set.add(3);
       set.add(12);
       System.out.println(set.size());
       System.out.println(set.contains(3));
       set.remove(3);
       System.out.println(set.size());
       System.out.println(set);
    }
}
