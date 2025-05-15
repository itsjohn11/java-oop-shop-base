package org.lessons.java.shop;

import java.math.BigDecimal;

public class cuffie extends Prodotto{
    private String colore;
    private boolean isWireless;

    //costruttore
    public cuffie(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva,
                String colore, boolean isWireless){

        super(nome, descrizione, prezzo, iva);
        this.colore = colore;
        this.isWireless = isWireless;
    }

    //metodi
    public String getColore(){
        return this.colore;
    }
    public boolean isWireless(){
        return isWireless;
    }

    public void setWireless (boolean isWireless){
        this.isWireless = isWireless;
    }
        
    @Override
    public String toString() {
        return super.toString() + "\nColore : " + getColore() + "\nWireless : " + isWireless(); 
    }
}
