package comp1110.ass2;



import java.lang.reflect.Array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


/**
 * This class provides the text interface for the Warring States game
 */
public class WarringStatesGame {

    /**
     * Determine whether a card placement is well-formed according to the following:
     * - it consists of exactly three characters
     * - the first character is in the range a..g (kingdom) or is z (Zhang Yi)
     * - the second character is numeric, and is a valid character number for that kingdom (9 for Zhang Yi)
     * - the third character is in the range A .. Z or 0..9 (location)
     *
     * @param cardPlacement A string describing a card placement
     * @return true if the card placement is well-formed
     */
    //Idea- Shunyu Yao, Ruiyi Sun and Akshat Singhal
    //Author- Shunyu Yao
    static boolean isCardPlacementWellFormed(String cardPlacement) {
        // FIXME Task 2: determine whether a card placement is well-formed

        //or use the int = ascii;

        boolean b1 = false;
        boolean b2 = false;
        boolean b3 = false;

        if ((cardPlacement.charAt(0) >= 'a' && cardPlacement.charAt(0) <= 'g') || cardPlacement.charAt(0) == 'z') {
            b1 = true;
        } else {
            b1 = false;
        }

        if (cardPlacement.charAt(0) == 'a') {
            if (cardPlacement.charAt(1) >= '0' && cardPlacement.charAt(1) <= '7') {
                b2 = true;
            }
        } else if (cardPlacement.charAt(0) == 'b') {
            if (cardPlacement.charAt(1) >= '0' && cardPlacement.charAt(1) <= '6') {
                b2 = true;
            }
        } else if (cardPlacement.charAt(0) == 'c') {
            if (cardPlacement.charAt(1) >= '0' && cardPlacement.charAt(1) <= '5') {
                b2 = true;
            }
        } else if (cardPlacement.charAt(0) == 'd') {
            if (cardPlacement.charAt(1) >= '0' && cardPlacement.charAt(1) <= '4') {
                b2 = true;
            }
        } else if (cardPlacement.charAt(0) == 'e') {
            if (cardPlacement.charAt(1) >= '0' && cardPlacement.charAt(1) <= '3') {
                b2 = true;
            }
        } else if (cardPlacement.charAt(0) == 'f') {
            if (cardPlacement.charAt(1) >= '0' && cardPlacement.charAt(1) <= '2') {
                b2 = true;
            }
        } else if (cardPlacement.charAt(0) == 'g') {
            if (cardPlacement.charAt(1) >= '0' && cardPlacement.charAt(1) <= '1') {
                b2 = true;
            }
        } else if (cardPlacement.charAt(0) == 'z') {
            if (cardPlacement.charAt(1) == '9') {
                b2 = true;
            }
        } else {
            b2 = false;
        }


        if ((cardPlacement.charAt(2) >= 'A' && cardPlacement.charAt(2) <= 'Z') || (cardPlacement.charAt(2) >= '0' && cardPlacement.charAt(2) <= '9')) {
            b3 = true;
        } else {
            b3 = false;
        }

        if (b1 && b2 && b3) {
            return true;
        } else {
            return false;
        }
    }

    static String[] getCardPlacement(String placement) {
        String[] card = new String[placement.length() / 3];

        if (placement.length() % 3 == 0) {
            int j = 0;
            for (int i = 0; i < placement.length(); i = i + 3) {
                card[j] = placement.substring(i, i + 3);
                j++;
            }
        }
        return card;
    }

    static char getCardLocation(String cardPlacement) {
        return cardPlacement.charAt(2);
    }

    static String getCardStates(String cardPlacement) {
        return cardPlacement.substring(0, 2);
    }

    /**
     * Determine whether a placement string is well-formed:
     * - it consists of exactly N three-character card placements (where N = 1 .. 36);
     * - each card placement is well-formed
     * - no card appears more than once in the placement
     * - no location contains more than one card
     *
     * @param placement A string describing a placement of one or more cards
     * @return true if the placement is well-formed
     */
    //Idea- Shunyu Yao
    //Author- Shunyu Yao
    static boolean isPlacementWellFormed(String placement) {
        // FIXME Task 3: determine whether a placement is well-formed
        //check the length of the characters
        //check the characters one by one
        //using count and check if the card is appearing once
        //could use hash set to see if the location has one card

        boolean b0 = false;
        boolean b1 = false;
        boolean b2 = false;
        boolean b3 = false;


        if (placement != null && placement != "") {

            b0 = true;

            if (placement.length() % 3 == 0) {

                int countb1 = 0;
                int countb2 = 0;
                int countb3 = 0;

                for (int i = 0; i < placement.length() / 3; i = i + 3) {
                    b1 = isCardPlacementWellFormed(placement.substring(i, i + 3));
                    if (b1 == false) {
                        countb1++;
                    }
                }
                if (countb1 == 0) {
                    b1 = true;
                }

                String[] card = getCardPlacement(placement);

                String[] cardstate = new String[placement.length() / 3];
                char[] cardlocation = new char[placement.length() / 3];

                for (int i = 0; i < card.length; i++) {
                    cardstate[i] = getCardStates(card[i]);
                    cardlocation[i] = getCardLocation(card[i]);
                }

                for (int i = 0; i < cardstate.length; i++) {
                    for (int j = i + 1; j < cardstate.length; j++) {
                        if (cardstate[i].equals(cardstate[j])) {
                            countb2++;
                        }
                    }
                }
                if (countb2 == 0) {
                    b2 = true;
                }

                for (int i = 0; i < cardlocation.length; i++) {
                    for (int j = i + 1; j < cardlocation.length; j++) {
                        if (cardlocation[i] == cardlocation[j]) {
                            countb3++;
                        }
                    }
                }
                if (countb3 == 0) {
                    b3 = true;
                }

            }

        } else {
            b0 = false;
        }


        /*String[] card = getCardPlacement(placement);


        String[] cardstate = new String[placement.length()/3];
        char[] cardlocation = new char[placement.length()/3];

        for(int i=0;i<card.length;i++){
            cardstate[i] = getCardStates(card[i]);
            cardlocation[i] = getCardLocation(card[i]);
        }

        boolean b1= false;
        boolean b2= false;
        boolean b3= false;
        boolean b4= false;

        if(placement != null && placement!=""){
            b1 = true;
        }else{
            b1 = false;
        }

        for(int i=0;i<card.length;i++){
            b2 = isCardPlacementWellFormed(card[i]);
            if(b2 == false){
                break;
            }else{
                b2 =true;
            }
        }

        for(int i=0;i<cardstate.length;i++){
            for(int j=i+1;j<cardstate.length;j++){
                if(cardstate[i].equals(cardstate[j])){
                    b3 = false;
                    break;
                }
            }
        }

        for(int i=0;i<cardstate.length;i++){
            for(int j=i+1;j<cardstate.length;j++){
                if(cardlocation[i]==cardlocation[j]){
                    b4 = false;
                    break;
                }
            }
        }*/






        /*boolean b1 = false;
        boolean b2 = false;
        boolean b3 = false;


        if(placement != null && placement !="") {
            if (placement.length() % 3 == 0) {
                for (int i = 0; i < placement.length(); i = i + 3) {
                    String str1 = placement.substring(i, i + 3);
                    b1 = isCardPlacementWellFormed(str1);
                }
            } else {
                b1 = false;
            }
        }

        if(placement != null && placement !="") {
            if (placement.length() % 3 == 0) {
                String[] card = new String[placement.length() / 3];

                int j = 0;
                for (int i = 0; i < placement.length(); i = i + 3) {
                    card[j] = placement.substring(i, i + 2);
                    j++;
                }

                for (int i = 0; i < card.length; i++) {
                    for (int k = i + 1; k < card.length; k++) {
                        if (card[i].equals(card[k])) {
                            b2 = false;
                        }
                    }
                }
            } else {
                b2 = false;
            }
        }

        if(placement != null && placement !="") {
            if (placement.length() % 3 == 0) {
                String[] card = new String[placement.length() / 3];

                int j = 0;
                for (int i = 0; i < placement.length(); i = i + 3) {
                    card[j] = placement.substring(i, i + 3);
                    j++;
                }

                for (int i = 0; i < card.length; i++) {
                    for (int k = i + 1; k < card.length; k++) {
                        if (card[i].charAt(2) == card[k].charAt(2)) {
                            b3 = false;
                        }
                    }
                }
            } else {
                b3 = false;
            }
        }


        if(b1 && b2 && b3){
            return true;
        }else{
            return false;
        }*/


        if (b0 && b1 && b2 && b3) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * Determine whether a given move is legal given a provided valid placement:
     * - the location char is in the range A .. Z or 0..9
     * - there is a card at the chosen location;
     * - the location is in the same row or column of the grid as Zhang Yi's current position; and
     * - drawing a line from Zhang Yi's current location through the card at the chosen location,
     * there are no other cards along the line from the same kingdom as the chosen card
     * that are further away from Zhang Yi.
     *
     * @param placement    the current placement string
     * @param locationChar a location for Zhang Yi to move to
     * @return true if Zhang Yi may move to that location
     */
    //Author- Shunyu Yao
    public static boolean isMoveLegal(String placement, char locationChar) {
        // FIXME Task 5: determine whether a given move is legal
        //check the third character of the string placement whether it's equals a-z or 0-9
        //check the third character of the string placement equals to locationChar
        //compares the third character of the string placement and the locationChar
        //compares the third character and then compares the second character of the string placement whether there are the same.

        //if(placement.charAt(2)=='A'|placement.charAt(2)=='B'|placement.charAt(2)=='C'|placement.charAt(2)=='D'|placement.charAt(2)=='E'){
        String c = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        // if the char in the range
        if (c.indexOf(locationChar) >= 0) {
            // check the zhangyi in the range of 0-9 or A-Z
            // check char location and the zhangyi in the same line
            if (getLine(locationChar, placement) && c.indexOf(zhangyilocation(placement)) >= 0 && isInSameLine(zhangyilocation(placement), locationChar) && notNoCard(locationChar, placement)) {
                return true;
            }
        }
        return false;
    }

    // to find the location of zhangyi
    public static char zhangyilocation(String placement) {
        return placement.charAt(placement.indexOf('z') + 2);
    }

    public static char locationC(char locationChar, String placement) {
        for (int q = 2; q < placement.length(); q = q + 3) {
            if (placement.charAt(q) == locationChar) {
                return placement.charAt(q - 2);
            }
        }
        return '1';
    }

    public static boolean isInSameLine(char zhangyilocation, char locationChar) {
        String[] row = new String[]{"4YSMGA", "5ZTNHB", "60UOIC", "71VPJD", "82WQKE", "93XRLF"};
        String[] column = new String[]{"ABCDEF", "GHIJKL", "MNOPQR", "STUVWX", "YZ0123", "456789"};
        for (String s : row) {
            // check the location should be the same line
            if (s.indexOf(locationChar) >= 0 && s.indexOf(zhangyilocation) >= 0) {
                return true;
            }
        }
        for (String c : column) {
            if (c.indexOf(locationChar) >= 0 && c.indexOf(zhangyilocation) >= 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean notNoCard(char locationChar, String placement) {
        for (int i = 2; i <= placement.length() - 1; i = i + 3) {
            if (placement.charAt(i) == locationChar && placement.charAt(i - 2) != 'z') {
                return true;
            }
        }
        return false;
    }

    public static boolean getLine(char locationChar, String placement) {
        //zhangyilocation(placement) should known
        // the location of place
        String[] s = new String[]{"AGMSY4", "BHNTZ5", "CIOU06", "DJPV17", "EKQW28", "FLRX39", "ABCDEF", "GHIJKL", "MNOPQR", "STUVWX", "YZ0123", "456789"};
        for (String i : s) {
            int distance = i.indexOf(zhangyilocation(placement)) - i.indexOf(locationChar);
            int d = Math.abs(distance);
            if (i.indexOf(locationChar) >= 0 && i.indexOf(zhangyilocation(placement)) >= 0) {
                // find the string of zhangyi and next move
                for (int k = 0; k < i.length(); k = k + 1) {
                    for (int u = 2; u < placement.length(); u = u + 3) {
                        if (i.indexOf(locationChar) >= i.indexOf(zhangyilocation(placement)) && k > i.indexOf(zhangyilocation(placement))) {
                            if (i.charAt(k) == placement.charAt(u)) {
                                if (placement.charAt(u - 2) == locationC(locationChar, placement)) {
                                    int b1 = i.indexOf(zhangyilocation(placement)) - k;
                                    int b2 = Math.abs(b1);
                                    if (b2 > d) {
                                        return false;
                                    }
                                }
                            }
                        } else if (i.indexOf(locationChar) < i.indexOf(zhangyilocation(placement)) && k < i.indexOf(zhangyilocation(placement))) {
                            if (i.charAt(k) == placement.charAt(u)) {
                                if (placement.charAt(u - 2) == locationC(locationChar, placement)) {
                                    int c1 = i.indexOf(zhangyilocation(placement)) - k;
                                    int c2 = Math.abs(c1);
                                    if (c2 > d) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }
        return true;
    }

    /**
     * Determine whether a move sequence is valid.
     * To be valid, the move sequence must be comprised of 1..N location characters
     * showing the location to move for Zhang Yi, and each move must be valid
     * given the placement that would have resulted from the preceding sequence
     * of moves.
     *
     * @param setup        A placement string representing the board setup
     * @param moveSequence a string of location characters representing moves
     * @return True if the placement sequence is valid
     */
    //Author- Ruiyi Sun
    static boolean isMoveSequenceValid(String setup, String moveSequence) {
        // FIXME Task 6: determine whether a placement sequence is valid
        // check if there is the same char in the moveSequence and the char in the moveSequence should be the char in setup
        // use setup to create several strings as dictionaries for the a valid move
        // for example row: "4YSMGA","5ZTNHB"... column: "ABCDEF","GHIJKL"
        // check if first char and second char in the same string(row string or column)
        // check all chars in the moveSequence and return true

        //char zhangyiinitiallocation = zhangyilocation(setup);
        boolean b = true;

        String placement = setup;

        for (int i = 0; i < moveSequence.length(); i++) {
            if (isMoveLegal(placement, moveSequence.charAt(i))) {
                placement = updatePlacement(placement, zhangyilocation(placement), moveSequence.charAt(i));

            } else {
                b = false;
            }
        }


        if (b) {
            return true;
        } else {
            return false;
        }

    }
    public static String updatePlacement(String placement, char zhangyilocation, char goallocation) {
        StringBuilder sb = new StringBuilder(placement);
        char goalState = locationC(goallocation, sb.toString());
        if (sb.toString().indexOf('z') >= 0) {
            sb.delete(sb.toString().indexOf('z'), sb.toString().indexOf('z') + 3);
        }
            //String str = getStringInLine(zhangyilocation,goallocation);
        String str = "";
        String[] s = new String[]{"AGMSY4", "BHNTZ5", "CIOU06", "DJPV17", "EKQW28", "FLRX39", "ABCDEF", "GHIJKL", "MNOPQR", "STUVWX", "YZ0123", "456789"};
        for (String st : s) {
            if(st.indexOf(zhangyilocation) >= 0 && st.indexOf(goallocation) >= 0){
                str =  str+st;
                break;
            }
        }
            int a = str.indexOf(zhangyilocation);
            int b = str.indexOf(goallocation);
            int f = Math.max(a,b);
            int stt = Math.min(a,b);
                for (int i = stt; i<=f; i++) {
                        for (int j = 2; j < sb.toString().length(); j = j + 3) {
                            if (sb.toString().charAt(j) == str.charAt(i)) {
                                if (sb.toString().charAt(j - 2) == goalState && goallocation != sb.toString().charAt(j)) {
                                    sb.delete((j - 2), j + 1);
                                } else if (goallocation == sb.toString().charAt(j)) {
                                    sb.setCharAt(j - 1, '9');
                                    sb.setCharAt(j - 2, 'z');
                                }
                                break;
                            }
                        }
                }

        return sb.toString();
    }

    public static String getStringInLine(char zhangyilocation,char goallocation){
        String[] s = new String[]{"AGMSY4", "BHNTZ5", "CIOU06", "DJPV17", "EKQW28", "FLRX39", "ABCDEF", "GHIJKL", "MNOPQR", "STUVWX", "YZ0123", "456789"};
        for (String str : s) {
            if(str.indexOf(zhangyilocation) >= 0 && str.indexOf(goallocation) >= 0){
                return str;
            }
        }
        return "";
    }
    public static String WinCard(String setup,String moveSequence,char goallocation) {
        String sb = "";

        for(int i =0;i<moveSequence.length();i++){
            if(moveSequence.charAt(i)==goallocation){
                char zhangyi = zhangyilocation(setup);
                String str = getStringInLine(zhangyi,goallocation);
                    int zhangyiIndex = str.indexOf(zhangyi);
                    int goalIndex = str.indexOf(goallocation);
                if(zhangyiIndex>=0&&goalIndex>=0){
                    int finish = Math.max(zhangyiIndex,goalIndex);
                    int start = Math.min(zhangyiIndex,goalIndex)+1;
                        for(int k =start;k<finish;k++){
                            if(getCard(setup,str.charAt(k)).charAt(0)==getCard(setup,goallocation).charAt(0)){
                                sb = sb +getCard(setup,str.charAt(k));
                            }
                        }
                    }
                   break;// the break is really important to reduce the waste of time
            }else{
                setup = updatePlacement(setup,zhangyilocation(setup),moveSequence.charAt(i));
            }
        }
        return sb;
        }

    /**
     * Get the list of supporters for the chosen player, given the provided
     * setup and move sequence.
     * The list of supporters is a sequence of two-character card IDs, representing
     * the cards that the chosen player collected by moving Zhang Yi.
     *
     * @param setup        A placement string representing the board setup
     * @param moveSequence a string of location characters representing moves
     * @param numPlayers   the number of players in the game, must be in the range [2..4]
     * @param playerId     the player number for which to get the list of supporters, [0..(numPlayers-1)]
     * @return the list of supporters for the given player
     */
    //Author- Ruiyi Sun
    public static String getSupporters(String setup, String moveSequence, int numPlayers, int playerId) {
        // FIXME Task 7: get the list of supporters for a given player after a sequence of moves
        // distribute the sting to a list of list with the number of players
        // use the for loop or something else to  extract the elements in each list of list with the playerId(index)
        // combine elements and return a string
        // transfer the string to a 2-char-string(a-g,0-7)
        String supporter = "";
            if(moveSequence.length()%numPlayers==0||moveSequence.length()%numPlayers<playerId+1){
            for (int i = 0; i < (moveSequence.length()-moveSequence.length()%numPlayers) / numPlayers; i++) {
                supporter =  supporter + getCard(setup, moveSequence.charAt(playerId + i * numPlayers)) +WinCard(setup,moveSequence,moveSequence.charAt(playerId + i * numPlayers));
                // should get the currect card between move seq
             }
            }else if (moveSequence.length()%numPlayers>=playerId+1){
                for (int i = 0; i <= (moveSequence.length()-moveSequence.length()%numPlayers) / numPlayers; i++) {
                    supporter =  supporter + getCard(setup, moveSequence.charAt(playerId + i * numPlayers))+WinCard(setup,moveSequence,moveSequence.charAt(playerId + i * numPlayers));
                }
            }
        return supporter;
    }
    private static String getCard(String setup,char s ){
        for(int j = 2; j<setup.length();j = j+3){
            if(setup.charAt(j)==s){
                return setup.substring(j-2,j);
            }
        }
        return "  ";
    }
    /**
     * Given a setup and move sequence, determine which player controls the flag of each kingdom
     * after all the moves in the sequence have been played.
     *
     * @param setup        A placement string representing the board setup
     * @param moveSequence a string of location characters representing a sequence of moves
     * @param numPlayers   the number of players in the game, must be in the range [2..4]
     * @return an array containing the player ID who controls each kingdom, where
     * - element 0 contains the player ID of the player who controls the flag of Qin
     * - element 1 contains the player ID of the player who controls the flag of Qi
     * - element 2 contains the player ID of the player who controls the flag of Chu
     * - element 3 contains the player ID of the player who controls the flag of Zhao
     * - element 4 contains the player ID of the player who controls the flag of Han
     * - element 5 contains the player ID of the player who controls the flag of Wei
     * - element 6 contains the player ID of the player who controls the flag of Yan
     * If no player controls a particular house, the element for that house will have the value -1.
     */
    //Author- Ruiyi Sun
    public static int[] getFlags(String setup, String moveSequence, int numPlayers) {
        // FIXME Task 8: determine which player controls the flag of each kingdom after a given sequence of moves
        //////reduce the loop///

        // use the getSupporters function to get a string
        // get the odd index char in the string
        // count the same char to get the number of flag
        // compare the flag to others and take the highest number to the list
        // if no one has this flag, add (-1) to the list.
        // ps: if there are the same number of flag, go back to the string of each player and get the index of the last appearance of this char
        // then add the playerId to the list
        int[] flag = new int[7];
        String kingdom = "abcdefg";
        for (int a = 0; a < flag.length; a++) {
            int j = 0;// the number of flag in per player
            int[] flagOfOne = new int[numPlayers];
            //Integer[] flagOfOne = new Integer[numPlayers];
            for (int i = 0; i < numPlayers; i++) {
                String s = getSupporters(setup, moveSequence, numPlayers, i);
                flagOfOne[i] = getNumberOfKingdom(s, kingdom.charAt(a));
            }
            int max=-1000;
            for(int o =0;o<flagOfOne.length;o++){
                if(flagOfOne[o]>max){
                    max = flagOfOne[o];
                }
            }
            //int max = Collections.max(Arrays.asList(flagOfOne));
            //ArrayList<Integer> takeSameNumber = new ArrayList<>();
            int[] takeSameNumber = new int[numPlayers];
            int number = 0;
            for (int m = 0; m < flagOfOne.length; m++) {
                if (flagOfOne[m]==max) {
                    j++;
                    takeSameNumber[m]=m;
                    number = m;
                }else{
                    takeSameNumber[m]=-1;
                }
            }
            if(max !=0){
                if(j>1){
                    for(int i =moveSequence.length()-1;i>=0;i--){
                        if(getCard(setup,moveSequence.charAt(i)).charAt(0)==kingdom.charAt(a)){
                            int h = (i+1)% numPlayers ; // player ID currently
                            if(h!=0){
                                h = h-1;
                            }else {
                                if(i!=0) {
                                h = numPlayers-1;
                                }else {
                                h = 0;
                                }
                            }
                            if(takeSameNumber[h]!=-1){
                                flag[a] = h;
                                break;
                            }
                        }
                    }
                }else{
                    flag[a]=number;
                }
            }else{
                flag[a]= -1;
            }
        }
        return flag;
    }

    public static int getNumberOfKingdom(String getSupporter,char k){
        int j = 0;
        for (int i =0;i<getSupporter.length();i= i+2){
            if(getSupporter.charAt(i)==k){
                j = j+1;
            }
        }
        return j;
    }
    /**
     * Generate a legal move, given the provided placement string.
     * A move is valid if:
     * - the location char is in the range A .. Z or 0..9
     * - there is a card at the chosen location;
     * - the destination location is different to Zhang Yi's current location;
     * - the destination is in the same row or column of the grid as Zhang Yi's current location; and
     * - drawing a line from Zhang Yi's current location through the card at the chosen location,
     * there are no other cards along the line from the same kingdom as the chosen card
     * that are further away from Zhang Yi.
     * If there is no legal move available, return the null character '\0'.
     * @param placement the current placement string
     * @return a location character representing Zhang Yi's destination for the move
     */
    //Author- Shunyu Yao
    public static char generateMove(String placement) {
        // FIXME Task 10: generate a legal move

        char goallocation;
        char result = '\0';
//location char is in the range A-Z
        for(goallocation = 'A';goallocation<='Z';goallocation++){
            if(isMoveLegal(placement,goallocation)){
                result = goallocation;
                break;
            }
        }
//location char is in the range 0-9
        for(goallocation = '0';goallocation<='9';goallocation++){
            if(isMoveLegal(placement,goallocation)){
                result = goallocation;
                break;
            }
        }

        if(result != '\0'){
            return result;
        }else
        {
            return '\0';
        }
    }
}
