public class DebitCard implements CallBackPayment {
    private String cardNumber;
    private String cardHolderName;
    private String expireDate;
    private String cvv;

    public DebitCard(String cardNumber, String cardHolderName, String expireDate, String cvv) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expireDate = expireDate;
        this.cvv = cvv;
    }

    @Override
    public boolean authorizePayment(double price) {
        System.out.println("Authorizing debit card payment for: Euro" + price);
        return true;
    }
}
