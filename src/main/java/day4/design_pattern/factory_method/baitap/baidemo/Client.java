package day4.design_pattern.factory_method.baitap.baidemo;

import day4.design_pattern.factory_method.Bank;
import day4.design_pattern.factory_method.BankFactory;

public class Client {
    public static void main(String[] args) {
        CreditCard creditCard = CardFactory.getCreditCard("MoneyBack");
        if(creditCard != null) {
            System.out.println("CardType: " +creditCard.GetCardType());
            System.out.println("CreditLimit: " +creditCard.GetCreditLimit());
            System.out.println("AnnualCharge: " +creditCard.GetAnnualCharge());
        }
    }
}
