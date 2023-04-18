package theole6p4;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        try {
            Scanner reader = new Scanner(System.in);
            RandomAccessFile input = new RandomAccessFile("D:/logo.png", "r");
            input.seek(reader.nextInt());
            System.out.print(input.read());
            input.close();
        } catch (IOException e) {
            System.err.print("捕获异常！\n");
            e.printStackTrace();
        }
    }
}
