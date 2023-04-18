package theole7p1;

public class Application {
    public static void main(String[] args) {
        Thread enChart = new Thread(new En());
        Thread grChart = new Thread(new Gr());
        enChart.start();
        grChart.start();
    }
}

class En extends Thread {
    public void run() {
        for (char ch = 'a'; ch != 'z' + 1; ++ch) {
            System.out.print(ch);
        }
    }
}

class Gr implements Runnable {
    public void run() {
        for (char ch = 'α'; ch != 'ω' + 1; ++ch) {
            System.out.print(ch);
        }
    }
}
