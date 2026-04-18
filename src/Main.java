public class Main {
    public static void main(String[] args) {
        int balance = 100;
       int refill = 1001;

        int bonus;
        if (refill > 1000) {
            bonus = refill / 100;

        } else {
            bonus = 0;
        }

        int result = bonus + balance + refill;

        System.out.println("Итоговый счёт: " + result);

    }

}

