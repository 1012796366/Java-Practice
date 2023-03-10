package well;
public class Village {
    private static int waterAmount;
    private int peopleNumber;
    private String name;

    public Village() {
        peopleNumber = 0;
        name = null;
    }
    public Village(int peopleNumber, String name) {
        this.peopleNumber = peopleNumber;
        this.name = name;
    }
    public void setPeopleNumber(int peopleNumber) { this.peopleNumber = peopleNumber; }
    public int getPeopleNumber() { return this.peopleNumber; }
    public void setName(String name) { this.name = name; }
    public String getName() { return this.name; }
    public static void setWaterAmount(int amount) { waterAmount = amount; }
    public static int getWaterAmount() { return waterAmount; }

}
