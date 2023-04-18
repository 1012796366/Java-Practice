package theole6p5;
import java.io.*;

public class Application {
    public static void main(String[] args) {
        try {
            File picDelete = new File("C:/newFile/pic.jpg");
            File dirCheck = new File("D:/newFile");
            if (!dirCheck.exists() && !dirCheck.isDirectory()) {
                dirCheck.mkdirs();
            }
            BufferedInputStream picInput = new BufferedInputStream(new FileInputStream("C:/newFile/pic.jpg"));
            BufferedOutputStream picOutput = new BufferedOutputStream(new FileOutputStream("D:/newFile/pic.jpg"));
            BufferedReader fileInput = new BufferedReader(new FileReader("C:/newFile/file.txt"));
            // 文本读取并显示
            String s;
            while ((s = fileInput.readLine()) != null) {
                System.out.print(s);
            }
            fileInput.close();

            // 图片剪切
            int ch;
            while ((ch = picInput.read()) != -1) {
                picOutput.write(ch);
            }
            picDelete.delete();
            picInput.close();
            picOutput.close();

        } catch (IOException e) {
            System.err.print("捕获异常！\n");
            e.printStackTrace();
        }
    }
}
