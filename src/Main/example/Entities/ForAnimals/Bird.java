package Main.example.Entities.ForAnimals;

import Main.example.Entities.Animal;

public class Bird extends Animal {
    public Bird(String name){
        super(name);
    }
    public void makeSound() {
        System.out.println(getName() + " says: Cheek-Cheereek!");
    }
}