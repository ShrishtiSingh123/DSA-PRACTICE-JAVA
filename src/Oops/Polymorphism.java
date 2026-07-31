package Oops;

public class Polymorphism {
    public static class Dog{
        void speak(){
            System.out.println("Dog speak");
        }
    }
    public static class Cat{
void speak(){
        System.out.println("Cat speak");
    }
    }
    public static class Lion{
void speak(){
        System.out.println("Lion speak");
}}
public static class human{
    void speak(){
        System.out.println("hello");
    }
}

    public static void main(String[] args) {
    Dog d=new Dog();
    Cat c=new Cat();
    human h=new human();
    d.speak();
    c.speak();
    h.speak();
    }
}
