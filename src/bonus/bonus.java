package bonus;
import java.util.LinkedList;

public class bonus {
    public static void main(String[] args) {
        administrator admin = new administrator("张三");
        repository repo = new repository("采乌");
        item item2Load1 = new item("饼干", 3.5, 5);
        item item2Load2 = new item("早餐面包", 5.0, 2);
        item item2Sell = new item("饼干", 3.5, 1);
        item result;

        result = admin.itemOutbound(repo, item2Sell);                  // 尝试出库 itemLoad2
        if (result.getName().equals("OutOfStock")) {
            // 获得 OutOfStock 名字，则说明没有找到该商品
            System.out.print("无该商品！\n");
        } else {
            // 正常出库，说明找到该商品
            System.out.printf("%s 管理员在 %s 仓库出库了 %s 商品 %d 个，单价 %.2f，金额 %.2f 元。\n"
                    , admin.getName(), repo.getName(), result.getName(), result.getCount(), result.getPrice()
                    , result.getPrice() * result.getCount());
        }
        admin.itemStorage(repo, item2Load1);                            // 入库 item2Load1
        admin.itemStorage(repo, item2Load2);                            // 入库 item2Load2
        result = admin.itemOutbound(repo, item2Load2);
        if (result.getName().equals("OutOfStock")) {
            // 获得 OutOfStock 名字，则说明没有找到该商品
            System.out.print("无该商品！\n");
        } else {
            // 正常出库，说明找到该商品
            System.out.printf("%s 管理员在 %s 仓库出库了 %s 商品 %d 个，单价 %.2f，金额 %.2f 元。\n"
                    , admin.getName(), repo.getName(), result.getName(), result.getCount(), result.getPrice()
                    , result.getPrice() * result.getCount());
        }
    }
}

class item {
    String name;
    double price;
    int count;
    item() {}
    item(String name) {
        this.name = name;
    }
    item(String name, double price) {
        this.name = name;
        this.price = price;
        this.count = 1;
    }
    item(String name, double price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }
    item(item target) {
        this.name = target.name;
        this.price = target.price;
        this.count = target.count;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setCount(int count) { this.count = count; }
    public String getName() { return this.name; }
    public double getPrice() { return this.price; }
    public int getCount() { return this.count; }
}

class repository {
    String name;
    LinkedList<item> itemStock;
    repository() {}
    repository(String name) {
        this.name = name;
        this.itemStock = new LinkedList<>();
    }
    repository(String name, LinkedList<item> itemStock) {
        this.name = name;
        this.itemStock = itemStock;
    }
    public String getName() { return this.name; }
    public void itemStorage(item item2Load) {

        for (item iter : itemStock) {
            if (iter.getName().equals(item2Load.getName()) && iter.getPrice() == item2Load.getPrice()) {
                // 货物种类一样
                iter.setCount(iter.getCount() + item2Load.getCount());
                return ;
            }
        }
        // 没有找到一样的货物，或者是空的容器，则添加
        item temp = new item(item2Load.getName(), item2Load.getPrice(), item2Load.getCount());
        itemStock.add(temp);
    }
    public item itemOutbound(item item2Sell) {
        for (item iter : itemStock) {
            if (iter.getName().equals(item2Sell.getName()) && iter.getPrice() == item2Sell.getPrice()) {
                if (iter.getCount() >= item2Sell.getCount()) {
                    // 库存充足，出库指定的全部数量
                    //result = new item(item2Sell.getName(), item2Sell.getPrice(), item2Sell.getCount());
                    iter.setCount(iter.getCount() - item2Sell.getCount());
                } else if (iter.getCount() > 0) {
                    // 库存不足，但仍有库存，出库库存的剩余数量
                    //result = new item(iter.getName(), iter.getPrice(), iter.getCount());
                    iter.setCount(0);
                } else {
                    // 曾拥有，但是已经消耗殆尽，终结循环
                    break;
                }
                return item2Sell;
            }
        }
        // 不曾拥有
        return new item("OutOfStock");
    }
}

class administrator {
    String name;
    administrator() {}
    administrator(String name) {
        this.name = name;
    }
    public String getName() { return this.name; }
    public void itemStorage(repository targetRepo, item storage) {
        targetRepo.itemStorage(storage);
    }
    public item itemOutbound(repository targetRepo, item outbound) {
        return targetRepo.itemOutbound(outbound);
    }
}