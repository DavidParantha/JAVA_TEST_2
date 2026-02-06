package org.example;

public abstract class  Payment {
           abstract void pay(double amount);
}
        class CreditCardPayment extends Payment {
             @Override
            void pay(double amount) {
    }
}
        class UPIPayment extends Payment {
             @Override
            void pay(double amount) {
    }
}

