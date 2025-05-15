package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto {
    private String codiceImei;
    private int memoriaGb;

    public Smartphone(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva, String codiceImei, int memoriaGb){

        super(nome, descrizione, prezzo, iva);
        this.codiceImei = codiceImei;
        this.memoriaGb = memoriaGb;
    }
    public String getCodiceImei(){
        return this.codiceImei;
        
    }
    public void setCodiceImei(String codImei){
        this.codiceImei = codImei;
    }
    public int getMemoriaGb(){
        return memoriaGb;
    }

    public void setMemoriaGb(int memoriaGb){
        this.memoriaGb = memoriaGb;
    }

    @Override
    public String toString(){
        return super.toString() + ", con codice imei: " + this.codiceImei + "e " + memoriaGb + "GB in memoria";
    }
}
