package comp1110.ass2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WinCardTest {
    @Test
    public void testPass(){
        String setup = "g0Aa0Bf1Ca1Dc5Ee1Fa4Ge3He2Ia2Jc2Kd0Lf0Mb4Nd4Oa6Pc3Qe0Ra5Sc1Td1Uc4Vb5Wb0Xa7Yf2Zb10a31z92b33b64d35g16b27d28c09";
        String movesequence = "W845HGAYMNZ1VDFEBTUOI0C69RLKQ";
        assertEquals(WarringStatesGame.WinCard(setup,movesequence,'B'),"");
        assertEquals(WarringStatesGame.WinCard(setup,movesequence,'D'),"a2a6");
    }
    // so the winCard function should be no problem if the card do not take before the player
}
