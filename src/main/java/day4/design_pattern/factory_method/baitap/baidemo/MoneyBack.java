package day4.design_pattern.factory_method.baitap.baidemo;

public class MoneyBack implements CreditCard{
    @Override
    public String GetCardType() {
        return "MoneyBack";
    }

    @Override
    public int GetCreditLimit() {
        return 10000;
    }

    @Override
    public int GetAnnualCharge() {
        return 50;
    }
}
