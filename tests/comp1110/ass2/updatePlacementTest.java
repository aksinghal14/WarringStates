package comp1110.ass2;

import org.junit.Test;
import static comp1110.ass2.TestUtility.*;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class updatePlacementTest {
    @Test
    public void testCorrect(){
        for (int i = 0; i < PLACEMENTS.length; i++) {
            for (int j = 0; j < TestUtility.MOVE_SEQUENCES[i].length; j++) {
                String setup = TestUtility.shufflePlacement(PLACEMENTS[i]);
                String moveSequence = TestUtility.MOVE_SEQUENCES[i][j];
                for(int k = 0;k<moveSequence.length();k++){
                    setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),moveSequence.charAt(k));
                }
                assertTrue("Expect" +true+ "but got "+ setup,setup.indexOf('z')>=0);
            }
        }

    }
    @Test
    public void  testWrongSequence(){
        for (int i = 0; i < PLACEMENTS.length; i++) {
            for (int j = 0; j < TestUtility.BAD_MOVE_SEQUENCES[i].length; j++) {
                String setup = TestUtility.shufflePlacement(PLACEMENTS[i]);
                String moveSequence = TestUtility.BAD_MOVE_SEQUENCES[i][j];
                for(int k = 0;k<moveSequence.length();k++){
                    if(!WarringStatesGame.isMoveLegal(setup,moveSequence.charAt(k))){
                        assertFalse("Expect" +false+ "but got "+ setup,WarringStatesGame.isMoveLegal(setup,moveSequence.charAt(k)));
                    } else{
                    setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),moveSequence.charAt(k));
                    }
                }

            }
        }
    }
    @Test
    public  void testRandomSequence(){
        // take some random setup(maybe legal or illegal sequence)
        String setup = TestUtility.generateRandomSetup();
        String moveSequence = "";
        for(int i =2;i<setup.length();i=i+3){
            moveSequence = moveSequence + setup.charAt(i);
        }
            for (int j = 0; j < setup.length(); j++) {
                for(int k = 0;k<moveSequence.length();k++){
                    if(!WarringStatesGame.isMoveLegal(setup,moveSequence.charAt(k))){
                        assertFalse("Expect" +false+ "but got "+ setup,WarringStatesGame.isMoveLegal(setup,moveSequence.charAt(k)));
                    } else{
                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),moveSequence.charAt(k));
                        assertTrue("Expect" +true+ "but got "+ setup,setup.indexOf('z')>=0);
                    }

                }

            }
        }
    }

