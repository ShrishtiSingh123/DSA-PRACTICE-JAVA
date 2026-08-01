package Oops;
class ComplexNumber{
int x;
int y;
ComplexNumber(int x,int y){
this.x=x;
this.y=y;
}
void print(){
    if(y>=0)
System.out.println(x+" + "+y+" i");
    else System.out.println(x+" - "+(-y)+" i");
}

void add(ComplexNumber z) {
    z.x=8;
    this.x+=z.x;
    this.y+=z.y;
    }
    void multiply(ComplexNumber z) {
    x=x*z.x-y*z.y;
    y=y*z.y+z.x*z.x;
    }
}
public class Complex {
    public static void main(String[] args){
ComplexNumber z1=new ComplexNumber(1,-2);
ComplexNumber z2=new ComplexNumber(3,4);
z1.print();
z2.print();
z1.add(z2);
z2.print();
z1.print();
    }
}
