/*
 * 9．编写一个Java应用程序，实现下列功能：
 *  （1）程序随机分配给客户一个1~100之间的整数。
 *  （2）用户输入自己的猜测。
 *  （3）程序返回提示信息，提示信息分别是"猜大了"、"猜小了"或"猜对了"。
 *  （4）用户可根据提示信息再次输入猜测，直到提示信息是"猜对了"。
 */
import java.util.Scanner;
import java.util.Random;

public class theole1p9 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random randGen = new Random();
        int ans = randGen.nextInt(100) + 1;         // 生成随机数
        int inp;                                           // 存储猜想数

        System.out.println("给你一个 1 ~ 100 的整数，请输入你对这个数的猜测值");

        do {

            // 读取输入
            inp = reader.nextShort();

            if (inp > ans) {
                System.out.println("猜的值大了，再尝试猜一个");
            }
            else if (inp < ans) {
                System.out.println("猜的值小了，再尝试猜一个");
            }

        } while(inp != ans);

        System.out.println("你猜对了！");
    }
}
