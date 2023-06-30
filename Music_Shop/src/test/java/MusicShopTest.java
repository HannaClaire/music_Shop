import instruments.AcousticGuitar;
import interfaces.ISell;
import org.junit.Before;
import org.junit.Test;
import vendor.DrumSticks;
import vendor.MusicBook;
import vendor.MusicShop;
import vendor.Strings;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {


    ArrayList stock;
    AcousticGuitar acousticGuitar;
    MusicShop musicShop;
    DrumSticks drumsticks;
    MusicBook musicBook;
    Strings strings;

    @Before
    public void before() {
        ArrayList<ISell> stock = new ArrayList<>();
        musicShop = new MusicShop(stock);
        stock.add(drumsticks);
        stock.add(strings);
        stock.add(musicBook);
    }


    @Test
    public void canAddStock() {
        assertEquals(3, musicShop.getStockSize());
        musicShop.addItemsToStock(musicBook);
        musicShop.addItemsToStock(musicBook);
        musicShop.addItemsToStock(musicBook);
        musicShop.addItemsToStock(acousticGuitar);
        assertEquals(7, musicShop.getStockSize());

    }
    @Test
    public void canRemoveStock(){
        musicShop.removeStock(musicBook);
        musicShop.removeStock(strings);
        musicShop.removeStock(drumsticks);
        assertEquals(0, musicShop.getStockSize());
    }




}
