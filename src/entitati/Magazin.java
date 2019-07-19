package entitati;


import marketplace.Marketplace;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


//TODO
//create client interface, implement client interface in Magazin
public class Magazin extends Marketplace {

    String numeMagazin;

    String adresaMagazin;

    String adresaEmailMagazin;

    int numarTelefonMagazin;

    HashMap<String, String> orarMagazin = new LinkedHashMap<>();

    String contBancarMagazin;

    HashMap<Produs, Integer> stocMagazin;


    public void orarMagazin () {

        orarMagazin.put("luni", "11-12");
        orarMagazin.put("marti", "11-12");
        orarMagazin.put("miercuri", "11-12");
        orarMagazin.put("joi", "11-12");
        orarMagazin.put("vineri", "11-12");
        orarMagazin.put("sambata", "11-12");
        orarMagazin.put("duminica", "11-12");
        for (Map.Entry i : orarMagazin.entrySet()) {
            System.out.println("orarul de " + i.getKey() + " este " + i.getValue());
        }
    }


    public void setNumeMagazin (String nume) {

        this.numeMagazin = nume;
    }


    public void setadresaMagazin (String adresa) {

        this.adresaMagazin = adresa;
    }


    public void setadresaEmailMagazin (String adresaEm) {

        this.adresaEmailMagazin = adresaEm;
    }


    public void setnumarTelefonMagazin (int nr) {

        this.numarTelefonMagazin = nr;
    }


    public void setcontBancarMagazin (String cont) {

        this.contBancarMagazin = cont;
    }


    public void setOrarMagazin (HashMap<String, String> orar) {

        this.orarMagazin = orar;
    }


    public void setStoc (HashMap<Produs, Integer> stoc) {

        this.stocMagazin = stoc;
    }


    public void adaugaStocMagazin (Produs produs, int cantitate) {

        stocMagazin = new HashMap<>();
        stocMagazin.put(produs, cantitate);
        System.out.println("Am adaugat in stocul magazinului produsul de tip " + produs.numeProdus + " intr" +
                "-o " +
                "cantitate de " + cantitate + " bucati!");
    }


    public void interogareStoc (HashMap<Produs, Integer> cosCumparaturi) {

        System.out.println("Interogare stoc!");

        Set<Produs> produseDinCos = cosCumparaturi.keySet();

        for (Produs p : produseDinCos) {
            if (stocMagazin.containsKey(p)) {
                System.out.println("Produsul " + p + " este pe stoc!");

                if (stocMagazin.get(p) >= cosCumparaturi.get(p)) {
                    System.out.println("Produsul " + p + " este pe stoc cu cantitatea dorita!");
                } else {
                    System.out.println("Produsul " + p + " NU este pe stoc cu cantitatea dorita!");
                }
            } else {
                System.out.println("Produsul " + p + " NU este pe stoc!");
            }
        }


    }
}
