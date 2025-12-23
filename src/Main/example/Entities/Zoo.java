package Main.example.Entities;

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
}
