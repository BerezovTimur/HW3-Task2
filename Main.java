public class Main {
    public static void main(String[] args) {
        float clientbillstart = 100F;
        float clientbill;
        float refill = 1000F;
        if (refill >= 1000) {
            float bonus = 100F;
            float totalbonus = refill / bonus;
            int finalbonus = (int) totalbonus;
            System.out.println("Bonus: " + finalbonus);
            clientbill = clientbillstart + refill;
            System.out.println("Client Bill: " + clientbill);
        }
        else {
            clientbill = clientbillstart + refill;
            System.out.println("Client Bill: " + clientbill);
        }
    }
}