package instruments;

import interfaces.IPlay;
import interfaces.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String type;
    private String brand;
    private String material;
    private int buyingInCost;
    private int priceForCustomer;


    public Instrument(String type, String brand, int buyingCost, int priceForCustomer) {
        this.type = type;
        this.brand = brand;
        this.buyingInCost = buyingCost;
        this.priceForCustomer = priceForCustomer;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getBuyingCost() {
        return buyingInCost;
    }

    public void setBuyingCost(int buyingCost) {
        this.buyingInCost = buyingCost;
    }

    public int getPriceForCustomer() {
        return priceForCustomer;
    }

    public void setPriceForCustomer(int priceForCustomer) {
        this.priceForCustomer = priceForCustomer;
    }




}
