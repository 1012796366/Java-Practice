package theole4p2;
import java.util.LinkedList;
import java.lang.Double;

public class Application {
    public static void main(String[] args) {
        Gymnastics gym = new Gymnastics();
        gym.addScore(3.0);
        gym.addScore(2.00);
        gym.addScore(12.00);
        System.out.printf("%.3f\n", gym.getAverage());
        School hell = new School();
        hell.getAverage();
        hell.addScore(3.0);
        hell.addScore(2.00);
        hell.addScore(6.00);
        System.out.printf("%.3f\n", hell.getAverage());
    }
}

// 接口
interface ComputerAverage {
    double getAverage();
}

class Gymnastics implements ComputerAverage {
    private LinkedList<Double> scoreList;
    public Gymnastics() { scoreList = new LinkedList<>(); }
    public void addScore(Double score) { scoreList.add(score); }
    public void addScore(double score) { scoreList.add(score); }
    public double getAverage() {
        // 当没有打分
        if (scoreList.size() == 0) { return 0.0; }

        double total = 0.0;
        double max = scoreList.getFirst();
        double min = scoreList.getFirst();
        int num = 0;
        for (double elem : scoreList) {
            total += elem;
            // 记录最大最小得分
            if (elem > max) { max = elem; }
            else if (elem < min) { min = elem; }
            ++num;
        }
        // 移除最大最小得分
        num -= 2;
        if (num <= 0) {
            // 只有两组或者一组打分，也许按理来说不该发生
            num += 2;
        } else {
            // 超过两组打分，那就正常排除最高最低分
            total -= max;
            total -= min;
        }
        return total / num;
    }
}

class School implements ComputerAverage {
    private LinkedList<Double> scoreList;
    public School() { scoreList = new LinkedList<>(); }
    public void addScore(Double score) { scoreList.add(score); }
    public void addScore(double score) { scoreList.add(score); }
    public double getAverage() {
        if (scoreList.size() == 0) { return 0.0; }
        double total = 0.0;
        for (double elem : scoreList) { total += elem; }
        return total / scoreList.size();
    }
}