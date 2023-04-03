package theole5p1;

public class Application {
    public static void main(String[] args) {
        String input = "姓名：张三。出生日期：1989.10.16。个人网站：http://www.zhang.com。身高：185cm，体重：75kg。";
        String[] spl = input.split("。");
        if (spl[0].charAt(3) == '张') {
            System.out.println("简历中的姓名姓张");
        } else {
            System.out.println("简历中的姓名不姓张");
        }
        System.out.println(spl[1]);
        System.out.println(spl[2]);
        String[] hw = spl[3].split("，");
        if (Integer.parseInt(hw[0].substring(3, 6)) > 180) {
            System.out.println("身高大于 180 cm");
        } else {
            System.out.println("身高小于 180 cm");
        }
        try {
            Integer.valueOf(hw[1].substring(3, 6));
            System.out.println("体重大于 75 kg");
        } catch (NumberFormatException e) {
            if (Integer.parseInt(hw[1].substring(3, 5)) < 75) {
                System.out.println("体重小于 75 kg");
            } else {
                System.out.println("体重大于 75 kg");
            }
        }
    }
}
