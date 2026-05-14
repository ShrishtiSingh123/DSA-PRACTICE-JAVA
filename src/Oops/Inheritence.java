package Oops;
class pokemon{
    String name;
    int speed;
}
class LegendaryPokemon extends pokemon{
   int strength;
   int agility;
   int intelligence;
}
public class Inheritence {
    public static void main(String[] args) {
        pokemon p1=new pokemon();
        LegendaryPokemon p2=new LegendaryPokemon();
        p2.strength=10;
        p2.agility=10;
    }


}
