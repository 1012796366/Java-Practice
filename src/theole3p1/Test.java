package theole3p1;

public class Test {
    public static void main(String[] args) {
        People original = new People(1.70, 60.0);
        ChinaPeople chinese = new ChinaPeople(1.69, 62.0);
        AmericanPeople american = new AmericanPeople(1.73, 70.0);
        BeijingPeople beijing = new BeijingPeople(1.74, 73.3);

        original.speakHello();
        chinese.averageHeight();
        chinese.chinaGongfu();
        american.averageWeight();
        american.americanBoxing();
        beijing.averageWeight();
        beijing.beijingOpera();
    }
}

class People {
    protected double height;
    protected double weight;
    public People(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }
    public void speakHello() {
        System.out.print("人类问候\n");
    }
    public void averageHeight() {
        System.out.printf("人类平均身高：%.2f m\n", height);
    }
    public void averageWeight() {
        System.out.printf("人类平均体重：%.1f kg\n", weight);
    }
}
class ChinaPeople extends People {
    public ChinaPeople(double height, double weight) {
        super(height, weight);
    }
    public void speakHello() {
        System.out.print("中国人说你好\n");
    }
    public void averageHeight() {
        System.out.printf("中国人平均身高：%.2f m\n", height);
    }
    public void averageWeight() {
        System.out.printf("中国人平均体重：%.1f kg\n", weight);
    }
    public void chinaGongfu() {
        System.out.print("中国人打中国功夫\n");
    }
}
class AmericanPeople extends People {
    public AmericanPeople(double height, double weight) {
        super(height, weight);
    }
    public void speakHello() {
        System.out.print("美国人说Hello\n");
    }
    public void averageHeight() {
        System.out.printf("美国人平均身高：%.2f m\n", height);
    }
    public void averageWeight() {
        System.out.printf("美国人平均体重：%.1f kg\n", weight);
    }
    public void americanBoxing() {
        System.out.print("美国人打拳击\n");
    }
}
class BeijingPeople extends ChinaPeople {
    public BeijingPeople(double height, double weight) {
        super(height, weight);
    }
    public void speakHello() {
        System.out.print("北京人说你好\n");
    }
    public void averageHeight() {
        System.out.printf("北京人平均身高：%.2f m\n", height);
    }
    public void averageWeight() {
        System.out.printf("北京人平均体重：%.1f kg\n", weight);
    }
    public void beijingOpera() {
        System.out.print("北京人唱戏曲\n");
    }
}