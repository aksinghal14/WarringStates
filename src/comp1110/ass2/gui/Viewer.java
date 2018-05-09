package comp1110.ass2.gui;

import comp1110.ass2.WarringStatesGame;
import gittest.C;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Scanner;

/**
 * A very simple viewer for card layouts in the Warring States game.
 * <p>
 * NOTE: This class is separate from your main game class.  This
 * class does not play a game, it just illustrates various card placements.
 */
public class Viewer extends Application {

    private static final int VIEWER_WIDTH = 933;
    private static final int VIEWER_HEIGHT = 700;

    private static final String URI_BASE = "assets/";

    private final Group root = new Group();
    private final Group controls = new Group();
    private final Group squareg = new Group();
    private final Group pieces = new Group();

    TextField textField;

    /**
     * Draw a placement in the window, removing any previously drawn one
     *
     * @param placement A valid placement string
     */
    void makePlacement(String placement) {
        // FIXME Task 4: implement the simple placement viewer
        this.pieces.getChildren().clear();// clearing pieces

        while (root.getChildren().size() >= 36)// input string less than 36
            root.getChildren().remove(root.getChildren().size() - 1);
        placement = placement;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                Rectangle square = new Rectangle(i * 100, j * 100, 90, 90);
                Text text = new Text();
                text.setLayoutX(i * 100 + 5);
                text.setLayoutY(j * 100 + 50);


                if (i == 0 && j == 0) {
                    //4 is the location of card on the board
                    if(getIndexPlacement('4',placement)==0){
                        square.setFill(Color.WHITE);
                    }else{
                        text.setText(takeCharacter(placement.substring(getIndexPlacement('4',placement)-2, getIndexPlacement('4',placement)+1)));
                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('4',placement)-2)))));}
                } else if (i == 0 && j == 1) {
                    //5 is the location of card on the board
                    if(getIndexPlacement('5',placement)==0){
                        square.setFill(Color.WHITE);
                    }else{
                        text.setText(takeCharacter(placement.substring(getIndexPlacement('5',placement)-2, getIndexPlacement('5',placement)+1)));
                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('5',placement)-2)))));}
                } else if (i == 0 && j == 2) {
                    //6...
                    if(getIndexPlacement('6',placement)==0){
                        square.setFill(Color.WHITE);
                    }else{
                        text.setText(takeCharacter(placement.substring(getIndexPlacement('6',placement)-2, getIndexPlacement('6',placement)+1)));
                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('6',placement)-2)))));}
                } else if (i == 0 && j == 3) {
                    //7...
                    if(getIndexPlacement('7',placement)==0){
                        square.setFill(Color.WHITE);
                    }else{
                        text.setText(takeCharacter(placement.substring(getIndexPlacement('7',placement)-2, getIndexPlacement('7',placement)+1)));
                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('7',placement)-2)))));}
                } else if (i == 0 && j == 4) {
                    //8...
                    if(getIndexPlacement('8',placement)==0){
                        square.setFill(Color.WHITE);
                    }else{
                        text.setText(takeCharacter(placement.substring(getIndexPlacement('8',placement)-2, getIndexPlacement('8',placement)+1)));
                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('8',placement)-2)))));}

                } else if (i == 0 && j == 5) {
                    //9...
                    if(getIndexPlacement('9',placement)==0){
                        square.setFill(Color.WHITE);
                    }else{
                        text.setText(takeCharacter(placement.substring(getIndexPlacement('9',placement)-2, getIndexPlacement('9',placement)+1)));
                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('9',placement)-2)))));}
                } else if (i == 1 && j == 1) {
                    // Z...
                    if(getIndexPlacement('Z',placement)==0){
                        square.setFill(Color.WHITE);
                    }else{
                        text.setText(takeCharacter(placement.substring(getIndexPlacement('Z',placement)-2, getIndexPlacement('Z',placement)+1)));
                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('Z',placement)-2)))));}
                } else if (i == 1 && j == 2) {
                    // 0...
                    if(getIndexPlacement('0',placement)==0){
                        square.setFill(Color.WHITE);
                    }else{
                        text.setText(takeCharacter(placement.substring(getIndexPlacement('0',placement)-2, getIndexPlacement('0',placement)+1)));
                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('0',placement)-2)))));}
                } else if (i == 1 && j == 3) {
                    // 1...
                    if(getIndexPlacement('1',placement)==0){
                        square.setFill(Color.WHITE);
                    }else{
                        text.setText(takeCharacter(placement.substring(getIndexPlacement('1',placement)-2, getIndexPlacement('1',placement)+1)));
                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('1',placement)-2)))));}
                } else if (i == 1 && j == 0) {
                    // Y...
                    if(getIndexPlacement('Y',placement)==0){
                        square.setFill(Color.WHITE);
                    }else{
                        text.setText(takeCharacter(placement.substring(getIndexPlacement('Y',placement)-2, getIndexPlacement('Y',placement)+1)));
                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('Y',placement)-2)))));}

                } else if (i == 1 && j == 4) {
                    //2...
                    if(getIndexPlacement('2',placement)==0){
                        square.setFill(Color.WHITE);
                    }else{
                        text.setText(takeCharacter(placement.substring(getIndexPlacement('2',placement)-2, getIndexPlacement('2',placement)+1)));
                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('2',placement)-2)))));}
                } else if (i == 1 && j == 5) {
                    //3...
                    if(getIndexPlacement('3',placement)==0){
                        square.setFill(Color.WHITE);
                    }else{
                        text.setText(takeCharacter(placement.substring(getIndexPlacement('3',placement)-2, getIndexPlacement('3',placement)+1)));
                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('3',placement)-2)))));}
                } else if (i == 2 && j == 2) {
                    //U...
                    if(getIndexPlacement('U',placement)==0){
                        square.setFill(Color.WHITE);
                    }else{
                        text.setText(takeCharacter(placement.substring(getIndexPlacement('U',placement)-2, getIndexPlacement('U',placement)+1)));
                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('U',placement)-2)))));}
                } else if (i == 2 && j == 0) {
                    //S...
                    if(getIndexPlacement('S',placement)==0){
                        square.setFill(Color.WHITE);
                    }else{
                        text.setText(takeCharacter(placement.substring(getIndexPlacement('S',placement)-2, getIndexPlacement('S',placement)+1)));
                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('S',placement)-2)))));}
                } else if (i == 2 && j == 1) {
                    //T...
                    if(getIndexPlacement('T',placement)==0){
                        square.setFill(Color.WHITE);
                    }else{
                        text.setText(takeCharacter(placement.substring(getIndexPlacement('T',placement)-2, getIndexPlacement('T',placement)+1)));
                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('T',placement)-2)))));}
                } else if (i == 2 && j == 3) {
                    //V...
                    if(getIndexPlacement('V',placement)==0){
                        square.setFill(Color.WHITE);
                    }else{
                        text.setText(takeCharacter(placement.substring(getIndexPlacement('V',placement)-2, getIndexPlacement('V',placement)+1)));
                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('V',placement)-2)))));}
                } else if (i == 2 && j == 4) {
                    //W...
                    if(getIndexPlacement('W',placement)==0){
                        square.setFill(Color.WHITE);
                    }else{
                        text.setText(takeCharacter(placement.substring(getIndexPlacement('W',placement)-2, getIndexPlacement('W',placement)+1)));
                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('W',placement)-2)))));}
                } else if (i == 2 && j == 5) {
                    //X...
                    if(getIndexPlacement('X',placement)==0){
                        square.setFill(Color.WHITE);
                    }else{
                        text.setText(takeCharacter(placement.substring(getIndexPlacement('X',placement)-2, getIndexPlacement('X',placement)+1)));
                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('X',placement)-2)))));}

                } else if (i == 3 && j == 0) {
                    // M...
                    if(getIndexPlacement('M',placement)==0){
                        square.setFill(Color.WHITE);
                    }else{
                        text.setText(takeCharacter(placement.substring(getIndexPlacement('M',placement)-2, getIndexPlacement('M',placement)+1)));
                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('M',placement)-2)))));}
                } else if (i == 3 && j == 1) {
                    // N...
                    if(getIndexPlacement('N',placement)==0){
                        square.setFill(Color.WHITE);
                    }else{
                        text.setText(takeCharacter(placement.substring(getIndexPlacement('N',placement)-2, getIndexPlacement('N',placement)+1)));
                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('N',placement)-2)))));}
                } else if (i == 3 && j == 2) {
                    // O...
                    if(getIndexPlacement('O',placement)==0){
                        square.setFill(Color.WHITE);
                    }else{
                        text.setText(takeCharacter(placement.substring(getIndexPlacement('O',placement)-2, getIndexPlacement('O',placement)+1)));
                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('O',placement)-2)))));}
                } else if (i == 3 && j == 3) {
                    // P...
                    if(getIndexPlacement('P',placement)==0){
                        square.setFill(Color.WHITE);
                    }else{
                        text.setText(takeCharacter(placement.substring(getIndexPlacement('P',placement)-2, getIndexPlacement('P',placement)+1)));
                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('P',placement)-2)))));}
                } else if (i == 3 && j == 4) {
                    //Q...
                    if(getIndexPlacement('Q',placement)==0){
                        square.setFill(Color.WHITE);
                    }else{
                        text.setText(takeCharacter(placement.substring(getIndexPlacement('Q',placement)-2, getIndexPlacement('Q',placement)+1)));
                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('Q',placement)-2)))));}
                } else if (i == 3 && j == 5) {
                    //R...
                    if(getIndexPlacement('R',placement)==0){
                        square.setFill(Color.WHITE);
                    }else{
                        text.setText(takeCharacter(placement.substring(getIndexPlacement('R',placement)-2, getIndexPlacement('R',placement)+1)));
                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('R',placement)-2)))));}
                } else if (i == 4 && j == 0) {
                    ////G...
                    if(getIndexPlacement('G',placement)==0){
                        square.setFill(Color.WHITE);
                    }else{
                        text.setText(takeCharacter(placement.substring(getIndexPlacement('G',placement)-2, getIndexPlacement('G',placement)+1)));
                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('G',placement)-2)))));}
                } else if (i == 4 && j == 1) {
                    ////H...
                    if(getIndexPlacement('H',placement)==0){
                        square.setFill(Color.WHITE);
                    }else{
                        text.setText(takeCharacter(placement.substring(getIndexPlacement('H',placement)-2, getIndexPlacement('H',placement)+1)));
                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('H',placement)-2)))));}
                } else if (i == 4 && j == 2) {
                    ////I///
                    if(getIndexPlacement('I',placement)==0){
                        square.setFill(Color.WHITE);
                    }else{
                        text.setText(takeCharacter(placement.substring(getIndexPlacement('I',placement)-2, getIndexPlacement('I',placement)+1)));
                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('I',placement)-2)))));}
                } else if (i == 4 && j == 3) {
                    ////J////
                    if(getIndexPlacement('J',placement)==0){
                        square.setFill(Color.WHITE);
                    }else{
                        text.setText(takeCharacter(placement.substring(getIndexPlacement('J',placement)-2, getIndexPlacement('J',placement)+1)));
                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('J',placement)-2)))));}
                } else if (i == 4 && j == 4) {
                    /////K///
                    if(getIndexPlacement('K',placement)==0){
                        square.setFill(Color.WHITE);
                    }else{
                        text.setText(takeCharacter(placement.substring(getIndexPlacement('K',placement)-2, getIndexPlacement('K',placement)+1)));
                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('K',placement)-2)))));}
                } else if (i == 4 && j == 5) {
                    ////L////
                    if(getIndexPlacement('L',placement)==0){
                        square.setFill(Color.WHITE);
                    }else{
                        text.setText(takeCharacter(placement.substring(getIndexPlacement('L',placement)-2, getIndexPlacement('L',placement)+1)));
                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('L',placement)-2)))));}
                } else if (i == 5 && j == 0) {
                    /// A ///
                    if(getIndexPlacement('A',placement)==0){
                        square.setFill(Color.WHITE);
                    }else{
                        text.setText(takeCharacter(placement.substring(getIndexPlacement('A',placement)-2, getIndexPlacement('A',placement)+1)));
                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('A',placement)-2)))));}
                } else if (i == 5 && j == 1) {
                    ///B/////
                    if(getIndexPlacement('B',placement)==0){
                        square.setFill(Color.WHITE);
                    }else{
                        text.setText(takeCharacter(placement.substring(getIndexPlacement('B',placement)-2, getIndexPlacement('B',placement)+1)));
                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('B',placement)-2)))));}
                } else if (i == 5 && j == 2) {
                    /// C/////
                    if(getIndexPlacement('C',placement)==0){
                        square.setFill(Color.WHITE);
                    }else{
                        text.setText(takeCharacter(placement.substring(getIndexPlacement('C',placement)-2, getIndexPlacement('C',placement)+1)));
                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('C',placement)-2)))));}
                } else if (i == 5 && j == 3) {
                    ////D////
                    if(getIndexPlacement('D',placement)==0){
                        square.setFill(Color.WHITE);
                    }else{
                        text.setText(takeCharacter(placement.substring(getIndexPlacement('D',placement)-2, getIndexPlacement('D',placement)+1)));
                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('D',placement)-2)))));}
                } else if (i == 5 && j == 4) {
                    ////E////
                    if(getIndexPlacement('E',placement)==0){
                        square.setFill(Color.WHITE);
                    }else{
                        text.setText(takeCharacter(placement.substring(getIndexPlacement('E',placement)-2, getIndexPlacement('E',placement)+1)));
                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('E',placement)-2)))));}
                } else if (i == 5 && j == 5) {
                    /////F/////
                    if(getIndexPlacement('F',placement)==0){
                        square.setFill(Color.WHITE);
                    }else{
                        text.setText(takeCharacter(placement.substring(getIndexPlacement('F',placement)-2, getIndexPlacement('F',placement)+1)));
                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('F',placement)-2)))));}

                }

                root.getChildren().add(square);

                root.getChildren().add(text);
            }

            //String[] placements = new String[placement.length()];
            //for (int i = 0; i < placement.length() ; i++) {
            //  placements[i] = String.valueOf(placement.charAt(i));
            // Character name = placement.charAt(3 * i);
            //Character movement = placement.charAt((3 * i) + 1); //get the moved character
            //Character location = placement.charAt((3 * i) + 2); //get the located character
        }
    }

/*public void rect (Stage primarystage){
            AnchorPane root = new AnchorPane();
            Scene scene = new Scene(root);
            stage.setScene(scene);

            int columns = 6, rows = 6;
            Rectangle rec = null;
            for (int i = 0; i < columns; i++) {
                for (int j = 0; j < rows; j++) {

                    rec.setStroke(Color.RED);

                    root.getChildren().add(rec);
                }
            }
        }
        scene.setRoot(root);
        stage.show();*/

    /**
     * Create a basic text field for input and a refresh button.
     */
   /* private void makeControls() {
        Label label1 = new Label("Placement:");
        textField = new TextField();
        textField.setPrefWidth(300);
        Button button = new Button("Refresh");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                String placement = textField.getText();
                textField.clear();
            }
        });
// enter the number
        textField.setOnKeyPressed((KeyEvent p) -> {
            if (p.getCode() == KeyCode.ENTER) {
                String placement = textField.getText();
                textField.clear();
            }
        });
        HBox hb = new HBox();
        hb.getChildren().addAll(label1, textField, button);
        hb.setSpacing(10);
        hb.setLayoutX(130);
        hb.setLayoutY(VIEWER_HEIGHT - 50);
        controls.getChildren().add(hb);
    }
*/
    /* public void makeLocation(String placement) {
         for (int i = 0; i < placement.length() / 3; i++) {
             String country = placement.substring(i, i + 3);
             char location = country.charAt(0);
             char name = country.charAt(1);
             if (location <= 10) {

             }
             Rectangle square = new Rectangle(location % 6 , location / 6 , 90, 90);
             Text text = new Text();
             text.setLayoutX(500 + 50);
             text.setLayoutY(500 + 50);

             if (name == 'a') {
                 square.setFill(Color.RED);
             } else if (name == 'b') {
                 square.setFill(Color.GRAY);

             }
         }

     }*/
    int getIndexPlacement(Character p,String pl){
        int i = 0;
        int j =0;
        for( i = 2; i <pl.length();i=i+3){
            if(pl.charAt(i)==p){
                j = i;
            }
        }
        return j;
    }
    String takeKingdom(String p){
        String s ="";
        switch (p){
            case "a":
                s = "0x0000FF";
                break;
            case "b":
                s = "#9999ff";
                break;
            case "c":
                s = "#00ff00";
                break;
            case "d":
                s = "#660033";
                break;
            case "e":
                s = "#cc00cc";
                break;
            case "f":
                s= "#000066";
                break;
            case "g":
                s = "#cc3300";
                break;
            case "z":
                s= "#000000";
        }
        return s;
    }
    String takeCharacter(String p){
        String charcaterName = "";
        if(p.charAt(0)=='a'){
            // qin
            if(p.charAt(1)=='0'){
                charcaterName = "Lady Zhao";
            }else if(p.charAt(1)=='1'){
                charcaterName = "King Hui";
            }else if(p.charAt(1)=='2'){
                charcaterName = "Lady Mi";
            }else if(p.charAt(1)=='3'){
                charcaterName = "King Zhaoxiang";
            }else if(p.charAt(1)=='4'){
                charcaterName = "Duke Xiao";
            }else if(p.charAt(1)=='5'){
                charcaterName = "King Zhen";
            }else if(p.charAt(1)=='6'){
                charcaterName = "Bai Qi";
            }else if(p.charAt(1)=='7'){
                charcaterName = "Shang Yang";
            }
        }else if(p.charAt(0)=='b'){
            // qi
            if(p.charAt(1)=='0'){
                charcaterName = "King Xuan";
            }else if(p.charAt(1)=='1'){
                charcaterName = "King Xian";
            }else if(p.charAt(1)=='2'){
                charcaterName = "Queen Junwang";
            }else if(p.charAt(1)=='3'){
                charcaterName = "King Jian";
            }else if(p.charAt(1)=='4'){
                charcaterName = "Zhong Wuyan";
            }else if(p.charAt(1)=='5'){
                charcaterName = "Lord Menchang";
            }else if(p.charAt(1)=='6'){
                charcaterName = "Sun Bin";
            }
        }
        else if(p.charAt(0)=='c'){
            // chu
            if(p.charAt(1)=='0'){
                charcaterName = "King Kaolie";
            }else if(p.charAt(1)=='1'){
                charcaterName = "King Ai";
            }else if(p.charAt(1)=='2'){
                charcaterName = "Fu Chu";
            }else if(p.charAt(1)=='3'){
                charcaterName = "King You";
            }else if(p.charAt(1)=='4'){
                charcaterName = "Wu Qi";
            }else if(p.charAt(1)=='5'){
                charcaterName = "Lord Chunshen";
            }
        }else if(p.charAt(0)=='d'){
            // zhao
            if(p.charAt(1)=='0'){
                charcaterName = "King Xiaocheng";
            }else if(p.charAt(1)=='1'){
                charcaterName = "King Wuling";
            }else if(p.charAt(1)=='2'){
                charcaterName = "Lord Pingyuan";
            }else if(p.charAt(1)=='3'){
                charcaterName = "Li Mu";
            }else if(p.charAt(1)=='4'){
                charcaterName = "Lian Po";
            }
        }else if(p.charAt(0)=='e'){
            // han
            if(p.charAt(1)=='0'){
                charcaterName = "King Huanhui";
            }else if(p.charAt(1)=='1'){
                charcaterName = "King An";
            }else if(p.charAt(1)=='2'){
                charcaterName = "Marquess Ai";
            }else if(p.charAt(1)=='3'){
                charcaterName = "Han Fei";
            }
        }else if(p.charAt(0)=='f'){
            //wei
            if(p.charAt(1)=='0'){
                charcaterName = "King Anxi";
            }else if(p.charAt(1)=='1'){
                charcaterName = "Lord Xinling";
            }else if(p.charAt(1)=='2'){
                charcaterName = "Marquess Wei";
            }
        }else if(p.charAt(0)=='g'){
            // yan
            if(p.charAt(1)=='0'){
                charcaterName = "King Xi";
            }else if(p.charAt(1)=='1'){
                charcaterName = "Prince Dan";
            }
        }else{
            charcaterName = "Zhang Yi";
        }

        return charcaterName;
    }


    @Override
    public void start(Stage primaryStage) throws Exception {

        Label label1 = new Label("Placement:");
        textField = new TextField();
        textField.setPrefWidth(300);
        Button button = new Button("Refresh");
        button.setOnAction(new EventHandler<ActionEvent>() {
                               @Override
                               public void handle(ActionEvent e) {
                                   makePlacement( textField.getText());
                                   textField.clear();
                               }
                           }
        );
// enter the number
        textField.setOnKeyPressed((KeyEvent p) -> {
            if (p.getCode() == KeyCode.ENTER) {
                makePlacement(textField.getText());
                textField.clear();
            }
        });
        HBox hb = new HBox();
        hb.getChildren().addAll(label1, textField, button);
        hb.setSpacing(10);
        hb.setLayoutX(130);
        hb.setLayoutY(VIEWER_HEIGHT - 50);
        controls.getChildren().add(hb);
        AnchorPane anchorPane = new AnchorPane();
        Group group = new Group();
        primaryStage.setTitle("Warring States Viewer");
        squareg.setStyle("-fx-background-color: #C0C0C0;");

        final Scene scene = new Scene(root, 1000, 1000, Color.LAVENDER);

        root.getChildren().add(controls);

        BorderPane pane = new BorderPane();

        int count_col = 6;
        int count_row = 6;
        boolean evenflag = true;

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

