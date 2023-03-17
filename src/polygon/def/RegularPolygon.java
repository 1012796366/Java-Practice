package polygon.def;
import java.lang.Math;
public class RegularPolygon {
    private int n;              // 多边形边数
    private double side;        // 长度
    private double x, y;        // 中心坐标
    public RegularPolygon() { this.n = 3; this.side = 1; }
    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }
    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
    }
    public void setN(int n) { this.n = n; }
    public int getN() { return this.n; }
    public void setSide(double side) { this.side = side; }
    public double getSide() { return this.side; }
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    public double getX() { return this.x; }
    public double getY() { return this.y; }
    public double getPerimeter() { return this.side * this.n; }
    public double getArea() { return (this.side * this.side * this.n) / (4 * Math.tan(Math.PI / this.n)); }

}
