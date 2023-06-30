package vendor;

import interfaces.ISell;


import java.util.ArrayList;

public class MusicShop {



    private ArrayList<ISell>stock;


    public MusicShop(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public void addItemsToStock(ISell item){
        stock.add(item);
    }

    public int getStockSize() {
        return stock.size();
    }

    public void removeStock(ISell item){
        stock.remove(item);
    }
}
