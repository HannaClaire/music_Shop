package instruments;

public class Banjo extends Instrument{
    private String type;
    private String brand;
    private int buyingInCost;
    private int priceForCustomer;


    public Banjo(String type, String brand, int buyingInCost, int priceForCustomer) {
        super(type, brand, buyingInCost, priceForCustomer);
    }

    public String play(){
        return "ding-ding-dinga-ding-dinga-ding-ding";
    }

    public int calculateMarkup(int buyingPrice, int sellingPrice) {
        int markup = sellingPrice - buyingPrice;
        return markup;

    }
}
