package theole4p3;
import java.util.LinkedList;

public class Application {
    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.load(new Computer(1.7));
        truck.load(new Computer(3.2));
        truck.load(new TV(22.5));
        truck.load(new WashMachine(45.7));
        System.out.printf("卡车装载货物重量：%.1f\n", truck.computerWeight());
    }
}

interface ComputerWeight {
    double computerWeight();
}

class TV implements ComputerWeight {
    private double weight;
    public TV(double weight) { this.weight = weight; }
    public double computerWeight() { return this.weight; }
}

class Computer implements ComputerWeight {
    private double weight;
    public Computer(double weight) { this.weight = weight; }
    public double computerWeight() { return this.weight; }
}

class WashMachine implements ComputerWeight {
    private double weight;
    public WashMachine(double weight) { this.weight = weight; }
    public double computerWeight() { return this.weight; }
}

class Truck implements ComputerWeight {
    private LinkedList<ComputerWeight> loads;
    public Truck() { loads = new LinkedList<>(); }
    public void load(ComputerWeight target) { loads.add(target); }
    public double computerWeight() {
        double total = 0.0;
        for (ComputerWeight elem : loads) {
            total += elem.computerWeight();
        }
        return total;
    }
}