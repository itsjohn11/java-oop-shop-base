package org.lessons.java.shop;

import java.math.BigDecimal;

public class Carrello {

    public static void main(String[] args) {
        Prodotto[] prodotti new Prodotto[3];
        Scanner scenner = new Scanner(System.in);

        for(int i = 0; i < prodotti.length; i++){
            System.out.println("inserisci il nome del prodotto da  inserire");
            String nomeProdotto = scanner.nextLine();

            System.out.println("inserisci la descrizione del prodotto");
            String descrizioneProdotto= scanner.nextLine();

            System.out.println("inserisci il prezzo del prodotto che vuoi aggiugere");
            BigDecimal prezzoProdotto = new BigDecimal(Float.parseFloat(scanner.nextLine));

            System.out.println("Quale proddot vuoi inserire?");
            System.out.println( "Selezione una scelta tra: Smartphone, tv, cuffie");

            String selezioneUtente = scanner.nextLine().trim().toLowerCase();

            switch (selezioneUtente) {
                case "smartphone":
                    System.out.println("inserisci il codice imei");
                    int  codiceImei = Integer.parseInt(scanner.nextLine());

                    System.out.println("inserisci le dimenzioni della memoria GB");
                    int  memoriaGb = Integer.parseInt(scanner.nextLine());

                    Smartphone nuovoSmartphone = new Smartphone(nomeProdotto, prezzoProdotto, codiceImei, dimenzioni, selezioneUtente);

                    prodotti [i] = nuovoSmartphone;

                    break;


                case "tv":
                        System.out.println("inserisci il codice imei");
                        int  pollici = Integer.parseInt(scanner.nextLine());

                        System.out.println("inserisci le dimenzioni della memoria GB");
                        boolean smart = Integer.parseBoolean(scanner.nextLine());

                        Tv nuovaTv = new Tv(nomeProdotto, prezzoProdotto, pollici, smart, selezioneUtente);

                        prodotti [i] = nuovaTv;
                    
                    break;


                case "cuffie":
                    System.out.println("inserisci il colore delle cuffie");
                    String colore = Integer.parseInt(scanner.nextLine());

                    System.out.println("inserisci se le cuffie sono wireless");
                    boolean wireless = Boolean.parseBoolean(scanner.nextLine());

                    Cuffie nuoveCuffie = new Cuffie(nomeProdotto, prezzoProdotto, colore, wireless, selezioneUtente);

                    prodotti [i] = nuoveCuffie;
                    
                    break;
            
                default:
                    prodotti[i] = new Prodotto(nomeProdotto, descrizioneProdotto, prezzoProdotto);
                    break;
            }

        }



        scanner.close();


    }
}
