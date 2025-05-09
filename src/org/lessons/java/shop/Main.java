package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Prodotto iphone = new Prodotto("iphone", "Display",
                         new BigDecimal(1.000f), new BigDecimal(0.22f));
        System.out.println(iphone.getNomeEsteso());
        System.out.println(String.format("%.2f", iphone.getPrezzoBase()));
        System.out.println(String.format("%.2f", iphone.getPrezzoIvato()));
    }
}
