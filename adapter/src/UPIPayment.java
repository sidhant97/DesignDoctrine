import adapter.Bank;
import adapter.HDFCBankAdapter;
import adapter.SBIBankAdapter;

public class UPIPayment {

    private final Bank bank;
    public UPIPayment(){
        this.bank = new SBIBankAdapter();
    }

    public double getBalance(){
        return this.bank.checkBalance();
    }

    public void getTransaction(){
        this.bank.getStatement();
    }
}
