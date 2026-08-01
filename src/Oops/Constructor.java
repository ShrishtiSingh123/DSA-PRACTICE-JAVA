package Oops;

public class Constructor {

    public static class Car {
        int seats;
        String name;
        double length;

        Car(int x, String s, double d) {
            seats = x;
            name = s;
            length = d;
        }

        void print() {
            System.out.println(name + " " + seats + " " + length);
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car(5, "Nano", 9.3);
        c1.print();
        Car c2 = new Car(7, "Neo", 9.4);
        c2.print();
    }
}