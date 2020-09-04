package Circus.Animal;

public class Duck extends Bird {
    @Override
    public String speak() {
        return "Quack Quack";
    }

    @Override
    public String toString() {
        return "I'm a Circus.Animal.Duck";
    }

    @Override
    public int getValue() {
        return 10;
    }

    public void swim() {
        System.out.println("I'm swimming...");
    }
}
