package pc;
import pc.hardware.cpu.CPU;
import pc.hardware.harddisk.HardDisk;

public class PC {
    private CPU cpu;
    private HardDisk HD;

    public PC() {
        this.cpu = new CPU();
        this.HD = new HardDisk();
    }
    /*
    public PC(int speed, int amount) {
        this.cpu = new CPU(speed);
        this.HD = new HardDisk(amount);
    }
    */
    public PC(CPU cpu, HardDisk HD){
        this.cpu = new CPU(cpu);
        this.HD = new HardDisk(HD);
    }
    public PC(PC pc) {
        this.cpu = new CPU(pc.cpu);
        this.HD = new HardDisk(pc.HD);
    }

    public void setCPU(CPU cpu) { this.cpu.setSpeed(cpu.getSpeed()); }
    public void setHardDisk(HardDisk HD) { this.HD.setAmount(HD.getAmount()); }
    public void show() { System.out.println("CPU速度：" + this.cpu.getSpeed() + "\n硬盘容量：" + this.HD.getAmount()); }

}
