package theole6p5;
import java.io.*;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        try {
            Scanner reader = new Scanner(System.in);
            File picDelete = new File("C:/newFile/pic.jpg");
            File dirCheck = new File("D:/newFile");
            if (!dirCheck.exists() && !dirCheck.isDirectory()) {
                while (!dirCheck.mkdirs()) {
                    System.err.print("文件夹创建失败，请检查文件夹是否被占用或者是否拥有权限。\n");
                    System.out.print("是否重试创建文件夹？（Y/n）\n");
                    if (!reader.next().equals("Y")) {
                        System.exit(1);
                    }
                }
            }
            BufferedInputStream picInput = new BufferedInputStream(new FileInputStream("C:/newFile/pic.jpg"));
            BufferedOutputStream picOutput = new BufferedOutputStream(new FileOutputStream("D:/newFile/pic.jpg"));
            BufferedReader fileInput = new BufferedReader(new FileReader("C:/newFile/file.txt"));
            // 文本读取并显示
            String s;
            while ((s = fileInput.readLine()) != null) {
                System.out.print(s);
            }
            System.out.print("\n");
            fileInput.close();

            // 图片剪切
            int ch;
            while ((ch = picInput.read()) != -1) {
                picOutput.write(ch);
            }
            picInput.close();
            picOutput.close();

            while (!picDelete.delete()) {
                System.err.print("图片文件删除失败，请检查文件是否被占用或者是否拥有权限。\n");
                System.err.print("是否重试删除？（Y/n）\n");
                if (!reader.next().equals("Y")) {
                    System.exit(1);
                }
            }

        } catch (IOException e) {
            System.err.print("捕获异常！\n");
            e.printStackTrace();
        }
    }
}
