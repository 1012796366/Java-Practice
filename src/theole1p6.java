/*
 * 6．从键盘输入整数n，计算1~n的累加和并输出。
 */
import java.util.Scanner;

public class theole1p6 {
    public static void main(String[] args) {
        Scanner inputVal = new Scanner(System.in);      // 输入

        System.out.print("请输入整数n: ");
        int endNum = inputVal.nextInt(), totalVal = 0;

        // 执行相加，注意此处应当确保所输入的值 endNum 为正数，否则循环将出现问题
        for (int i = 1; i <= Math.abs(endNum); ++i) {
            totalVal += i;
        }

        // 如果输入的值 endNum 为负数，则相加时需要额外减一并给最终结果添上负号
        // 例如 -2 对应 1 0 -1 -2 而 2 对应 1 2 ，相比之下就是多了一个 1
        // 只要减去这个多出来的 1 并添上负号即可
        if (endNum < 0) {
            totalVal = 1 - totalVal;
        }

        System.out.printf("%d", totalVal);
    }
}
