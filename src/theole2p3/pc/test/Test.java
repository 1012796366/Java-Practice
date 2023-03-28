package theole2p3.pc.test;
import theole2p3.pc.PC;
import theole2p3.pc.hardware.cpu.CPU;
import theole2p3.pc.hardware.harddisk.HardDisk;

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
