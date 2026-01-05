package Main.example;


import Main.example.Entities.Animal;
import Main.example.Entities.Zoo;
import Main.example.Entities.ZooKeeper;

import Main.example.Entities.ForAnimals.Bird;
import Main.example.Entities.ForAnimals.Lion;
import Main.example.Entities.ForAnimals.Monkey;

public class Main {
    public static void main(String[] args) {

        Animal oor = new Bird("Oor");
        Animal simba = new Lion("Simba");
        Animal sergay = new Monkey("Sergay");

        Zoo myZoo = new Zoo(777);
        myZoo.addAnimal(oor);
        myZoo.addAnimal(simba);
        myZoo.addAnimal(sergay);

        ZooKeeper keeper = new ZooKeeper("Alikhan");
        keeper.setAssignedAnimal(simba);


        System.out.println("=== ZOO STATUS ===");
        System.out.println(myZoo);

        System.out.println("\n=== GENERAL ROLL-CALL ===");
        myZoo.performCall();

        System.out.println("\n=== THE WATCHER'S ACTION ===");
        keeper.feedAnimal();

        System.out.println("\n=== OPTIONAL ACTIONS ===");
        //Search
        System.out.println("Searching for Simba...");
        Animal found = myZoo.findAnimalByName("Simba");
        if (found != null) found.makeSound();
        //Sort
        System.out.println("\nAnimals sorted by name:");
        myZoo.getSortedAnimals().forEach(System.out::println);
        //Filter(for example only lions)
        System.out.println("\nAll Lions in the zoo:");
        myZoo.getAnimalsByType(Lion.class).forEach(l -> System.out.println("Lion: " + l.getName()));
    }
}