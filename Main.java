public class Main {
    public static void main(String[] args) {
        float ClientBillStart = 100F;
        float ClientBill;
        float Refill = -1000F;
        if (Refill >= 1000) {
            float Bonus = 100F;
            float TotalBonus = Refill / Bonus;
            int TotalBonus1 = (int) TotalBonus;
            System.out.println("Bonus: " + TotalBonus1);
            ClientBill = ClientBillStart + Refill;
            System.out.println("Client Bill: " + ClientBill);
        }
        else {
            ClientBill = ClientBillStart + Refill;
            System.out.println("Client Bill: " + ClientBill);
        }
    }
}