package Oops;

class Fraction {
    int num;
    int dem;

    Fraction(int num, int dem) {
        this.num = num;
        this.dem = dem;
    }

    void print() {
        System.out.println(num + " /" + dem);
    }

    public void add(Fraction f) {
        num = num * f.dem + dem * f.num;
        dem = dem * f.dem;
    }

    public void divide(Fraction f) {
        num = num * f.dem;
        dem = dem * f.num;
    }
    void simplify(){
int gcd=hcf (num,dem);
num=num/gcd;
dem=dem/gcd;
    }
    int hcf(int a, int b){
        if(a==0) return b;
        return hcf(a%b,a);
    }
}
public class MainClass {
    public static void main(String args[]){
       Fraction f1=new Fraction(6,9);
       f1.print();
       Fraction f2=new Fraction(8,4);
       f1.add(f2);
       f1.print();
       Fraction f3=new Fraction(10,20);
       f3.simplify();
       f3.print();
    }

}

