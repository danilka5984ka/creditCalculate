public class CreditPaymentService {

    public int calculate(int amount, int years) {

        int months = years * 12;
        int payment = amount / months;
        System.out.println("Ежемесячный платёжь за указанный период составит: " + payment);
        return payment;

    }
}
