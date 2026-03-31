package Pattern;

public class SideTriangle {
    public static void main(String[] args) {
drawTriangle(5);
    }
    static void drawTriangle(int n){
        for(int row=0;row<2*n;row++){
            int totalInRow=row>n?2*n-row:row;
            for (int col=0;col<totalInRow;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
