package well;
public class Land {
    public static void main(String[] args) {
        Village vil1 = new Village(300, "张村");
        Village vil2 = new Village(200, "李村");

        System.out.println(Village.getWaterAmount());
        vil1.setWaterAmount(Village.getWaterAmount() + 200);
        System.out.println(vil2.getWaterAmount());
    }
}
