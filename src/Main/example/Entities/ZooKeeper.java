package Main.example.Entities;

public class ZooKeeper {

    private String name;

    public ZooKeeper(String name) {
        this.name = name;
    }

    public String getModel() {
        return name;
    }

    public void setModel(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
