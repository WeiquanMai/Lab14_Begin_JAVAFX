/*
CSC- 239 JAVA
Project Name: Beginning JavaFX
Student: Weiquan Mai
Date: March 27, 2025
Description: The program begins with a starter program provided by Professor Morgan that utilizes the JavaFX application to draw a rectangle.
The assignment is to enhance the program by drawing another rectangle, and 4 lines to make the image look like a 3-dimensional rectangular object.
*/

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.layout.StackPane;

import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class Lab14a extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        double paneWidth = 400;
        double paneHeight = 300;
        double width = paneWidth * 0.90 - 30;   // rectangle width
        double height = paneHeight * 0.90 - 60; // rectangle height
        double cornerX = 10;                // rectangle corner X
        double cornerY = 60;                // rectangle corner Y
 
        // Draw a rectangle:  
        //      The "upper-left" corner is at cornerX, cornerY.
        //      The other corner positions can be calculated,
        //      based on cornerX, cornerY, width, and height.
        Rectangle r1 = new Rectangle(cornerX, cornerY, width, height);
        r1.setFill(new Color(1, 1, 1, 0));  // fill color = white
        r1.setStroke(Color.BLACK);          // edge color = black
        
        // Draw a second rectangle
        double cornerX2 = 30;
        double cornerY2 = 40;
        Rectangle r2 = new Rectangle (cornerX2, cornerY2, width, height);
        r2.setFill(new Color(1,1,1,0));
        r2.setStroke(Color.BLACK);
     
        // Add both panes
        pane.getChildren().add(r1);
        pane.getChildren().add(r2);

        // Draw 4 lines
        Line line1 = new Line (cornerX, cornerY, cornerX2, cornerY2);
        Line line2 = new Line(cornerX + width, cornerY, cornerX2 + width, cornerY2);
        Line line3 = new Line(cornerX, cornerY + height, cornerX2, cornerY2 + height);
        Line line4 = new Line(cornerX + width, cornerY + height, cornerX2 + width, cornerY2 + height);

        // Add lines
        pane.getChildren().add(line1);
        pane.getChildren().add(line2);
        pane.getChildren().add(line3);
        pane.getChildren().add(line4);

        Scene scene = new Scene(pane, paneWidth, paneHeight);
        primaryStage.setTitle("Lab14a");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}
