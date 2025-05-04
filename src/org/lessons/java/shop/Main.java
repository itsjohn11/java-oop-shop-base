package org.lessons.java.shop;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Smartphone iphone = new Smartphone(1, "iphone", "display", 10000, 22);

        // iphone.codice = 1;
        // iphone.nome = "iphone";
        // iphone.descrizione = "display 6'1";
        // iphone.prezzo = 10000;
        // iphone.iva = 22;

        System.out.println(iphone.codice);
        System.out.println(iphone.nome);
        System.out.println(iphone.descrizione);
        System.out.println(iphone.prezzo);
        System.out.println(iphone.iva);

        System.out.println(iphone.accendi());

        Random randomGenerator = new Random();
        int max = 100000000;
        int codiceGenerato = randomGenerator.nextInt(max);
        System.out.println(codiceGenerato);

    }
}
