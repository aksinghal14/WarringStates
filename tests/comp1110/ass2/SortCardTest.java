package comp1110.ass2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortCardTest {
    @Test
   public void takeCurrectCardOrder(){
       String test1 ="a0a5b8c7a2a6c8";
       assertEquals(WarringStatesGame.sortCard(test1),"a0a2a5a6b8c7c8");
       String test2 = "d2a4b4a1c1b1e0";
       // the test 2 found that the problem of getSupporter should get the card that actually be collected
       assertEquals(WarringStatesGame.sortCard(test2),"a1a4b1b4c1d2e0");
   }

}
