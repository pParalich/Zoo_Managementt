package Main.example;

import Main.example.Entities.Animal;
import Main.example.Entities.Zoo;
import Main.example.Entities.ZooKeeper;

public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal("Monkey");
        ZooKeeper keeper1 = new ZooKeeper("Andrey");
        Zoo zoocode1 = new Zoo(4);

        Animal animal2 = new Animal("Zebra");
        ZooKeeper keeper2 = new ZooKeeper("Sergey");
        Zoo zoocode2 = new Zoo(1);

        System.out.println("Animal: " + animal1 +
                ", ZooKeeper: " + keeper1 +
                ", " + zoocode1);

        System.out.println("Customer: " + animal2 +
                ", Vehicle: " + keeper2 +
                ", " + zoocode2);
    }
}

