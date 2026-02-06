package org.example;

public class PaymentMain {
    public static void main(String args[]) {
        CreditCardPayment p1 = new CreditCardPayment();
        p1.pay(100.0);
        Payment p2 = new UPIPayment();
        p2.pay(200.0);
    }
}