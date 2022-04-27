public class CreditPaymentService {

    public int calculate(int amount, int years) {

        int months = years * 12;
        int payment = amount / months;
        System.out.println("Ежемесячный платёжь за 1 год составит: " + payment);
        return payment;

    }

    public int calculate1(int amount, int years) {

        int months = years * 12;
        int payment = amount / months;
        System.out.println("Ежемесячный платёжь за 2 года составит: " + payment);
        return payment;

    }

    public int calculate2(int amount, int years) {

        int months = years * 12;
        int payment = amount / months;
        System.out.println("Ежемесячный платёжь за 3 года составит: " + payment);
        return payment;

    }
}
