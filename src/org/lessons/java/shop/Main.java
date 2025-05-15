package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {

        Prodotto iphone = new Prodotto("iphone", "Display",
                new BigDecimal(1.000f), new BigDecimal(0.22f));
        System.out.println(iphone);

        Smartphone iphonePro = new Smartphone("Smartphone IphonePro", "display hdr", new BigDecimal(999.99), new BigDecimal(0.22),"G3V4H5V3", 128);
        System.out.println(iphonePro);

        Tv lg = new Tv("Tv lg", "oled", new BigDecimal(999.99), new BigDecimal(0.22),"55", true);
        System.out.println(lg);

        Cuffie Beats = new Cuffie("Cuffie Beats", "Dolby Atmos", new BigDecimal(199.99), new BigDecimal(0.22), "nere opaco", false); 
        System.out.println(Beats);

        
        // System.out.println(String.format("%.2f", iphone.getPrezzoBase().setScale(2, RoundingMode.DOWN)));

        // System.out.println(String.format("%.2f", iphone.getPrezzoIvato().setScale(2, RoundingMode.DOWN)));

        // Stringhe stringheherper = new stringhe();

    }
}
