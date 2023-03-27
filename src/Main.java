public class Main {
    public static void main(String[] args) {

        Produkt[] product = new Produkt[5];

        product[0] = new Produkt("Tennissocken", 2.4, 2.9, 12);
        product[1] = new Produkt("Sandspielzeug", 3.5, 5.2, 6);
        product[2] = new Produkt("Sonnenbrille", 1.5, 6.7, 4);
        product[3] = new Produkt("Strandhandtuch", 2.7, 4.3, 10);
        product[4] = new Produkt("Strandball", 2, 4);

        for (int x = 0; x < product.length; x++) {
            product[x].schreibe();
        }

        product[0].verkaufe(4);
        product[1].verkaufe();
        product[2].lieferung(2);
        product[3].getBestandsWert();
        product[4].lieferung(6);

        System.out.println("Die gesamten Produkte haben einen Wert von: " +
                (product[0].getBestandsWert() + product[1].getBestandsWert() +
                        product[2].getBestandsWert() +
                        product[3].getBestandsWert() +
                        product[4].getBestandsWert()) + "€!");

    }
}
