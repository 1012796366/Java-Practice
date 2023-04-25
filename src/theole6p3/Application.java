package theole6p3;
import java.io.*;

public class Application {
    public static void main(String[] args) {
        try {
            BufferedReader input = new BufferedReader(new FileReader("src/theole6p3/score.txt"));
            BufferedWriter output = new BufferedWriter(new FileWriter("src/theole6p3/totalscore.txt"));
            String s;
            String score;
            String[] scr;

            while ((s = input.readLine()) != null) {
                scr = s.split("\\D+");
                score = Integer.toString(Integer.parseInt(scr[1]) + Integer.parseInt(scr[2]) + Integer.parseInt(scr[3]));
                output.write(s.substring(0, s.indexOf("，")) + "，总分" + score + "分。\n");
            }
            input.close();
            output.close();
        } catch (IOException e) {
            System.err.print("捕获异常！\n");
            e.printStackTrace(System.err);
        }
    }
}