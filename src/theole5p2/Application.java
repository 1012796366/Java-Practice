package theole5p2;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("编码最大的字符：" + charProcessor.proceed(reader.nextLine()));
    }
}

class charProcessor {
    static char proceed(String input) {
        char max = input.charAt(0);
        for (int i = 1; i < input.length(); ++i) {
            if (input.charAt(i) > max) {
                max = input.charAt(i);
            }
        }
        return max;
    }
}