package bonus2;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.io.*;

public class Application {
    public static void main(String[] args) throws IOException {
        BufferedReader input = null;
        BufferedWriter output = null;
        try {
            input = new BufferedReader(new FileReader("C:\\grade.txt"));
            output = new BufferedWriter(new FileWriter("C:\\sortgrade.txt"));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }
        List<subject> all_score = new ArrayList<>();
        String temp;
        String[] tempArr;
        while ((temp = input.readLine()) != null) {
            tempArr = temp.split(" ");
            all_score.add(new subject(tempArr[0], Integer.parseInt(tempArr[1])));
        }
        Collections.sort(all_score);

        int count = 0;
        for (subject elem : all_score) {
            ++count;
            // 想要不开文件就看到文件内容，直接去掉下一行代码的注释
            System.out.print(count + " " + elem.name + " " + elem.score + "\n");
            output.write(count + " " + elem.name + " " + elem.score + "\n");
        }
        input.close();
        output.close();
    }
}

class subject implements Comparable<subject> {
    public int score;
    public String name;
    public subject(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(subject o) {
        return Integer.compare(o.score, this.score);
        // o.score > this.score  ->  return 1
        // o.score < this.score  ->  return -1
        // o.score == this.score ->  return 0
    }
}