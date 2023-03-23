package edu.sdccd.cisc191.template;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ArrayFx extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        // create arrays
        int[] array = new int[]{0, 1, 2, 3, 4};
        int[][] mdArray = new int[][]{{0, 1, 2, 3, 4}, {5, 6, 7, 8, 9}, {10, 11, 12, 13, 14}};

        IntArray intArray = new IntArray(array);
        MDIntArray mdIntArray = new MDIntArray(mdArray);

        //size of window
        float width = 800;
        float height = 650;

        StackPane stackPane = new StackPane();
        Scene scene = new Scene(stackPane, width, height);

        //create and set position of buttons
        Button closeButton = new Button("X");
        Button ArrayPrintAll = new Button("1DArray Print All");
        Button ArrayPrintMax = new Button("1D Array Print Max");
        Button ArrayPrintMin = new Button("1D Array Print Min");
        Button MDArrayPrintAll = new Button("2DArray Print All");
        Button MDArrayPrintMax = new Button("2D Array Print Max");
        Button MDArrayPrintMin = new Button("2D Array Print Min");

        closeButton.setTranslateX((width / 2) - 20);
        closeButton.setTranslateY((-height / 2) + 20);

        ArrayPrintAll.setTranslateX(100);
        ArrayPrintAll.setTranslateY(100);

        ArrayPrintMax.setTranslateX(-100);
        ArrayPrintMax.setTranslateY(-100);

        ArrayPrintMin.setTranslateX(-100);
        ArrayPrintMin.setTranslateY(100);

        MDArrayPrintAll.setTranslateX(300);
        MDArrayPrintAll.setTranslateY(300);

        MDArrayPrintMax.setTranslateX(-300);
        MDArrayPrintMax.setTranslateY(-300);

        MDArrayPrintMin.setTranslateX(-300);
        MDArrayPrintMin.setTranslateY(300);

        //create and set button actions
        EventHandler<ActionEvent> closeEvent = e -> stage.close();
        EventHandler<ActionEvent> ArrayPrintAllEvent = e -> intArray.printAll();
        EventHandler<ActionEvent> ArrayPrintMaxEvent = e -> intArray.max();
        EventHandler<ActionEvent> ArrayPrintMinEvent = e -> intArray.min();
        EventHandler<ActionEvent> MDArrayPrintAllEvent = e -> mdIntArray.printAll();
        EventHandler<ActionEvent> MDArrayPrintMaxEvent = e -> mdIntArray.getMaxValue();
        EventHandler<ActionEvent> MDArrayPrintMinEvent = e -> mdIntArray.getMinValue();

        closeButton.setOnAction(closeEvent);
        ArrayPrintAll.setOnAction(ArrayPrintAllEvent);
        ArrayPrintMax.setOnAction(ArrayPrintMaxEvent);
        ArrayPrintMin.setOnAction(ArrayPrintMinEvent);
        MDArrayPrintAll.setOnAction(MDArrayPrintAllEvent);
        MDArrayPrintMax.setOnAction(MDArrayPrintMaxEvent);
        MDArrayPrintMin.setOnAction(MDArrayPrintMinEvent);

        stackPane.getChildren().add(closeButton);
        stackPane.getChildren().add(ArrayPrintAll);
        stackPane.getChildren().add(ArrayPrintMax);
        stackPane.getChildren().add(ArrayPrintMin);
        stackPane.getChildren().add(MDArrayPrintAll);
        stackPane.getChildren().add(MDArrayPrintMax);
        stackPane.getChildren().add(MDArrayPrintMin);

        //set the stage
        stage.setScene(scene);
        stage.setTitle("Menu");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
