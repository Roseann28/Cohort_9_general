package Practice_Exam;

public class Expenditure {
    private double food,transport,health,shopping,rent;


    public static double total(double food, double transport, double health, double shopping, double rent){
        double totalamount=food+transport+health+shopping+rent;
        return totalamount;
    }

    public Expenditure(double food, double transport, double health, double shopping, double rent) {
        this.food = food;
        this.transport = transport;
        this.health = health;
        this.shopping = shopping;
        this.rent = rent;
    }

    public double getFood() {
        return food;
    }

    public void setFood(double food) {
        this.food = food;
    }

    public double getTransport() {
        return transport;
    }

    public void setTransport(double transport) {
        this.transport = transport;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getShopping() {
        return shopping;
    }

    public void setShopping(double shopping) {
        this.shopping = shopping;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    @Override
    public String toString() {
        return "Expenditure{" +
                "food=" + food +
                ", transport=" + transport +
                ", health=" + health +
                ", shopping=" + shopping +
                ", rent=" + rent +
                '}';
    }
}
