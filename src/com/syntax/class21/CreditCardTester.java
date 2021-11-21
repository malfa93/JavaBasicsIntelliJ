package com.syntax.class21;

public class CreditCardTester {
    public static void main(String[] args) {

        CreditCard cd = new CreditCard(1000);
        cd.calculateInterest();

        AX ax = new AX(200);
        ax.calculateInterest();

        Visa visa = new Visa(300);
        visa.calculateInterest();
    }
}
