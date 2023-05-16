package day4.design_pattern.factory_method.baitap.baidemo;

public class Titanium implements CreditCard{
    @Override
    public String GetCardType() {
        return "Titanium";
    }

    @Override
    public int GetCreditLimit() {
        return 30000;
    }

    @Override
    public int GetAnnualCharge() {
        return 50;
    }
}
