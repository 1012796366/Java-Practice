package pc.hardware.harddisk;

public class HardDisk {
    private int amount;

    public HardDisk() { this.amount = 0; }
    public HardDisk(int amount) { this.amount = amount; }
    public HardDisk(HardDisk HD) { this.amount = HD.amount; }

    public void setAmount(int amount) { this.amount = amount; }
    public int getAmount() { return this.amount; }
}
