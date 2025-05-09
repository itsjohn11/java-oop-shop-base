package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Prodotto {

    public int codice;
    public String nome;
    public String descrizione ;
    public BigDecimal prezzo;
    public BigDecimal iva ;

    public Prodotto(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva) {
        Random randomGenerator = new Random();
        this.codice = randomGenerator.nextInt(111111, 999999);
        this.nome = "iphone";
        this.descrizione = "display 6'1";
        this.prezzo= prezzo;
        this.iva = iva;
    }

    public BigDecimal getPrezzoBase() {
        return this.prezzo;
    }

    public BigDecimal getPrezzoIvato() {
        return this.prezzo.add(this.prezzo.multiply(this.iva));
    }

    public String getNomeEsteso    () {
        return String.format("%s-%s", this.codice, this.descrizione);
    }
}
