package theole5p1;

public class Application {
    public static void main(String[] args) {
        String input = "姓名：张三。出生日期：1989.10.16。个人网站：http://www.zhang.com。身高：185cm，体重：75kg。";
        String[] spl = input.split("。");
        if (spl[0].charAt(3) == '张') {
            System.out.print("简历中的姓名姓张\n");
        } else {
            System.out.print("简历中的姓名不姓张\n");
        }
        System.out.print(spl[1] + "\n");
        System.out.print(spl[2] + "\n");
        String[] hw = spl[3].split("，");
        if (Integer.parseInt(hw[0].substring(3, 6)) > 180) {
            System.out.print("身高大于 180 cm\n");
        } else {
            System.out.print("身高小于 180 cm\n");
        }
        try {
            Integer.valueOf(hw[1].substring(3, 6));
            System.out.print("体重大于 75 kg\n");
        } catch (NumberFormatException e) {
            if (Integer.parseInt(hw[1].substring(3, 5)) < 75) {
                System.out.print("体重小于 75 kg\n");
            } else {
                System.out.print("体重大于 75 kg\n");
            }
        }
    }
}