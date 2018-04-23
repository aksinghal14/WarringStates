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
            Rectangle square = new Rectangle(location % 6 +, location / 6 +, 90, 90);
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

}
    @Override
    public void start(Stage primaryStage) throws Exception {
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
                    text.setText("ge");
//                   StackPane pane= new StackPane(square, text);
//                    Scene scene= new Scene(root);
                    square.setFill(Color.BLUE);
//                    text.setFont(Font.font ("Verdana", FontWeight.BOLD, 40));
//                    text.setFill(Color.BLACK);
//                    text.setText("Duke Xiao 孝公");
//                    root.getChildren().addAll(square,text);

                }
                else if(i==0 && j==1 ){
                    text.setText("re");

                    square.setFill(Color.RED);
                }
                else if(i==0 && j==2 ) {
                   square.setFill(Color.BISQUE);
                }
                    else if(i==0 && j==3 ) {
                   square.setFill(Color.BLUE);
                }
                else if(i==0 && j==4 ) {
                   square.setFill(Color.RED);
                }
                else if(i==0 && j==5 ) {
                   square.setFill(Color.TAN);
                }
                else if(i==1 && j==1 ) {
                   square.setFill(Color.RED);
                }
                else if(i==1 && j==2 ) {
                    square.setFill(Color.GRAY);
                }
                else if(i==1 && j==3 ) {
                    square.setFill(Color.GREEN);
                }
                else if(i==1 && j==0 ) {
                    square.setFill(Color.BISQUE);
                }
                else if(i==1 && j==4 ) {
                    square.setFill(Color.BLACK);
                }
                else if(i==1 && j==5 ) {
                    square.setFill(Color.GRAY);
                }
                else if(i==2 && j==2 ) {
                    square.setFill(Color.GRAY);
                }
                else if(i==2 && j==0 ) {
                    square.setFill(Color.VIOLET);
                }
                else if(i==2 && j==1 ) {
                    square.setFill(Color.GRAY);
                }
                else if(i==2 && j==3 ) {
                    square.setFill(Color.BISQUE);
                }
                else if(i==2 && j==4 ) {
                    square.setFill(Color.BLUE);
                }
                else if(i==2 && j==5 ) {
                    square.setFill(Color.RED);
                }
                else if(i==3 && j==0){
                    square.setFill(Color.BISQUE);
                }
                else if(i==3 && j==1){
                    square.setFill(Color.BLUE);
                }
                else if(i==3 && j==2){
                    square.setFill(Color.GREEN);
                }
                else if(i==3 && j==3){
                    square.setFill(Color.VIOLET);
                }
                else if(i==3 && j==4){
                    square.setFill(Color.RED);
                }
                else if(i==3 && j==5){

                    square.setFill(Color.GREEN);
                }
                else if(i==4 && j==0){
                    square.setFill(Color.TAN);
                }
                else if(i==4 && j==1){
                    square.setFill(Color.VIOLET);
                }
                else if(i==4 && j==2){
                    square.setFill(Color.GRAY);
                }
                else if(i==4 && j==3){
                    square.setFill(Color.BISQUE);
                }
                else if(i==4 && j==4){
                    square.setFill(Color.BLUE);
                }
                else if(i==4 && j==5){
                    square.setFill(Color.BEIGE);
                }
                else if(i==5 && j==0){
                    square.setFill(Color.GRAY);
                }
                else if(i==5 && j==1){
                    square.setFill(Color.GRAY);
                }
                else if(i==5 && j==2){
                    square.setFill(Color.RED);
                }
                else if(i==5 && j==3){
                    square.setFill(Color.RED);
                }
                else if(i==5 && j==4){
                    square.setFill(Color.VIOLET);
                }
                else if(i==5 && j==5){
                    square.setFill(Color.VIOLET);

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

