package pc.test;
import pc.PC;
import pc.hardware.cpu.CPU;
import pc.hardware.harddisk.HardDisk;

public class Test {
    public static void main(String[] args) {
        HardDisk HD = new HardDisk(200);
        CPU cpu = new CPU(2200);
        PC pc = new PC();

        pc.setCPU(cpu);
        pc.setHardDisk(HD);
        pc.show();
    }
}
