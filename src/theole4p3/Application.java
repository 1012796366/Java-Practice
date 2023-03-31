package theole4p3;

public class Application {
    public static void main(String[] args) {
        ComputerWeight[] loads = new ComputerWeight[4];
        loads[0] = new WashMachine(45.7);
        loads[1] = new Computer(3.2);
        loads[2] = new Computer(1.7);
        loads[3] = new TV(22.5);
        Truck truck = new Truck(loads);
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
    private ComputerWeight[] loads;
    public Truck(ComputerWeight[] loads) { this.loads = loads; }
    public double computerWeight() {
        double total = 0.0;
        for (ComputerWeight elem : loads) {
            total += elem.computerWeight();
        }
        return total;
    }
}