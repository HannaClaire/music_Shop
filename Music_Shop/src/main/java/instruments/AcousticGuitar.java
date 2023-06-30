package instruments;

public class AcousticGuitar extends Instrument{
    private String type;
    private String brand;
    private int buyingInCost;
    private int priceForCustomer;


    public AcousticGuitar(String type, String brand, int buyingInCost, int priceForCustomer) {
        super(type, brand, buyingInCost, priceForCustomer);
    }

    public String play(){
        return "strummmmmm";
    }

    public int calculateMarkup(int buyingPrice, int sellingPrice) {
        int markup = sellingPrice - buyingPrice;
        return markup;

    }
}
