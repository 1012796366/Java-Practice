package theole3p3;
public class Test {
    public static void main(String[] args) {
        SIMOfChinaUnicom usim = new SIMOfChinaUnicom();
        SIMOfChinaMobile msim = new SIMOfChinaMobile();
        usim.setNumber("15107751141");
        msim.setNumber("15907751141");
        MobileTelephone phone = new MobileTelephone();
        phone.useSIM(usim);
        phone.showMess();
        phone.useSIM(msim);
        phone.showMess();
    }
}

class MobileTelephone {
    SIM card;
    public void useSIM(SIM card) {
        this.card = card;
    }
    public void showMess() {
        System.out.printf("本机号码：%s\n消息：%s\n", card.giveNumber(), card.giveCorpName());
    }
}

abstract class SIM {
    abstract public void setNumber(String number);
    abstract public String giveNumber();
    abstract public String giveCorpName();
}

class SIMOfChinaMobile extends SIM {
    String number;
    @Override
    public void setNumber(String number) {
        this.number = number;
    }
    @Override
    public String giveNumber() {
        return this.number;
    }
    @Override
    public String giveCorpName() {
        return "中国移动";
    }
}

class SIMOfChinaUnicom extends SIM {
    String number;
    @Override
    public void setNumber(String number) {
        this.number = number;
    }
    @Override
    public String giveNumber() {
        return this.number;
    }
    @Override
    public String giveCorpName() {
        return "中国联通";
    }
}