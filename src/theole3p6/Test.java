package theole3p6;
public class Test {
    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        simulator.playSound(new Dog("藏獒"));
        simulator.playSound(new Cat("加菲猫"));
    }
}

abstract class Animal {
    abstract void cry();
    abstract String getAnimalName();
}

class Dog extends Animal {
    String name;
    Dog(String name) {
        this.name = name;
    }
    void cry() {
        System.out.printf("%s汪汪叫\n", name);
    }
    String getAnimalName() {
        return name;
    }
}

class Cat extends Animal {
    String name;
    Cat(String name) {
        this.name = name;
    }
    void cry() {
        System.out.printf("%s喵喵叫\n", name);
    }
    String getAnimalName() {
        return name;
    }
}

class Simulator {
    void playSound(Animal animal) {
        animal.cry();
    }
}