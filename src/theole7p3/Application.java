package theole7p3;
import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Interactive solution = new Interactive();
        solution.screen.start();
        solution.keyboard.start();
    }
}

class target {
    private char ch = 'a';
    public char getChar() {
        return ch;
    }
    public void setChar(char ch) {
        this.ch = ch;
    }
}

class Interactive implements Runnable {
    private int score = 0;
    private final target ch;
    private final Scanner reader;
    private final Random generator;
    public Thread keyboard;
    public Thread screen;

    public Interactive() {
        keyboard = new Thread(this);
        screen = new Thread(this);
        reader = new Scanner(System.in);
        generator = new Random();
        ch = new target();
    }
    public void run() {
        if (Thread.currentThread() == keyboard) {
            String input;
            while (true) {
                input = reader.nextLine();
                synchronized (ch) {
                    if (input.equals("#")) {
                        System.exit(0);
                    }
                    if (input.equals(Character.toString(ch.getChar()))) {
                        ++score;
                        System.out.printf("输入正确，目前分数%d\n", score);
                        screen.interrupt();
                    } else {
                        --score;
                        System.out.printf("输入错误，目前分数%d\n", score);
                    }
                }
            }
        }
        if (Thread.currentThread() == screen) {
            while (true) {
                // 重置字符
                synchronized (ch) {
                    ch.setChar((char)(generator.nextInt(26) + 'a'));
                }
                System.out.printf("显示的字符：%c\n", ch.getChar());
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    // 擦除中断标志
                }
            }
        }
    }
}