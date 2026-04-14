public class Main {
    public static void main(String[] args) {
        double balance = -10;
       double refill = 1_099.09;

        double bonus;
        if (refill >= 1_100) {
            bonus = refill / 100;

        } else {
            bonus = 0;
        }

        double result = bonus + balance + refill;

        System.out.println("Итоговый счёт: " + result);

    }

}

