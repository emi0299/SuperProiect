package executie;


import entitati.Client;
import entitati.Magazin;
import entitati.Produs;

import java.util.HashMap;


public class Executie {

    public static void main (String args[]) {



/*
    *//*Magazin Surubel = new Magazin();
    Surubel.generateRandomStoreName();
    Surubel.setadresaEmailMagazin("contact@surubel.com");
    Surubel.setStoc(new HashMap<>());
    Surubel.orarMagazin();
    Produs telefon = new Produs();
    telefon.setNumeProdus("televizor hd");
    telefon.setCantitateProdus(5);
    telefon.adaugaCantitateNoua(10);
    telefon.afiseazaCantitate();

    Surubel.adaugaStocMagazin(telefon,20);
    telefon.afiseazaCantitate();
    telefon.interogareStoc("TELEFON", 50);
    telefon.suplimentareStoc(80);
    telefon.calcularePretDupaDiscount(156, 23);
    telefon.setPretProdus(200);
    telefon.calcularePretDupaDiscount(25);


    telefon.afisareCosCumparaturi(produseMagazin);
*//*
        Client mircea = new Client();

        Client y = new Client();
    *//*cosCumparaturi.put("alcatel", 15);
    mircea.afisareCosCumparaturi(cosCumparaturi);
    mircea.setAdresaLivareClientDefault("dancu");
    mircea.setAdresaFacturareClientDefault("podu ros");
    mircea.setNumeClient("mircea");
    *//**//*mircea.livareClient();*//**//*
    mircea.setPersoanaJuridica(true);
    mircea.adaugaInformatiiFirma(mircea);*//*

   *//* x.setPersoanaJuridicaCuDiscount(true,15.2);
    x.adaugaInformatiiFirma(x);*//*

        y.setareDiscountPersoanaJuridica(5.5);
        cos = mircea.adaugaInCosulDeCumparaturi("Sony Vayo", 11);
        Produs produse = new Produs();
        Produs x = new Produs();
        x.setNumeProdus("Sony Vayo");

        Magazin splash = new Magazin();

        splash.adaugaStocMagazin(x,500);

        mircea.adaugaInCosulDeCumparaturi("Sony Vayo", 2);*/

        Magazin m = new Magazin();
        m.setNumeMagazin("Splash");

        Produs p = new Produs();
        p.setNumeProdus("iPhone 6");
        p.setCantitateProdus(100);

        Client c = new Client();
        c.setNumeClient("Emi");



        m.adaugaStocMagazin(p,100);


        HashMap cos = new HashMap<>();
        cos = c.adaugaInCosulDeCumparaturi("iPhone 6",15);

        m.interogareStoc(cos);
        m.updateStocMagazin(cos);


        //TODO fix "cumparaCosCumparaturi" method --
        /*c.cumparaCosCumparaturi(cos);*/

    }


}
