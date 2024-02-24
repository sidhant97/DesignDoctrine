public class OrderImpl implements Order{

    private final InvoiceFacade invoice;

    private final SendNotificationFacade sendNotification;

    public OrderImpl(){
        this.invoice = new InvoiceFacade();
        this.sendNotification = new SendNotificationFacade();
    }
    @Override
    public void createOrder() {
        this.invoice.generateInvoice();
        this.sendNotification.sendNotification();
    }
}
