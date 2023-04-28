package theole7p4;
import java.sql.*;

public class Application {
    public static void main(String[] args) {
        SQLInteractive sqlobj = new SQLInteractive(
                "jdbc:mysql://[数据库地址，本机上搭建一般为localhost，写的时候去掉中括号]:[数据库端口，一般不改就是3306]/[数据库名，该库必须存在]?useSSL=false&serverTimezone=UTC",
                "[账户名，没添加的话就是root]", "[账户密码]"
        );
        sqlobj.insert();
        sqlobj.delete();
        sqlobj.modify();
        sqlobj.query();
        try {
            sqlobj.con.close();
            sqlobj.status.close();
        } catch (SQLException e) {
            System.err.print("关闭连接时发生异常！\n");
            e.printStackTrace();
            System.exit(1);
        }
    }
}

class SQLInteractive {
    public Connection con = null;
    public Statement status;
    public ResultSet result;
    public SQLInteractive(String url, String username, String password) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
            status = con.createStatement();
            // 由于每次创建的表在程序结束后依然保留在数据库里
            // 因此每次开始时直接删除该表，直接重新开始
            // 不然，为了避免在插入部分发生插入重复值的报错
            // 每次都得手动删除表，很麻烦
            status.executeUpdate("DROP TABLE IF EXISTS student");
            int res1 = status.executeUpdate("CREATE TABLE student(" +
                    "stuId varchar(6) primary key, " +
                    "stuName nvarchar(5) not null," +
                    "courseName nvarchar(5) not null," +
                    "score int)"
            );
        } catch (Exception e) {
            System.err.print("构造函数捕获异常！\n");
            e.printStackTrace();
            System.exit(1);
        }
    }
    public void insert() {
        try {
            status.execute("INSERT INTO student(stuID, stuName, courseName, score) VALUES('123456', '张三', 'Java', '90')");
            status.execute("INSERT INTO student(stuID, stuName, courseName, score) VALUES('654321', '李四', 'Java', '80')");
            status.execute("INSERT INTO student(stuID, stuName, courseName, score) VALUES('321456', '王五', 'Java', '95')");
        } catch (SQLException e) {
            System.err.print("插入方法捕获异常！\n");
            e.printStackTrace();
            System.exit(1);
        }
    }
    public void delete() {
        try {
            int res2 = status.executeUpdate("DELETE FROM student WHERE stuName='李四'");
        } catch (SQLException e) {
            System.err.print("删除方法捕获异常！\n");
            e.printStackTrace();
            System.exit(1);
        }
    }
    public void modify() {
        try {
            int res3 = status.executeUpdate("UPDATE student SET score=100 WHERE stuName='张三'");
        } catch (SQLException e) {
            System.err.print("修改方法捕获异常！\n");
            e.printStackTrace();
            System.exit(1);
        }
    }
    public void query() {
        try {
            ResultSet res4 = status.executeQuery("SELECT MAX(score) FROM student WHERE courseName='Java'");
            while (res4.next()) {
                System.out.print(res4.getInt(1));
            }
        } catch (SQLException e) {
            System.err.print("查询方法捕获异常！\n");
            e.printStackTrace();
            System.exit(1);
        }
    }
}