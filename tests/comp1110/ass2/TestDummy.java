package comp1110.ass2;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

//card placement well formed

public class TestDummy {
    @Test
    public void testDummy() {

        String firstCondFail = "bdgdg";   // should be maximum three characters
        assertFalse(WarringStatesGame.isCardPlacementWellFormed(firstCondFail));

        String secondCondFail = "k5A";    // first character should be between a..g
        assertFalse(WarringStatesGame.isCardPlacementWellFormed(secondCondFail));

        String thirdCondFail = "a8A";     // second character should be between 0..7 for a
        assertFalse(WarringStatesGame.isCardPlacementWellFormed(thirdCondFail));

        String fourthCondFail = "a2b";    // fourth character is wrong
        assertFalse(WarringStatesGame.isCardPlacementWellFormed(fourthCondFail));

        String pass = "a2B";
        assertTrue(WarringStatesGame.isCardPlacementWellFormed(pass));
    }
}
