public class MemberCard {

    private String name,telNumber;
    private double comPurchase;
    private int comStamp;

    //method------------
    public void addPurchase(double purchase){
        comPurchase += purchase;

        comStamp += (purchase/50);
    }

    public boolean useStamp(int stamp){
        if (comStamp >=stamp){
            comStamp -= stamp;
            return true;
        } else {
            return false;
        }
    }



    public MemberCard(String name, String telNumber) {
        this.name = name;
        this.telNumber = telNumber;
    }

    public MemberCard(String name, String telNumber, int EStamp) {
        this.name = name;
        this.telNumber = telNumber;
        this.comStamp = EStamp;

    }

    public MemberCard(String telNumber, int comStamp){
        this("None","0",0);
    }

    public String getName() {
        return name;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public double getComPurchase() {
        return comPurchase;
    }

    public int getComStamp() {
        return comStamp;
    }

    @Override
    public String toString() {
        return "MemberCard\n" +
                "name = '" + name + '\'' +
                "\ncomPurchase = " + comPurchase +
                "\ncomStamp = " + comStamp;
    }

}
