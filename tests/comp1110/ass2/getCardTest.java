package comp1110.ass2;
import org.junit.Test;
import static comp1110.ass2.TestUtility.PLACEMENTS;
import static org.junit.Assert.assertEquals;

public class getCardTest {
    @Test
    public void testTrue() {
        // setup is "g0Aa0Bf1Ca1Dc5Ee1Fa4Ge3He2Ia2Jc2Kd0Lf0Mb4Nd4Oa6Pc3Qe0Ra5Sc1Td1Uc4Vb5Wb0Xa7Yf2Zb10a31z92b33b64d35g16b27d28c09"
        // {"W845HGAYMNZ1VDFEBTUOI0C69RLKQ", "WSGACUXT584MNPD1YZ39FBEQ", "E8WSVUXL9F3YGA45Z0COIHBD76", |||"0CUI6495ZHJVDAEWSGKL3YMNBT", "8WEAYM45HZNBTU601V79FCDPOIL3"}

        String card = "b5d2b6d3e3a4g0a7f0b4f2a3c4a1e1c5a0c1d1d4e2b1f1g1c0e0d0c2c3";
        String setup = TestUtility.shufflePlacement(PLACEMENTS[0]);
        //for (int j = 0; j < TestUtility.MOVE_SEQUENCES[0].length-2; j++) {
            String a = "";
            String moveSequence = TestUtility.MOVE_SEQUENCES[0][0];
            for (int k = 0; k < moveSequence.length(); k++) {
                a = a + WarringStatesGame.getCard(setup, moveSequence.charAt(k));
                }
                assertEquals(a,card);

            }

    }
//}
