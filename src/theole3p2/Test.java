package theole3p2;
public class Test {
    public static void main(String[] args) {
        Bank b1 = new Bank(50000, 5);
        BankOfQingdao b2 = new BankOfQingdao(50000, 5.216);
        ConstructionBank b3 = new ConstructionBank(50000, 5.216);
        b2.computerInterest();
        b3.computerInterest();
        if (b2.interest > b3.interest) {
            System.out.print("青行利息较多，");
        }
        else {
            System.out.print("建行利息较多，");
        }
        System.out.printf("利息差额为 %.2f 元\n", Math.abs(b2.interest - b3.interest));
    }
}

class Bank {
    protected int savedMoney;
    protected int year;
    protected double interest;
    public Bank(int savedMoney, int year) {
        this.savedMoney = savedMoney;
        this.year = year;
    }
    double computerInterest() {
        interest=year*0.035*savedMoney;
        return interest;
    }
}

class ConstructionBank extends Bank {
    double year;
    public ConstructionBank(int savedMoney, double year) {
        super(savedMoney, (int)year);
        this.year = year;
        super.year = (int)year;
    }
    double computerInterest() {
        int days = (int)((this.year - (double)super.year) * 100);
        super.computerInterest();
        interest += days * 0.0001 * savedMoney;
        return interest;
        // 不可以直接 return，利息计算结果必须保存
    }
}

class BankOfQingdao extends Bank {
    double year;
    public BankOfQingdao(int savedMoney, double year) {
        super(savedMoney, (int)year);
        this.year = year;
        super.year = (int)year;
    }
    double computerInterest() {
        int days = (int)((this.year - (double)super.year) * 100);
        super.computerInterest();
        interest += days * 0.00015 * savedMoney;
        return interest;
        // 不可以直接 return，利息计算结果必须保存
    }
}