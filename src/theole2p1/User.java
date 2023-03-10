package theole2p1;
public class User {
    public static void main(String[] args) {
        Vehicle car1, car2;
        car1 = new Vehicle(40.0, 102);
        car2 = new Vehicle();

        car1.setPower(128);
        car2.setPower(76);
        System.out.printf("car1的功率是：%d\n", car1.getPower());
        System.out.printf("car2的功率是：%d\n", car2.getPower());
        car1.speedUp(80);
        car2.speedUp(80);
        System.out.printf("car1目前的速度：%f\n", car1.getSpeed());
        System.out.printf("car2目前的速度：%f\n", car2.getSpeed());
        car1.speedDown(10);
        car2.speedDown(20);
        System.out.printf("car1目前的速度：%f\n", car1.getSpeed());
        System.out.printf("car2目前的速度：%f\n", car2.getSpeed());
    }
}
