package Circus.Animal;

public abstract class Bird extends Animal {
    public void fly() {
        System.out.println("Whee ...");
    }

    public abstract int getValue();
}
