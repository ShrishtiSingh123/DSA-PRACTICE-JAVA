package AssignmentArray;

public class Richest {
    public static void main(String[] args) {
int account [][]={
        {1,2,3},
        {3,2,1}
};
int result=maxwealth(account);
System.out.println(result);
    }
    public static int maxwealth(int accounts[][]){
        int max = 0;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}
