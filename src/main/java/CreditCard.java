public class CreditCard implements CallBackPayment {
    private String cardNumber;
    private String cardHolderName;
    private String expireDate;
    private String cvv;

    public CreditCard(String cardNumber, String cardHolderName, String expireDate, String cvv) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expireDate = expireDate;
        this.cvv = cvv;
    }

    @Override
    public boolean authorizePayment(double price) {
        System.out.println("Going process authorizing the payment");
        System.out.println("Authorizing credit card payment for: Euro" + price);
        return true;
    }
}
