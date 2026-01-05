package Main.example.Entities.ForAnimals;

import Main.example.Entities.Animal;

public class Lion extends Animal {
    public Lion(String name){
        super(name);
    }
    public void makeSound() {
        System.out.println(getName() + " says: Raaar!");
    }
}
