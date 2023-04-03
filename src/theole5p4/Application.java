package theole5p4;
import java.util.regex.*;

public class Application {
    public static void main(String[] args) {
        String input =
                "忘记密码，不要惊慌失错，请登陆http://www.upc.edu.cn或登陆http://computer.upc.edu.cn，我们完美的为您解决问题。";
        String regex1 = "登陆";
        String regex2 = "惊慌失错";

        Pattern p1 = Pattern.compile(regex1);
        Pattern p2 = Pattern.compile(regex2);
        Matcher m;

        m = p1.matcher(input);
        for (int i = 0; m.find(); ++i) {
            System.out.printf("第 %d 个将登录写为登录的错误位置索引为 %d\n", i + 1, m.start());
        }

        m = p2.matcher(input);
        for (int i = 0; m.find(); ++i) {
            System.out.printf("第 %d 个将惊慌失措写为惊慌失错的错误位置索引为 %d\n", i + 1, m.start());
        }

        // 修复字符串
        input = input.replaceAll(regex1, "登录").replaceAll(regex2, "惊慌失措");
        System.out.printf("替换后的字符串为：\n%s", input);
    }
}
