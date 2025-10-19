public class ElektronikShop {
    private int[] tastaturen;
    private int[] usb;

    public ElektronikShop(int[] tastaturen, int[] usb){
        this.tastaturen = tastaturen;
        this.usb = usb;
    }

    public int gunstigsteTastatur(){
        int min=tastaturen[0];
        for(int preis:tastaturen){
            if(preis<min)
                min=preis;
        }
        return min;
    }
    public int teuerstesProdukt(){
        int max=tastaturen[0];
        for(int preis:tastaturen){
            if(preis > max)
                max=preis;
        }
        for(int preis:usb){
            if(preis>max)
                max=preis;
        }
        return max;
    }
}
