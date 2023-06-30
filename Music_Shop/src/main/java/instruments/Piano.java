package instruments;

public class Piano extends Instrument {

    private String type;
    private String brand;
    private int buyingCost;
    private int priceForCustomer;
    private int numOfStrings;



    public Piano(String type, String brand, int buyingCost, int priceForCustomer) {
        super(type, brand, buyingCost, priceForCustomer);
    }


    public String play(){
        return "plink-plink-plinkity-plonk";
    }

    public int calculateMarkup(int buyingPrice, int sellingPrice) {
        int markup = sellingPrice - buyingPrice;
        return markup;

    }
}
