package polygon.test;
import polygon.def.RegularPolygon;
public class Test {
    public static void main(String[] args) {
        RegularPolygon rp1 = new RegularPolygon();
        RegularPolygon rp2 = new RegularPolygon(6, 4);
        RegularPolygon rp3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.print("第1个多边形周长：" + rp1.getPerimeter() + "\n第1个多边形面积：" + rp1.getArea() + '\n');
        System.out.print("第2个多边形周长：" + rp2.getPerimeter() + "\n第2个多边形面积：" + rp2.getArea() + '\n');
        System.out.print("第3个多边形周长：" + rp3.getPerimeter() + "\n第3个多边形面积：" + rp3.getArea() + '\n');
    }
}
