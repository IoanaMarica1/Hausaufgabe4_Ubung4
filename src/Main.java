public class Main {
    public static void main(String[] args) {
        int[] tastaturen = {40, 50, 60, 30};
        int[] usb = {8, 12};
        int budget = 60;
        for(int i = 0; i < tastaturen.length; i++){
            if(tastaturen[i]<0){
                System.out.println("Ungultiger Preis: "+tastaturen[i]);
                return;
            }
        }
        for(int i = 0; i < usb.length; i++){
            if(usb[i]<0){
                System.out.println("Ungultiger Preis: "+usb[i]);
                return;
            }
        }

        ElektronikShop shop = new ElektronikShop(tastaturen, usb);

        System.out.println("Gunstigste Tastatur: " + shop.gunstigsteTastatur());
        System.out.println("Teuerstes Produkt: " + shop.teuerstesProdukt());
        System.out.println("Teuerster USB mit Budget: " + shop.teuersterUSBMitBudget(budget));
        System.out.println("Maximale Ausgabe mit Budget: " + shop.maxAusgabeMitBudget(budget));
    }
}
