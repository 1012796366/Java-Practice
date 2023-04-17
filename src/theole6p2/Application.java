package theole6p2;
import java.util.Scanner;
import java.io.*;

public class Application {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            BufferedWriter fo = new BufferedWriter(new FileWriter("D:\\javagrade.txt"));
            BufferedReader fi = new BufferedReader(new FileReader("D:\\javagrade.txt"));
            int amount;
            int max = -999999;
            int min =  999999;
            int score;
            String student;
            System.out.print("录入成绩数量：\n");

            // 假设存储分数时不可排序，必须在读取时才可以排序
            // 如果直接在读取分数时就确定最高最低分，则只需要使用一次循环即可完成
            amount = reader.nextInt();
            reader.nextLine();
            for (int i = 0; i < amount; ++i) {
                System.out.printf("请录入第 %d 个学生的名字和分数%s：", i + 1, i == 0 ? "（先输名字后输分数，以空格作为名字和分数之间的分隔）" : "");
                student = reader.nextLine();
                fo.write(student + '\n');
            }
            fo.close();

            for (int i = 0; i < amount; ++i) {
                score = Integer.parseInt(fi.readLine().split(" ")[1]);
                System.out.println(score);
                if (score > max) {
                    max = score;
                }
                if (score < min) {
                    min = score;
                }
            }
            fi.close();

            System.out.printf("最高分：%d\n最低分：%d\n", max, min);
        } catch (FileNotFoundException e) {
            System.err.print("发生了文件读写错误：");
            System.err.print(e.getCause().getMessage());
        } catch (IOException e) {
            System.err.print("发生了 IO 操作错误：");
            System.err.print(e.getCause().getMessage());
        }
    }
}
