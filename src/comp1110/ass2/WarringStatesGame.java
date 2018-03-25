package comp1110.ass2;

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
    static boolean isCardPlacementWellFormed(String cardPlacement) {
        // FIXME Task 2: determine whether a card placement is well-formed

        //or use the int = ascii;

        boolean b1 = false;
        boolean b2 = false;
        boolean b3 = false;

        if((cardPlacement.charAt(0) >= 'a' && cardPlacement.charAt(0) <= 'g')||cardPlacement.charAt(0) == 'z'){
            b1 = true;
        }else{
            b1 = false;
        }

        if(cardPlacement.charAt(0) == 'a'){
            if(cardPlacement.charAt(1) >= '0' && cardPlacement.charAt(1)<='7'){
                b2 = true;
            }
        }else if(cardPlacement.charAt(0) == 'b'){
            if(cardPlacement.charAt(1) >= '0' && cardPlacement.charAt(1)<='6' ){
                b2 = true;
            }
        }else if(cardPlacement.charAt(0) == 'c'){
            if(cardPlacement.charAt(1) >= '0' && cardPlacement.charAt(1)<='5' ){
                b2 = true;
            }
        }else if(cardPlacement.charAt(0) == 'd'){
            if(cardPlacement.charAt(1) >= '0' && cardPlacement.charAt(1)<='4' ){
                b2 = true;
            }
        }else if(cardPlacement.charAt(0) == 'e'){
            if(cardPlacement.charAt(1) >= '0' && cardPlacement.charAt(1)<='3' ){
                b2 = true;
            }
        }else if(cardPlacement.charAt(0) == 'f'){
            if(cardPlacement.charAt(1) >= '0' && cardPlacement.charAt(1)<='2' ){
                b2 = true;
            }
        }else if(cardPlacement.charAt(0) == 'g'){
            if(cardPlacement.charAt(1) >= '0' && cardPlacement.charAt(1)<='1' ){
                b2 = true;
            }
        }else if(cardPlacement.charAt(0) == 'z'){
            if(cardPlacement.charAt(1) == '9'){
                b2 = true;
            }
        }else{
            b2 = false;
        }


        if((cardPlacement.charAt(2) >='A' && cardPlacement.charAt(2)<='Z')||(cardPlacement.charAt(2)>='0'&&cardPlacement.charAt(2)<='9')){
            b3 = true;
        }else{
            b3 = false;
        }

        if(b1 && b2 && b3){
            return true;
        }else{
            return false;
        }
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
    static boolean isPlacementWellFormed(String placement) {
        // FIXME Task 3: determine whether a placement is well-formed
        //check the length of the characters
        //check the characters one by one
        //using count and check if the card is appearing once
        //could use hash set to see if the location has one card

        //boolean b = false;
        boolean b1 = false;
        //boolean b2 = false;
        //boolean b3 = false;



        if(placement.length()%3 == 0){
            for(int i=0;i<placement.length();i=i+3){
                String str1 = placement.substring(i,i+3);
                b1 = isCardPlacementWellFormed(str1);
            }
        }else{
            b1 = false;
        }

        /*
        String[] card = new String[placement.length()/3];
        char[] location = new char[placement.length()/3];
        for(int i=0;i<placement.length();i=i+3){
            for(int j=0;j<placement.length()/3;j++) {
                card[j] = placement.substring(i, i + 2);
                location[j] = placement.charAt(i+2);
            }
        }
        for(int i =0;i<card.length;i++){
            for(int j=0;j<card.length;j++){
                if(card[i].equals(card[j])){
                    b2 = false;
                }else{
                    b2 = true;
                }
            }
        }*/




        /*
        if(placement.length()%3 == 0){
            for(int i=0;i<placement.length();i=i+3){
                for(int j=0;j<3;j++){
                    String str = placement.substring(i,i+3);
                    b = isCardPlacementWellFormed(str);
                }
            }
        }else{
            return false;
        }*/

        /*
        boolean b1 = false;
        boolean b2 = false;

        if(placement.charAt(0)=='a'){
            if(placement.charAt(1)>'0'&&placement.charAt(1)<'7'){
                b1 = true;
            }
        }else if(placement.charAt(0)=='b'){
            if(placement.charAt(1)>'0'&&placement.charAt(1)<'6'){
                b1 = true;
            }
        }else if(placement.charAt(0)=='c'){
            if(placement.charAt(1)>'0'&&placement.charAt(1)<'5'){
                b1 = true;
            }
        }else if(placement.charAt(0)=='d'){
            if(placement.charAt(1)>'0'&&placement.charAt(1)<'4'){
                b1 = true;
            }
        }else if(placement.charAt(0)=='e'){
            if(placement.charAt(1)>'0'&&placement.charAt(1)<'3'){
                b1 = true;
            }
        }else if(placement.charAt(0)=='f'){
            if(placement.charAt(1)>'0'&&placement.charAt(1)<'2'){
                b1 = true;
            }
        }else if(placement.charAt(0)=='g'){
            if(placement.charAt(1)>'0'&&placement.charAt(1)<'1'){
                b1 = true;
            }
        }else{
            b1 = false;
        }


        if((placement.charAt(2) >='A' && placement.charAt(2)<='Z')||(placement.charAt(2)>='0'&&placement.charAt(2)<='9')){
            b2 = true;
        }else{
            b2 = false;
        }


        if(b1 && b2){
            return true;
        }else{
            return false;
        }*/


        if(b1){
            return true;
        }else{
            return false;
        }


    }

    /**
     * Determine whether a given move is legal given a provided valid placement:
     * - the location char is in the range A .. Z or 0..9
     * - there is a card at the chosen location;
     * - the location is in the same row or column of the grid as Zhang Yi's current position; and
     * - drawing a line from Zhang Yi's current location through the card at the chosen location,
     *   there are no other cards along the line from the same kingdom as the chosen card
     *   that are further away from Zhang Yi.
     * @param placement    the current placement string
     * @param locationChar a location for Zhang Yi to move to
     * @return true if Zhang Yi may move to that location
     */
    public static boolean isMoveLegal(String placement, char locationChar) {
        // FIXME Task 5: determine whether a given move is legal
        //check the third character of the string placement whether it's equals a-z or 0-9
        //check the third character of the string placement equals to locationChar
        //compares the third character of the string placement and the locationChar
        //compares the third character and then compares the second character of the string placement whether there are the same.
        //if(placement.charAt(2)=='A'|placement.charAt(2)=='B'|placement.charAt(2)=='C'|placement.charAt(2)=='D'|placement.charAt(2)=='E'){
        String c = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        // if the char in the range
        if(c.indexOf(locationChar)>=0){
            // check the zhangyi in the range of 0-9 or A-Z
            // check char location and the zhangyi in the same line
            if(getLine(locationChar,placement)&&c.indexOf(zhangyilocation(placement))>=0 && isInSameLine(zhangyilocation(placement),locationChar)&&notNoCard(locationChar,placement)){
                    return true;
            }
        }
        return false;
    }
    // to find the location of zhangyi
    public static char zhangyilocation(String placement){
        return placement.charAt(placement.indexOf('z')+2);
    }
    public static char locationC(char locationChar,String placement){
        for(int q =2;q< placement.length();q= q+3 ){
            if(placement.charAt(q)== locationChar){
                return placement.charAt(q-2);
            }
        }
        return '1';
    }

    public static boolean isInSameLine(char zhangyilocation,char locationChar){
        String[] row = new String[]{"4YSMGA","5ZTNHB","60UOIC","71VPJD","82WQKE","93XRLF"};
        String[] column = new String[]{"ABCDEF","GHIJKL","MNOPQR","STUVWX","YZ0123","456789"};
        for(String s:row){
            // check the location should be the same line
            if(s.indexOf(locationChar)>=0&&s.indexOf(zhangyilocation)>=0){
                return true;
            }
        }
        for(String c :column){
            if(c.indexOf(locationChar)>=0 &&c.indexOf(zhangyilocation)>=0) {
               return true;
            }
        }
        return false;
    }

    public static boolean notNoCard(char locationChar,String placement){
        for(int i = 2; i<=placement.length()-1;i= i+3){
            if(placement.charAt(i)==locationChar){
                return true;
            }
        }
        return false;
    }

    public static boolean getLine(char locationChar,String placement){
        //zhangyilocation(placement) should known
        // the location of place
        String[] s = new String[]{"AGMSY4","BHNTZ5","CIOU06","DJPV17","EKQW28","FLRX39","ABCDEF","GHIJKL","MNOPQR","STUVWX","YZ0123","456789"};
        for(String i: s){
            int distance = i.indexOf(zhangyilocation(placement))-i.indexOf(locationChar);
            int d = Math.abs(distance);
            if(i.indexOf(locationChar)>=0 && i.indexOf(zhangyilocation(placement))>=0){
                // find the string of zhangyi and next move
                for(int k  = 0; k < i.length();k = k+1){
                    for(int u = 2;u<placement.length();u = u+3){
                        if(i.indexOf(locationChar)>=i.indexOf(zhangyilocation(placement))&& k>i.indexOf(zhangyilocation(placement))) {
                            if (i.charAt(k) == placement.charAt(u)) {
                                if (placement.charAt(u - 2) == locationC(locationChar, placement)) {
                                    int b1 = i.indexOf(zhangyilocation(placement)) - k;
                                    int b2 = Math.abs(b1);
                                    if (b2 > d) {
                                        return false;
                                    }
                                }
                            }
                        }else if(i.indexOf(locationChar)<i.indexOf(zhangyilocation(placement))&& k<i.indexOf(zhangyilocation(placement)) ){
                            if(i.charAt(k)==placement.charAt(u)) {
                                if(placement.charAt(u-2)==locationC(locationChar,placement)){
                                    int c1 = i.indexOf(zhangyilocation(placement)) - k;
                                    int c2 = Math.abs(c1);
                                    if(c2>d){
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
    static boolean isMoveSequenceValid(String setup, String moveSequence) {
        // FIXME Task 6: determine whether a placement sequence is valid
        // check if there is the same char in the moveSequence and the char in the moveSequence should be the char in setup
        // use setup to create several strings as dictionaries for the a valid move
        // for example row: "4YSMGA","5ZTNHB"... column: "ABCDEF","GHIJKL"
        // check if first char and second char in the same string(row string or column)
        // check all chars in the moveSequence and return true
        return false;
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
    public static String getSupporters(String setup, String moveSequence, int numPlayers, int playerId) {
        // FIXME Task 7: get the list of supporters for a given player after a sequence of moves
        // distribute the sting to a list of list with the number of players
        // use the for loop or something else to  extract the elements in each list of list with the playerId(index)
        // combine elements and return a string
        // transfer the string to a 2-char-string(a-g,0-7)
        return null;
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
    public static int[] getFlags(String setup, String moveSequence, int numPlayers) {
        // FIXME Task 8: determine which player controls the flag of each kingdom after a given sequence of moves
        // use the getSupporters function to get a string
        // get the odd index char in the string
        // count the same char to get the number of flag
        // compare the flag to others and take the highest number to the list
        // if no one has this flag, add (-1) to the list.
        // ps: if there are the same number of flag, go back to the string of each player and get the index of the last appearance of this char
        // then add the playerId to the list
        return null;
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
    public static char generateMove(String placement) {
        // FIXME Task 10: generate a legal move
        return '\0';
    }
}
