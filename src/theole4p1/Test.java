package theole4p1;

public class Test {
    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        simulator.playSound(new Dog("藏獒"));
        simulator.playSound(new Cat("加菲猫"));
    }
}

class Simulator {
    public void playSound(Animal animal) { animal.cry(); }
}

// 接口
interface Animal {
    void cry();
    String getAnimalString();
}

class Dog implements Animal {
    private String name;
    public Dog() {}
    public Dog(String name) { this.name = name; }
    public void cry() { System.out.print("汪汪\n"); }
    public String getAnimalString() { return this.name; }
}

class Cat implements Animal {
    private String name;
    public Cat() {}
    public Cat(String name) { this.name = name; }
    public void cry() { System.out.print("喵喵\n"); }
    public String getAnimalString() { return this.name; }
}