package Main.example.Entities;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Zoo {
    private int Zoo_Code;
    public Zoo(int Zoo_Code) {
        this.Zoo_Code = Zoo_Code;
    }

    public int getZoo_Code() {
        return Zoo_Code;
    }

    public void setServiceCode(int serviceCode) {
        this.Zoo_Code = serviceCode;
    }

    @Override
    public String toString() {
        return "Zoo code: " + Zoo_Code;
    }


    private List<Animal> animals = new ArrayList<>();
    public void addAnimal(Animal a){
        animals.add(a);
    }
    public void performCall(){
        for(Animal a : animals){
            a.makeSound();
        }
    }

    //Searching
    public Animal findAnimalByName(String name) {
        return animals.stream()
                .filter(a -> a.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null); // Возвращает null, если не найдено
    }
    //Filtering
    public List<Animal> getAnimalsByType(Class<?> clazz) {
        return animals.stream()
                .filter(clazz::isInstance)
                .collect(Collectors.toList());
    }
    //Sorting
    public List<Animal> getSortedAnimals() {
        return animals.stream()
                .sorted(Comparator.comparing(Animal::getName))
                .collect(Collectors.toList());
    }


}
