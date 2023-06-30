package vendor;

import interfaces.ISell;

public class MusicBook implements ISell {

    private String material;

    private int buyingInPrice;

    private int sellingPrice;

    public MusicBook(String material, int sellingPrice, int buyingInPrice) {
        this.material = material;
        this.buyingInPrice = buyingInPrice;
        this.sellingPrice = sellingPrice;
    }
    public int calculateMarkup(int buyingPrice, int sellingPrice) {
        int markup = sellingPrice - buyingPrice;
        return markup;

    }
}
