package day4.design_pattern.factory_method.baitap.baidemo;

public class CardFactory {
    public CardFactory() {
    }
    public static CreditCard getCreditCard(String creditCard){
        switch (creditCard){
            case"MoneyBack":
                return new MoneyBack();
            case"Platinum":
                return new Platinum();
            case"Titanium":
                return new Titanium();
            default:
                return null;
        }
    }
}
