package theole4p4;

class MobileShop {
    InnerPurchaseMoney purchaseMoney1;                              // 用内部类InnerPurchaseMoney声明对象purchaseMoney1
    InnerPurchaseMoney purchaseMoney2;                              // 用内部类InnerPurchaseMoney声明对象purchaseMoney2
    private int mobileAmount;                                       // 手机数量
    MobileShop() {
        purchaseMoney1 = new InnerPurchaseMoney(20000);         // 创建价值为20000的purchaseMoney1
        purchaseMoney2 = new InnerPurchaseMoney(10000);         // 创建价值为10000的purchaseMoney2
    }
    void setMobileAmount(int m) {
        mobileAmount = m;
    }
    int getMobileAmount() {
        return mobileAmount;
    }

    class InnerPurchaseMoney {
        int moneyValue;
        InnerPurchaseMoney(int m) {
            moneyValue = m;
        }
        void buyMobile() {
            if (moneyValue >= 20000) {
                mobileAmount = mobileAmount - 6;
                System.out.printf("用价值%d的内部购物券买了6部手机\n", moneyValue);
            } else if (moneyValue < 20000 && moneyValue >= 10000) {
                mobileAmount = mobileAmount - 3;
                System.out.printf("用价值%d的内部购物券买了3部手机\n", moneyValue);
            }
        }
    }
}

public class NewYear {
    public static void main(String[] args) {
        MobileShop shop = new MobileShop();
        shop.setMobileAmount(30);
        System.out.printf("手机专卖店目前有%d部手机\n", shop.getMobileAmount());
        shop.purchaseMoney1.buyMobile();
        shop.purchaseMoney2.buyMobile();
        System.out.printf("手机专卖店目前有%d部手机\n", shop.getMobileAmount());
    }
}
