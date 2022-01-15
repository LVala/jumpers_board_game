package gui;

import game.GameBoard;
import game.Vector2d;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class MainGameStage extends Application {
    public static final String FONT_NAME = "Tahoma";
    public static final int FONT_SIZE = 15;

    private VBox createMainBox(GameBoard gameBoard) {
        VBox vBox = new VBox(20);

        GameGrid gameGrid = new GameGrid(gameBoard);
        gameGrid.updateGrid();
        gameGrid.grid.setAlignment(Pos.CENTER);
        vBox.getChildren().add(gameGrid.grid);

        HBox hBox = new HBox(10);
        Circle circle = new Circle();
        circle.setRadius(10);
        String color = gameBoard.turn.getColor();
        circle.setFill(Color.web(color));
        circle.setStroke(Color.web(color));
        Label turnLabel = new Label("Turn of: ");
        turnLabel.setFont(Font.font(FONT_NAME, FontWeight.NORMAL, FONT_SIZE));
        hBox.getChildren().add(turnLabel);
        hBox.getChildren().add(circle);

        hBox.setAlignment(Pos.CENTER);
        vBox.getChildren().add(hBox);

        HBox inputHBox = new HBox(20);

        TextField inputTextField = new TextField("Moves here");
        Button btn = new Button("Move");
        btn.setFont(Font.font(FONT_NAME, FontWeight.NORMAL, 22));
        btn.setPrefSize(100,40);

        btn.setOnAction(event -> {
            try {
                //TODO
            }
            catch (IllegalArgumentException ex) {
                //TODO
            }
        });

        inputHBox.getChildren().add(inputTextField);
        inputHBox.getChildren().add(btn);
        inputHBox.setAlignment(Pos.CENTER);
        vBox.getChildren().add(inputHBox);


        return vBox;
    }

    public void start(Stage primaryStage) {

        GameBoard gameBoard = new GameBoard();

        primaryStage.setTitle("Skoczki");
        VBox vBox = createMainBox(gameBoard);
        Scene scene = new Scene(vBox, 450, 500);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void startGui(String[] args) {
        launch(args);
    }
}
