package pc.hardware.cpu;

public class CPU {
    private int speed;

    public CPU() { this.speed = 0; }
    public CPU(int speed) { this.speed = speed; }

    public void setSpeed(int speed) { this.speed = speed; }
    public int getSpeed() { return this.speed; }
}
