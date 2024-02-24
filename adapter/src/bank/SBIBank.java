package bank;

import adapter.Bank;

public class SBIBank {

    public double checkBalance(){
        return 100000.00;
    }

    public void getStatement(){
        System.out.println("Hi, SBI Statement is ready");
    }
}
