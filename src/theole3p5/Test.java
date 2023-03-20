package theole3p5;
public class Test {
    public static void main(String[] args) {
        Circle c = new Circle(5.5);
        Rectangle r = new Rectangle(4.4, 5.5);
        Triangle t = new Triangle(3.0, 3.0);
        System.out.printf("圆形面积：%.2f\n矩形面积：%.2f\n三角形面积：%.2f\n", c.area(), r.area(), t.area());
    }
}

abstract class Figure {
    abstract double area();
}

class Circle extends Figure {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    double area() {
        return radius * radius * Math.PI;
    }
}

class Rectangle extends Figure {
    double length;
    double width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    double area() {
        return length * width;
    }
}

class Triangle extends Figure {
    double high;
    double bottom;
    Triangle(double high, double bottom) {
        this.high = high;
        this.bottom = bottom;
    }
    double area() {
        return (high * bottom) / 2;
    }
}
