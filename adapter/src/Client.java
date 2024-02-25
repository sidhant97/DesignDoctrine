public class Client {
    public static void main(String[] args) {

        UPIPayment upiPayment = new UPIPayment();
        System.out.println(upiPayment.getBalance());
        upiPayment.getTransaction();
    }
}