public class Main {
    public static void main(String[] args) {
        int balance = 350;
        int refill = 1_101;

        int bonus;
        if (refill >= 1_100) {
            bonus = refill / 100;

        } else {
            bonus = 0;
        }

        int result = bonus + balance + refill;

        System.out.println("Итоговый счёт: " + result);

    }

}

