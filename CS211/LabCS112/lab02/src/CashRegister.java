public class CashRegister {
    private int totalNumProd;
    private double totalPriceProd,money,change,truePrice;
    private MemberCard memberCard,cardForClear;
    private boolean memberPaowa;
    public CashRegister() {
        this.totalNumProd = 0;
        this.totalPriceProd = 0;
        this.money = 0;
        this.change = 0;
        this.truePrice = 0;
        this.memberPaowa = false;
    }

    public void setMemberCard(MemberCard memberCard) {
        this.memberCard = memberCard;
        this.memberPaowa = true;
    }

    public void purchaseItem(double purchase){
        this.totalNumProd += 1;
        this.totalPriceProd += purchase;
    }

    public void pay (double cash, int stamp){
        this.money = cash;
        if (memberPaowa){
            truePrice = totalPriceProd - (stamp)*2;
            memberCard.useStamp(stamp);

        } else {
            truePrice = totalPriceProd - (stamp);
        }
        change = money - truePrice;
    }

    public void clear() {
        this.totalNumProd = 0;
        this.totalPriceProd = 0;
        this.money = 0;
        this.change = 0;
        this.truePrice = 0;
        this.memberCard = cardForClear;
        this.memberPaowa = false;

    }

    @Override
    public String toString() {
        return "CashRegister\n" +
                "totalPriceProd = " + totalPriceProd +
                "\ntruePrice = " + truePrice+
                    "\nchange = " + change;
    }
}
