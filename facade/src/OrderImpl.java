public class OrderImpl implements Order{

    private final InvoiceHelper invoice;

    private final SendNotificationHelper sendNotification;

    public OrderImpl(){
    this.invoice = new InvoiceHelper();
    this.sendNotification = new SendNotificationHelper();
    }
    @Override
    public void createOrder() {
        this.invoice.generateInvoice();
        this.sendNotification.sendNotification();
    }
}
