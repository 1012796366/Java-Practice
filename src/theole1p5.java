/*
 * 5．编写一个Java应用程序，输出全部的希腊字母。
 * 提示：找到第一个希腊字母α在Unicode中的编码，最后一个希腊字母ω在Unicode中的编码。然后循环输出这个范围内所有的字符，就得到了希腊字母表
 */

public class theole1p5 {
    public static void main(String[] args) {
        for (int i = 945; i <= 969; ++i) {
            // 注释看题目提示即可
            System.out.printf("%c", (char)i);
        }
    }
}