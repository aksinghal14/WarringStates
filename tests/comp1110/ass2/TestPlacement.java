package comp1110.ass2;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class TestPlacement {
    @Test
    public void testplacement() {
        String firstCond = "a2Bb6Fc5Fd"; // there aren't three cards
        assertFalse(WarringStatesGame.isPlacementWellFormed(firstCond));

        String secondCond = "a2cb6F"; // the first card is not well formed
        assertFalse(WarringStatesGame.isPlacementWellFormed(secondCond));

        String thirdCond = "a2Bb6Fa2B"; // the first card is repeated
        assertFalse(WarringStatesGame.isPlacementWellFormed(thirdCond));

        String fourthCond = "a2Bb6Fc3F"; // the location F has two cards
        assertFalse(WarringStatesGame.isPlacementWellFormed(fourthCond));

        String pass = "a2Bb6Fc5Rg0G"; // all conditions pass
        assertTrue(WarringStatesGame.isPlacementWellFormed(pass));
    }
}
