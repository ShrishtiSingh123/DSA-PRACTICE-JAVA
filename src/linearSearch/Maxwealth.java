package linearSearch;

public class Maxwealth {
    public static void main(String[] args) {
        int [][]account={
                {1,2,3},
                {4,5,6},
        };
int ans=maximumWealth(account);
System.out.println(ans);
    }

    public static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }

}
