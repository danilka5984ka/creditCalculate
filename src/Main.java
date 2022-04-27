public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        service.calculate(1_000_000, 1);
        service.calculate1(1_000_000, 2);
        service.calculate1(1_000_000, 3);
    }
}
