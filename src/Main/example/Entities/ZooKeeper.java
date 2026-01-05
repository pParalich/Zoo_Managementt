package Main.example.Entities;

public class ZooKeeper {

    private String name;

    public ZooKeeper(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    private Animal assignedAnimal;

    public void setAssignedAnimal(Animal animal) {
        this.assignedAnimal = animal;
    }

    public void feedAnimal (){
        if (assignedAnimal != null) {
            System.out.println(name + " feed animal named = ");
        }
    }
}
