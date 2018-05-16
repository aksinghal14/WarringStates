package comp1110.ass2.gui;

import comp1110.ass2.WarringStatesGame;
import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


import java.awt.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Game extends Application {
    private static final int BOARD_WIDTH = 933;
    private static final int BOARD_HEIGHT = 700;
    // Idea- Akshat Singhal
    //Author- Akshat Singhal
    // FIXME Task 9: Implement a basic playable Warring States game in JavaFX
    private static final int VIEWER_WIDTH = 933;
    private static final int VIEWER_HEIGHT = 700;

    private WarringStatesGame warringStatesGame;
    private final Group moveright = new Group();
    private final Group moveleft = new Group();


    private final Group root = new Group();
    private final Group controls = new Group();


/*private boolean GameOver;
    
    public void update(){
        checkisGameOver();
    }

    private void checkisGameOver() {
    }*/




/*
private final String [][]vmove={};
*/

 /*private Application view= new Appli
    view.takeKingdom

   TextField textField;*/


    // FIXME Task 11: Allow players of your Warring States game to play against your simple agent

    // FIXME Task 12: Integrate a more advanced opponent into your game

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Warring States Game");
        Scene scene = new Scene(root, VIEWER_WIDTH, VIEWER_HEIGHT);

        /*Group root= new Group();
        Scene scene2=new Scene(root, 300, 250);
        Button button= new Button();
        button.setLabel("START");
        button.setOnAction(*/

      /*  root.getChildren().add(controls);
        root.getChildren().add(moveleft);
        root.getChildren().add(moveright);*/



        /*int count_columns=6;
        int count_rows=6;*/


    }

    private EventHandler<KeyEvent> keyListener = new EventHandler<KeyEvent>() {
        @Override
        public void handle(KeyEvent event) {
            {
                if (event.getCode() == KeyCode.UP) {


                } else if (event.getCode() == KeyCode.DOWN) {


                } else if (event.getCode() == KeyCode.RIGHT) {


                } else if (event.getCode() == KeyCode.LEFT) {


                } else if (event.getCode() == KeyCode.ENTER) {

                }
                event.consume();

            }


        }
    };
}

