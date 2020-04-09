public class Main {
    public static void main(String[] args) {
        float clientBillStart = 100F;
        float clientBill;
        float refill = 1000F;
        if (refill >= 1000) {
            float bonus = 100F;
            float totalBonus = refill / bonus;
            int finalBonus = (int) totalBonus;
            System.out.println("Bonus: " + finalBonus);
            clientBill = clientBillStart + refill;
            System.out.println("Client Bill: " + clientBill);
        }
        else {
            clientBill = clientBillStart + refill;
            System.out.println("Client Bill: " + clientBill);
        }
    }
}