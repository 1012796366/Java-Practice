package theole5p3;

public class Application {
    public static void main(String[] args) {
        String input = "北京烤鸭：189元，西芹炒肉：12.9元，酸菜鱼：69元，铁板牛柳：32元。";
        input = input.replaceAll("，", "");
        input = input.replaceAll("。", "");
        String[] arr = input.split("元");
        double total = 0;
        for (String elem : arr) {
            System.out.printf("%s 元\n", elem);
            total += Double.parseDouble(elem.split("：")[1]);
        }
        System.out.printf("总价格：%.2f 元", total);
    }
}
