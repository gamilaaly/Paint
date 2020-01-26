package controllers;
import classes.Rectangle;
import classes.Shape;
import classes.ShapeFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Point2D;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import java.util.ArrayList;


public class MainUIController {



    enum Tool {
        LINE,
        RECTANGLE,
        SQUARE,
        CIRCLE,
        TRIANGLE
    }

    Tool selectedTool = null;
    Color selectedColor = Color.WHITE;
    Color tempDrawColor = new Color(selectedColor.getRed(),selectedColor.getBlue(),selectedColor.getGreen()
            , selectedColor.getOpacity()*0.5);
    Point2D startPos = null;
    Point2D tempEndPos = null;
    Point2D endPos = null;
    Shape shapeToBeDrawn = null;



    @FXML
    Canvas canvas = null;
    @FXML
    Button lineBtn = null;
    @FXML
    Button squareBtn = null;
    @FXML
    Button rectBtn = null;
    @FXML
    Button circleBtn = null;
    @FXML
    Button triBtn = null;
    @FXML
    ColorPicker clrPicker = null;
    @FXML
    Label coordinatesLabel = null;
    @FXML
    Label toolsLabel = null;




    public void onMouseMoved(MouseEvent mouseEvent) {
        coordinatesLabel.setText(String.format("%d , %d", ((int) mouseEvent.getX()), ((int) mouseEvent.getY())));
    }

    public void lineBtnAction(ActionEvent actionEvent) {
        selectedTool = Tool.LINE;
        toolsLabel.setText("Line");
    }

    public void rectBtnAction(ActionEvent actionEvent) {
        selectedTool = Tool.RECTANGLE;
        toolsLabel.setText("Rectangle");
    }

    public void squareBtnAction(ActionEvent actionEvent) {
        selectedTool = Tool.SQUARE;
        toolsLabel.setText("Square");
    }

    public void circleBtnAction(ActionEvent actionEvent) {
        selectedTool = Tool.CIRCLE;
        toolsLabel.setText("Circle");
    }

    public void triBtnAction(ActionEvent actionEvent) {
        selectedTool = Tool.TRIANGLE;
        toolsLabel.setText("Triangle");
    }


    public void clrPickerAction(ActionEvent actionEvent) {
        selectedColor = clrPicker.getValue();
        tempDrawColor = new Color(selectedColor.getRed(),selectedColor.getBlue(),selectedColor.getGreen()
                , selectedColor.getOpacity()*0.5);
    }

    public void newFileBtnAction(ActionEvent actionEvent) {
        if (canvas != null) {
            canvas.getGraphicsContext2D().clearRect(0,0,canvas.getWidth(),canvas.getHeight());
        }
    }

    public void onDragDetected(MouseEvent mouseEvent) {

        switch (selectedTool)
        {
            case RECTANGLE:
                shapeToBeDrawn = ShapeFactory.getShape("RECTANGLE");
            case SQUARE:
                shapeToBeDrawn = ShapeFactory.getShape("SQUARE");
            case CIRCLE:
                shapeToBeDrawn = ShapeFactory.getShape("CIRCLE");
            case LINE:
                shapeToBeDrawn = ShapeFactory.getShape("LINE");

        }
    }

    public void onMouseDragged(MouseEvent mouseEvent) {
      /* tempEndPos = new Point2D(mouseEvent.getX(), mouseEvent.getY());
        rectangle.updateParamters(mouseEvent.getX(), mouseEvent.getY());
        canvas.getGraphicsContext2D().clearRect(0,0,canvas.getWidth(),canvas.getHeight());
        rectangle.draw(canvas.getGraphicsContext2D());
        System.out.println("tempEndPos = " + tempEndPos.getX() + " , " + tempEndPos.getY()); */
    }

    public void onMouseReleased(MouseEvent mouseEvent) {
    }

}
