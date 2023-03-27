public class Produkt {
    String name;
    double verkaufspreis;
    double einkaufspreis;
    int lagerbestand;


    Produkt(String iName, double iVerkaufspreis, double iEinkaufspreis, int iLagerbestand) {
        name = iName;
        verkaufspreis = iVerkaufspreis;
        einkaufspreis = iEinkaufspreis;
        lagerbestand = iLagerbestand;
    }

    Produkt(String iName, double iVerkaufspreis, double iEinkaufspreis) {
        name = iName;
        verkaufspreis = iVerkaufspreis;
        einkaufspreis = iEinkaufspreis;
    }
    double lieferung(int anzahl) {
        lagerbestand = lagerbestand + anzahl;
        return (einkaufspreis * anzahl);
    }
    double verkaufe() {
        lagerbestand = lagerbestand - 1;
        return (verkaufspreis);
    }
    double verkaufe(int anzahl) {
        lagerbestand = lagerbestand - anzahl;
        return (verkaufspreis * anzahl);
    }
    double getBestandsWert() {
        return lagerbestand * einkaufspreis;
    }
    void schreibe() {
        System.out.println("Produkt: " + name + " Bestand: " + lagerbestand + " EK: " + einkaufspreis + "€ " + "VK: " + verkaufspreis + "€");
    }
}

