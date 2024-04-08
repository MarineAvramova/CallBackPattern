public class PayPal implements CallBackPayment{
    private String email;
    private String password;

    public PayPal(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean authorizePayment(double price) {
        System.out.println("Authorizing PayPal payment for: Euro" + price);
        return true;
    }
}
