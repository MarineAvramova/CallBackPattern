public class Main {
    public static void main(String[] args) {
        ShoesStore newBalance = new ShoesStore(new PaymentRoom());
        CallBackPayment paymentMethod = new DebitCard("4536342486752040",
                "Carla Mendosa", "23.04.2098","987");
        newBalance.shoppingProcess(paymentMethod,139);


    }
}


