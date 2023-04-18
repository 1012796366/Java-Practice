package theole7p2;

public class Application {
    public static void main(String[] args) {
        chTable solution = new chTable();
        solution.En.start();
        solution.Gr.start();
    }
}

class chTable implements Runnable {
    public Thread En;
    public Thread Gr;
    chTable() {
        En = new Thread(this);
        Gr = new Thread(this);
    }
    public synchronized void run() {
        if (Thread.currentThread() == Gr) {
            // Greek
            for (char ch = 'α'; ch != 'ω' + 1; ++ch) {
                System.out.print(ch);
            }
            System.out.print("\n");
        }
        if (Thread.currentThread() == En) {
            // English
            for (char ch = 'a'; ch != 'z' + 1; ++ch) {
                System.out.print(ch);
            }
            System.out.print("\n");
        }
    }
}