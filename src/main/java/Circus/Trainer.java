package Circus;

import Circus.Animal.Animal;
import Circus.Animal.Bird;
import Circus.Animal.Duck;

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck();
        getToSpeak(d);

        Bird b = (Bird)d;  // upcasting
        getToSpeak(b);

        Animal a = (Animal)b; // upcasting
        getToSpeak(a);

        Duck d2 = (Duck) a; // downcasting
        train(new Duck());
        // train(new Circus.Animal.Parrot());
        // Circus.Animal.Animal a2 = new Circus.Animal.Animal();
        // Circus.Animal.Bird b2 = new Circus.Animal.Bird();
    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {
        Duck d = (Duck) bird;
        d.swim();
    }
}
