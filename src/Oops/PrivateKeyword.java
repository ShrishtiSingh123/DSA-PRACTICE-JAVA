package Oops;
class Student {
    String name;
    private int  rollNo;
    double cgpa;
void print(){
    System.out.println(name+" "+rollNo+" "+cgpa);
}
}

public class PrivateKeyword {
    public static void main(String[] args) {
Student s1=new Student();
s1.cgpa=5.5;
// s1.rollNo=12;
 s1.print();
    }
}
