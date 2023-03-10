package student.info;
public class StuCard {
    private String id;                            // 学号
    private String name;                          // 姓名
    private String sex;                           // 性别
    private String major;                         // 专业
    private int grade;                            // 年级
    private String location;                      // 籍贯

    public StuCard() { this.grade = 1; }
    public StuCard(String id, String name, String sex, String major, int grade, String location) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.major = major;
        this.grade = grade;
        this.location = location;
    }
    public StuCard(String id, String name, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.grade = 1;
    }

    public  void setID(String id) {
        this.id = id;
    }
    public  String getID() {
        return this.id;
    }
    public  void setName(String name) {
        this.name = name;
    }
    public  String getName() {
        return this.name;
    }
    public  void setSex(String sex) {
        this.sex = sex;
    }
    public  String getSex() {
        return this.sex;
    }
    public  void setMajor(String major) {
        this.major = major;
    }
    public  String getMajor() {
        return this.major;
    }
    public  void setGrade(int grade) {
        this.grade = grade;
    }
    public  int getGrade() {
        return this.grade;
    }
    public  void setLocation(String location) {
        this.location = location;
    }
    public  String getLocation() {
        return this.location;
    }
    public void show() {
        System.out.printf("学号：%s\n名字：%s\n性别：%s\n专业：%s\n年级：%d\n籍贯：%s\n"
                , this.id, this.name, this.sex, this.major, this.grade, this.location);
    }

}
