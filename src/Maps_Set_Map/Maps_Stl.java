package Maps_Set_Map;

import java.util.HashMap;

public class Maps_Stl {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        map.put("D",4);
        map.put("E",5);
//        System.out.println(map+" "+map.size());
//        map.remove("C");
//        System.out.println(map+" "+map.size());
//        System.out.println(map.get("A"));
//        map.put("D",4);
//        System.out.println(map+" "+map.size());
//        System.out.println(map.containsKey("D"));
        for(String key:map.keySet()) {
            System.out.println(key+" "+map.get(key));
        }

    }
}
