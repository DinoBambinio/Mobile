public class Mobile {
    public static void main(String args[]) {
        int mani = 100;
        int replenishment = 1100;
        if (replenishment >= 1000) {
            System.out.println("Ваш баланс " + ((replenishment + mani) + (replenishment / 100)) + " рублей");
        } else if (replenishment < 1000) {
            System.out.println("Ваш баланс " + (replenishment + mani) + " рублей");
        }

    }
}