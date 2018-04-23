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

        String[] piece = new String[placement.length() / 3];
        for (int i = 0; i < placement.length() / 3; i++) {
            piece[i] = placement.substring(3 * i, (3 * i) + 2);
            Character name = placement.charAt(3 * i);
            Character movement = placement.charAt((3 * i) + 1); //get the moved character
            Character location = placement.charAt((3 * i) + 2); //get the located character
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
    private void makeControls() {
        Label label1 = new Label("Placement:");
        textField = new TextField();
        textField.setPrefWidth(300);
        Button button = new Button("Refresh");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                makePlacement(textField.getText());
                textField.clear();
            }
        });
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
    }

    public void makeLocation(String placement) {
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
        String a = "";
        if(p.charAt(0)=='a'){
            if(p.charAt(1)=='0'){
                a = "Lady Zhao";
            }else if(p.charAt(1)=='1'){
                a = "King Hui";
            }else if(p.charAt(1)=='2'){
                a = "Lady Mi";
            }else if(p.charAt(1)=='3'){
                a = "King Zhaoxiang";
            }else if(p.charAt(1)=='4'){
                a = "Duke Xiao";
            }else if(p.charAt(1)=='5'){
                a = "King Zhen";
            }else if(p.charAt(1)=='6'){
                a = "Bai Qi";
            }else if(p.charAt(1)=='7'){
                a = "Shang Yang";
            }
        }else if(p.charAt(0)=='b'){
            if(p.charAt(1)=='0'){
                a = "King Xuan";
            }else if(p.charAt(1)=='1'){
                a = "King Xian";
            }else if(p.charAt(1)=='2'){
                a = "Queen Junwang";
            }else if(p.charAt(1)=='3'){
                a = "King Jian";
            }else if(p.charAt(1)=='4'){
                a = "Zhong Wuyan";
            }else if(p.charAt(1)=='5'){
                a = "Lord Menchang";
            }else if(p.charAt(1)=='6'){
                a = "Sun Bin";
            }
        }// not define chu - ---
        else if(p.charAt(0)=='c'){
            if(p.charAt(1)=='0'){
                a = "King Xuan";
            }else if(p.charAt(1)=='1'){
                a = "King Xian";
            }else if(p.charAt(1)=='2'){
                a = "Queen Junwang";
            }else if(p.charAt(1)=='3'){
                a = "King Jian";
            }else if(p.charAt(1)=='4'){
                a = "Zhong Wuyan";
            }else if(p.charAt(1)=='5'){
                a = "Lord Menchang";
            }
        }else if(p.charAt(0)=='d'){
            if(p.charAt(1)=='0'){
                a = "King Xuan";
            }else if(p.charAt(1)=='1'){
                a = "King Xian";
            }else if(p.charAt(1)=='2'){
                a = "Queen Junwang";
            }else if(p.charAt(1)=='3'){
                a = "King Jian";
            }else if(p.charAt(1)=='4'){
                a = "Zhong Wuyan";
            }
        }else if(p.charAt(0)=='e'){
            if(p.charAt(1)=='0'){
                a = "King Xuan";
            }else if(p.charAt(1)=='1'){
                a = "King Xian";
            }else if(p.charAt(1)=='2'){
                a = "Queen Junwang";
            }else if(p.charAt(1)=='3'){
                a = "King Jian";
            }
        }else if(p.charAt(0)=='f'){
            if(p.charAt(1)=='0'){
                a = "King Xuan";
            }else if(p.charAt(1)=='1'){
                a = "King Xian";
            }else if(p.charAt(1)=='2'){
                a = "Queen Junwang";
            }
        }else if(p.charAt(0)=='g'){
            if(p.charAt(1)=='0'){
                a = "King Xuan";
            }else if(p.charAt(1)=='1'){
                a = "King Xian";
            }
        }else{
            a = "Zhang Yi";
        }

        return a;
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        Scanner q = new Scanner(System.in);
        String placement = q.next();
        AnchorPane anchorPane = new AnchorPane();
        Group group = new Group();
        primaryStage.setTitle("Warring States Viewer");
        squareg.setStyle("-fx-background-color: #C0C0C0;");

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                Rectangle square = new Rectangle(i*100,j*100,90,90);
                Text text= new Text();
                text.setLayoutX(i*100+50);
                text.setLayoutY(j*100+50);


                if(i==0 && j==0 ){

                    text.setText(takeCharacter(placement.substring(90,92)));
//                   StackPane pane= new StackPane(square, text);
//                    Scene scene= new Scene(root);
                    square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(90)))));
//                    text.setFont(Font.font ("Verdana", FontWeight.BOLD, 40));
//                    text.setFill(Color.BLACK);
//                    text.setText("Duke Xiao 孝公");
//                    root.getChildren().addAll(square,text);

                }
                else if(i==0 && j==1 ){
                    text.setText(takeCharacter(placement.substring(93,95)));

                    square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(93)))));
                }
                else if(i==0 && j==2 ) {
                    text.setText(takeCharacter(placement.substring(96,98)));
                    square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(96)))));
                }
                    else if(i==0 && j==3 ) {
                    text.setText(takeCharacter(placement.substring(99,101)));
                    square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(99)))));
                }
                else if(i==0 && j==4 ) {
                    text.setText(takeCharacter(placement.substring(102,104)));
                    square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(102)))));

                }
                else if(i==0 && j==5 ) {
                    text.setText(takeCharacter(placement.substring(105,107)));
                   square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(105)))));
                }
                else if(i==1 && j==1 ) {
                    text.setText(takeCharacter(placement.substring(75,77)));
                    square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(75)))));
                }
                else if(i==1 && j==2 ) {
                    text.setText(takeCharacter(placement.substring(78,80)));
                    square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(78)))));
                }
                else if(i==1 && j==3 ) {
                    text.setText(takeCharacter(placement.substring(81,83)));
                    square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(81)))));
                }
                else if(i==1 && j==0 ) {
                    text.setText(takeCharacter(placement.substring(72,74)));
                    square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(72)))));

                }
                else if(i==1 && j==4 ) {
                    text.setText(takeCharacter(placement.substring(84,86)));
                    square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(84)))));
                }
                else if(i==1 && j==5 ) {
                    text.setText(takeCharacter(placement.substring(87,89)));
                    square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(87)))));
                }
                else if(i==2 && j==2 ) {
                    text.setText(takeCharacter(placement.substring(60,62)));
                    square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(60)))));
                }
                else if(i==2 && j==0 ) {
                    text.setText(takeCharacter(placement.substring(54,56)));
                    square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(54)))));
                }
                else if(i==2 && j==1 ) {
                    text.setText(takeCharacter(placement.substring(57,59)));
                    square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(57)))));
                }
                else if(i==2 && j==3 ) {
                    text.setText(takeCharacter(placement.substring(63,65)));
                    square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(63)))));
                }
                else if(i==2 && j==4 ) {
                    text.setText(takeCharacter(placement.substring(66,68)));
                    square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(66)))));
                }
                else if(i==2 && j==5 ) {
                    text.setText(takeCharacter(placement.substring(69,71)));
                    square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(69)))));
                }
                else if(i==3 && j==0){
                    text.setText(takeCharacter(placement.substring(36,38)));
                    square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(36)))));
                }
                else if(i==3 && j==1){
                    text.setText(takeCharacter(placement.substring(39,41)));
                    square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(39)))));
                }
                else if(i==3 && j==2){
                    text.setText(takeCharacter(placement.substring(42,44)));
                    square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(42)))));
                }
                else if(i==3 && j==3){
                    text.setText(takeCharacter(placement.substring(45,47)));
                    square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(45)))));
                }
                else if(i==3 && j==4){
                    text.setText(takeCharacter(placement.substring(48,50)));
                    square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(48)))));
                }
                else if(i==3 && j==5){
                    text.setText(takeCharacter(placement.substring(51,53)));

                    square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(51)))));
                }
                else if(i==4 && j==0){
                    text.setText(takeCharacter(placement.substring(18,20)));
                    square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(18)))));
                }
                else if(i==4 && j==1){
                    text.setText(takeCharacter(placement.substring(21,23)));
                    square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(21)))));
                }
                else if(i==4 && j==2){
                    text.setText(takeCharacter(placement.substring(24,26)));
                    square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(24)))));
                }
                else if(i==4 && j==3){
                    text.setText(takeCharacter(placement.substring(27,29)));
                    square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(27)))));
                }
                else if(i==4 && j==4){
                    text.setText(takeCharacter(placement.substring(30,32)));
                    square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(30)))));
                }
                else if(i==4 && j==5){
                    text.setText(takeCharacter(placement.substring(33,35)));
                    square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(33)))));
                }
                else if(i==5 && j==0){
                    text.setText(takeCharacter(placement.substring(0,2)));
                    square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(0)))));
                }
                else if(i==5 && j==1){
                    text.setText(takeCharacter(placement.substring(3,5)));
                    square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(3)))));
                }
                else if(i==5 && j==2){
                    text.setText(takeCharacter(placement.substring(6,8)));
                    square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(6)))));
                }
                else if(i==5 && j==3){
                    text.setText(takeCharacter(placement.substring(9,11)));
                    square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(9)))));
                }
                else if(i==5 && j==4){
                    text.setText(takeCharacter(placement.substring(12,14)));
                    square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(12)))));
                }
                else if(i==5 && j==5){
                    text.setText(takeCharacter(placement.substring(15,17)));
                    square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(15)))));

                }

                root.getChildren().add(square);

                root.getChildren().add(text);
            }

            }

        final Scene scene = new Scene(root, 1000, 1000, Color.LAVENDER);

        root.getChildren().add(controls);

        BorderPane pane = new BorderPane();

        int count_col = 6;
        int count_row = 6;
        boolean evenflag = true;

        makeControls();

        primaryStage.setScene(scene);
        primaryStage.show();
        }
    }

