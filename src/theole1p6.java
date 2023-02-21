import java.util.Scanner;

public class theole1p6 {
    public static void main(String[] args) {
        Scanner inputVal = new Scanner(System.in);

        System.out.println("请输入整数n:");
        int endNum = inputVal.nextInt(), totalVal = 0;

        for (int i = 1; i <= Math.abs(endNum); ++i) {
            totalVal += i;
        }

        if (endNum < 0) {
            totalVal = - (totalVal - 1);
        }

        System.out.println(totalVal);
    }
}
