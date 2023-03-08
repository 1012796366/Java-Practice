package pc.hardware.harddisk;

public class HardDisk {
    private int amount;

    public HardDisk() { this.amount = 0; }
    public HardDisk(int amount) { this.amount = amount; }

    public void setAmount(int amount) { this.amount = amount; }
    public int getAmount() { return this.amount; }
}
