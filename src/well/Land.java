package well;
public class Land {
    public static void main(String[] args) {
        Village vil1 = new Village(300, "张村");
        Village vil2 = new Village(200, "李村");

        System.out.print(Village.getWaterAmount() + '\n');
        // 要求通过实例对象 vil1 访问静态方法
        vil1.setWaterAmount(Village.getWaterAmount() + 200);
        // 下同理
        System.out.print(vil2.getWaterAmount() + '\n');
    }
}
