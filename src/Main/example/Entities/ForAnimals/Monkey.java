package Main.example.Entities.ForAnimals;

import Main.example.Entities.Animal;

public class Monkey extends Animal {
    public Monkey(String name) {
        super(name);
    }
    public void makeSound() {
        System.out.println(getName() + " says: Ka-ching!");
    }
}
