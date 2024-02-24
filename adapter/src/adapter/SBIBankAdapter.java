package adapter;

import bank.SBIBank;

public class SBIBankAdapter implements Bank{

    private final SBIBank sbiBank;

    public SBIBankAdapter(){
        this.sbiBank = new SBIBank();
    }
    @Override
    public double checkBalance() {
        return this.sbiBank.checkBalance();
    }

    @Override
    public void getStatement() {
         this.sbiBank.getStatement();
    }
}
