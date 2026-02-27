package BinarySearch;
public class CeilingChr {
    public static void main(String[] args) {
        char letter[]={'c','d','e','f','j','k'};
        char target= 'j';
        char ans=nextGreatestLetter(letter, target);
        System.out.println(ans);


    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] > target) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return letters[start%letters.length];
    }
}


