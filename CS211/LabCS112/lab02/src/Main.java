public class Main {
    public static void main(String[] args) {
        MemberCard cus1 = new MemberCard("Smith","a");
        MemberCard cus2 = new MemberCard("Wrigh","06123456789",35);
        CashRegister cashRegister = new CashRegister();
        //day1----
            cus1.addPurchase(450);
            cus2.addPurchase(135);
        //day2----
            cus1.addPurchase(988.50);
            cus2.addPurchase(345);
        //day3----
            cus1.addPurchase(2298.70);
            cus2.addPurchase(723);


        System.out.println(cus1+"\n---------------------\n");
        System.out.println(cus2);
        //---------------------------------------------------
        System.out.println("--------------------------------------------------");

        //ไอ้สมืทซื้อของ7อัน 15, 16.50, 200, 24, 18, 129.90 และ 30 บาท
        cashRegister.setMemberCard(cus1);
        cashRegister.purchaseItem(15);
        cashRegister.purchaseItem(16.50);
        cashRegister.purchaseItem(200);
        cashRegister.purchaseItem(24);
        cashRegister.purchaseItem(18);
        cashRegister.purchaseItem(129.90);
        cashRegister.purchaseItem(30);

        cashRegister.pay(500,12);
        cus1.addPurchase(500);
        cus1.useStamp(12);
        System.out.println(cashRegister);
        cashRegister.clear();
        System.out.println("--------------------------------------------------");
        //ไอ้Razr ไม่มีบัตรสมาชิก ซื้อสินค้า 5 ชิ้น ราคา 47, 99, 65, 20.50, 29 บาท ตามลำดับ

        cashRegister.purchaseItem(47);
        cashRegister.purchaseItem(99);
        cashRegister.purchaseItem(65);
        cashRegister.purchaseItem(20.50);
        cashRegister.purchaseItem(29);

        cashRegister.pay(300,30);
        System.out.println(cashRegister);
        cashRegister.clear();
        System.out.println("--------------------------------------------------");


        //บัตรเหมาๆ
        MemberCard cusMe = new MemberCard("Tanapat", "0917237171");
        cashRegister.setMemberCard(cusMe);
        cashRegister.purchaseItem(300);
        cashRegister.purchaseItem(100);
        cashRegister.purchaseItem(400);
        cashRegister.purchaseItem(500);
        cashRegister.purchaseItem(600);
        cashRegister.purchaseItem(700);
        cashRegister.purchaseItem(800);
        cashRegister.purchaseItem(39);
        cashRegister.purchaseItem(900);
        cashRegister.purchaseItem(120);
        cashRegister.purchaseItem(30);
        cashRegister.purchaseItem(3);
        cashRegister.purchaseItem(15);
        cashRegister.purchaseItem(210);
        cashRegister.purchaseItem(36);

        cashRegister.pay(5000,0);

        cusMe.useStamp(0);
        cusMe.addPurchase(5000);

        System.out.println(cashRegister);

    }
}