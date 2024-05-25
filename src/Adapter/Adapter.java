package Adapter;

import TipoPago.PayPal;

public class Adapter implements EShop {
    private PayPal adaptee;


    public void convert(String data) {
        adaptee.setUsername(adaptee.getUsername() + ":paypal");
    }
}
