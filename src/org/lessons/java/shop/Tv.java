package org.lessons.java.shop;

import java.math.BigDecimal;

public class Tv extends Prodotto{
    private int pollici;
    private boolean isSmartTv;

    //costruttore
    public Tv(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva,
    int pollici, boolean isSmartTv){

        super(nome, descrizione, prezzo, iva);
        this.pollici = pollici;
        this.isSmartTv = isSmartTv;
    }

    //metodi

    public int getPollici(){
        return pollici;
    }

    public void setPollici(int pollici){
        this.pollici = pollici;
    }

    public boolean isSmartTv(){
        return this.isSmartTv;
    }

    public void setSmartTv(boolean isSmartTv){
        this.isSmartTv = isSmartTv;
    }
    @Override
    public String toString(){
        return super.toString() + "\nDimensioni TV : " + getPollici() + "\nSmart : " + isSmartTv();
    }
}
