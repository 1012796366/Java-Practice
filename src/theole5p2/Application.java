package theole5p2;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.printf("编码最大的字符：%c", charProcessor.getMAX(reader.nextLine()));
    }
}

class charProcessor {
    static char getMAX(String input) {
        char max = input.charAt(0);
        for (int i = 1; i < input.length(); ++i) {
            if (input.charAt(i) > max) {
                max = input.charAt(i);
            }
        }
        return max;
    }
}