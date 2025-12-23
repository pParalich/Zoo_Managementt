package Main.example;

import Main.example.Entities.Customer;
import Main.example.Entities.RentalService;
import Main.example.Entities.Vehicle;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Mansur");
        Vehicle vehicle1 = new Vehicle("BMW");
        RentalService service1 = new RentalService(4);

        Customer customer2 = new Customer("Pitt");
        Vehicle vehicle2 = new Vehicle("Audi");
        RentalService service2 = new RentalService(1);

        System.out.println("Customer: " + customer1 +
                ", Vehicle: " + vehicle1 +
                ", " + service1);

        System.out.println("Customer: " + customer2 +
                ", Vehicle: " + vehicle2 +
                ", " + service2);
    }
}
