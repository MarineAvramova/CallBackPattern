public class ShoesStore {
    private PaymentRoom paymentRoom;

    public ShoesStore(PaymentRoom paymentRoom) {
        this.paymentRoom = paymentRoom;
    }

    public void shoppingProcess(CallBackPayment callBackPayment,double price){
        if (paymentRoom.processPayment(callBackPayment,price)){
            System.out.println("Payment successful!");
        } else {
            System.out.println("Payment failed. Please check your payment info and try again");
        }
    }
}
