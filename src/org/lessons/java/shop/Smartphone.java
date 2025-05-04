package org.lessons.java.shop;

public class Smartphone {

    public int codice = 1;
    public String nome = "iphone";
    public String descrizione = "display 6'1";
    public int prezzo = 1000;
    public int iva = 22;

    public Smartphone(int codice, String nome, String descrizione, int prezzo, int iva) {
        this.codice = 1;
        this.nome = "iphone";
        this.descrizione = "display 6'1";
        this.prezzo = 1000;
        this.iva = 22;
    }

    public String accendi() {
        return "Ciao, sono uno smartphone di nome " + nome + " con codice " + codice + " la mia descrizione "
                + descrizione;
    }

}
