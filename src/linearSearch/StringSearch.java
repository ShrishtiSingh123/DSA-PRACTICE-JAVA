package linearSearch;

public class StringSearch {
    public static void main(String[] args) {
        String name="Shweat";
        char target='e';
        boolean ans= search(name,target);
        System.out.println(ans);

    }
    static boolean search(String name, char target) {
        if(name.length()==0){
            return false;
        }
        for (int i=0;i<name.length();i++){
            if(target==name.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
