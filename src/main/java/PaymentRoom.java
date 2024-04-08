public class PaymentRoom {
    public boolean processPayment(CallBackPayment paymentMethod, double price){

        return paymentMethod.authorizePayment(price);
    }
}
