package student.test;
import student.info.StuCard;
public class testStuCard {
    public static void show(StuCard target, String spec) {
        System.out.printf("档案：%s\n学号：%s\n名字：%s\n性别：%s\n专业：%s\n年级：%d\n籍贯：%s\n"
                            ,spec, target.getID(), target.getName(), target.getSex()
                            ,target.getMajor(), target.getGrade(), target.getLocation());
    }
    public static void main(String[] args) {
        StuCard stuNI = new StuCard();                                                     // No Info     缺乏任何信息
        StuCard stuLI = new StuCard("7608020610", "张三", "男");              // Little Info 只含必要信息
        StuCard stuFI = new StuCard("7608020622", "李四", "男"
                                    ,"量子计算机", 3, "木卫二");         // Full Info   包含全部信息

        show(stuNI, "缺乏信息");
        stuNI.setID("7608020311");
        stuNI.setName("王五");
        stuNI.setSex("男");
        stuNI.setMajor("宇宙机");
        stuNI.setGrade(2);
        stuNI.setLocation("火卫一");
        show(stuNI, "修改后的缺乏信息");

        show(stuLI, "少许信息");
        stuLI.setMajor("核弹制造工程");
        stuLI.setGrade(4);
        stuLI.setLocation("火卫一");
        show(stuLI, "修改后的少许信息");

        show(stuFI, "全部信息");
    }
}
