package linearSearch;

public class Even {
    public static void main(String[] args) {
        int nums[] = {12,345,2,6,7896};
        System.out.println(FindNumber(nums));
    }

    static int FindNumber(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    static int digits(int num){
        if(num < 0){
            num = -num;
        }

        if(num == 0){
            return 1;
        }

        int count = 0;
        while(num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }
}
