package theole4p5;

public class Application {
    public static void main(String[] args) {
        Goods SafeItem = new Goods(true, "背包");
        Goods Danger = new Goods(false, "炸药包");
        Machine checker = new Machine();
        try {
            checker.CheckBag(SafeItem);
            checker.CheckBag(Danger);
        } catch (DangerException ex) {
            ex.toShow();
        }
    }
}

class Goods {
    private boolean isDanger;
    private String name;
    public Goods(boolean isDanger, String name) {
        this.isDanger = isDanger;
        this.name = name;
    }
    public Goods() {}
    public void setIsDanger(boolean isDanger) { this.isDanger = isDanger; }
    public boolean isDanger() { return this.isDanger; }
    public void setName(String name) { this.name = name; }
    public String getName() { return this.name; }
}

class DangerException extends Exception {
    private String message;
    // public DangerException(String itemName) { message = itemName + "属于危险品\n"; }
    public DangerException() { message = "属于危险品\n"; }
    public void toShow() { System.err.print(message); }
}

class Machine {
    public void CheckBag(Goods item) throws DangerException {
        if (!item.isDanger()) {
            throw new DangerException();
        }
    }
}