package day4.design_pattern.factory_method.baitap.baidemo;

public class Platinum implements CreditCard{
    @Override
    public String GetCardType() {
        return "Platinum";
    }

    @Override
    public int GetCreditLimit() {
        return 20000;
    }

    @Override
    public int GetAnnualCharge() {
        return 50;
    }
}
