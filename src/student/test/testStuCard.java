package student.test;
import student.info.StuCard;
public class testStuCard {
    public static void main(String[] args) {
        StuCard stuNI = new StuCard();                                                     // No Info     缺乏任何信息
        StuCard stuLI = new StuCard("7608020610", "张三", "男");              // Little Info 只含必要信息
        StuCard stuFI = new StuCard("7608020622", "李四", "男"
                                    ,"量子计算机", 3, "木卫二");         // Full Info   包含全部信息

        System.out.print("缺乏任何信息的学生：\n");
        stuNI.show();
        stuNI.setID("7608020311");
        stuNI.setName("王五");
        stuNI.setSex("男");
        stuNI.setMajor("宇宙机");
        stuNI.setGrade(2);
        stuNI.setLocation("火卫一");
        System.out.print("[修改后]缺乏任何信息的学生：\n");
        stuNI.show();

        System.out.print("只含必要信息的学生：\n");
        stuLI.show();
        stuLI.setMajor("核弹制造工程");
        stuLI.setGrade(4);
        stuLI.setLocation("火卫一");
        System.out.print("[修改后]只含必要信息的学生：\n");
        stuLI.show();

        System.out.print("包含全部信息的学生：\n");
        stuFI.show();
    }
}
