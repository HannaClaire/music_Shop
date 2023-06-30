package instruments;

public class DrumKit extends Instrument{
    private String type;
    private String brand;
    private int buyingCost;
    private int priceForCustomer;


    public DrumKit(String type, String brand, int buyingCost, int priceForCustomer) {
        super(type, brand, buyingCost, priceForCustomer);
    }

    public String play(){
        return "dum-dum-ptsss";
    }

    public int calculateMarkup(int buyingPrice, int sellingPrice) {
        int markup = sellingPrice - buyingPrice;
        return markup;

    }
}
