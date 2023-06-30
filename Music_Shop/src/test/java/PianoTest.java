import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

        Piano piano;
        String type;
        String brand;
        int buyingInCost;
        int priceForCustomer;


        @Before
        public void before(){
                piano = new Piano("Grand", "Yamaha", 30000, 40000);
        }

        @Test
        public void hasType(){
                assertEquals("Grand", piano.getType());
        }
        @Test
        public void hasBrand(){
                assertEquals("Yamaha", piano.getBrand());
        }
        @Test
        public void hasBuyingCost(){
                assertEquals(30000, piano.getBuyingCost());
        }
        @Test
        public void hasCustomerPrice(){
                assertEquals(40000, piano.getPriceForCustomer());
        }

        @Test
        public void canSetType(){
                piano.setType("Electric");
                assertEquals("Electric", piano.getType());
        }






}
