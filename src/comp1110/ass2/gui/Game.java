package comp1110.ass2.gui;

import comp1110.ass2.WarringStatesGame;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Game extends Application {
    private static final int BOARD_WIDTH = 933;
    private static final int BOARD_HEIGHT = 700;
// Idea- Akshat Singhal
    //Author- Akshat Singhal
    // FIXME Task 9: Implement a basic playable Warring States game in JavaFX
    private static final int VIEWER_WIDTH = 933;
    private static final int VIEWER_HEIGHT = 700;
    private static final String URI_BASE="assets/";

    private WarringStatesGame warringStatesGame;
    private final Group moveright= new Group();
    private final Group moveleft= new Group();

    private final Group root = new Group();
    private final Group controls = new Group();
    private final Group squareg = new Group();
    private final Group pieces = new Group();

    private final String [][]vmove={};


    // FIXME Task 11: Allow players of your Warring States game to play against your simple agent

    // FIXME Task 12: Integrate a more advanced opponent into your game

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Warring States Game");
        Scene scene= new Scene(root, VIEWER_WIDTH, VIEWER_HEIGHT);

        root.getChildren().add(controls);
        root.getChildren().add(moveleft);
        root.getChildren().add(moveright);
        root.getChildren().add(squareg);
        root.getChildren().add(pieces);

        int count_columns=6;
        int count_rows=6;


    }
}

