package adapter;

import bank.HDFCBank;

public class HDFCBankAdapter implements Bank{

    private final HDFCBank hdfcBank;

    public HDFCBankAdapter(){
        this.hdfcBank = new HDFCBank();
    }
    @Override
    public double checkBalance() {
        return this.hdfcBank.getBalance();
    }

    @Override
    public void getStatement() {
        this.hdfcBank.getPassbook();
    }
}
