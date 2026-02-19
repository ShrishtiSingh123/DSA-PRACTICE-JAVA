package linearSearch;
import java.util.Arrays;
public class stringarray {
    public static void main(String[] args) {
        String name="Shweta";
        char target='e';
        System.out.println(Arrays.toString(name.toCharArray()) );
    }
    static boolean search(String name,char target){
        if(name.length()==0){
            return false;
        }
        for(char c:name.toCharArray()){
            if(c==target){
                return true;
            }

        }
       return false;


    }
}
