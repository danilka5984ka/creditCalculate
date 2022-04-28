public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        service.calculate(1_000_000, 3);

    }
}
