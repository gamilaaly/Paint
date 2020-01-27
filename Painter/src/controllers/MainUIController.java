package controllers;

import classes.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import javax.xml.crypto.dom.DOMCryptoContext;
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
    Color tempDrawColor = new Color(selectedColor.getRed(), selectedColor.getBlue(), selectedColor.getGreen()
            , selectedColor.getOpacity() * 0.5);
    Shape shapeToBeDrawn = null;
    ArrayList<Double> dimensions = new ArrayList<>();


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
        tempDrawColor = new Color(selectedColor.getRed(), selectedColor.getBlue(), selectedColor.getGreen()
                , selectedColor.getOpacity() * 0.5);
    }

    public void newFileBtnAction(ActionEvent actionEvent) {
        if (canvas != null) {
            canvas.getGraphicsContext2D().clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        }
    }

    public void onDragDetected(MouseEvent mouseEvent) {
        dimensions.clear();
        dimensions.add(0, mouseEvent.getX());
        dimensions.add(1, mouseEvent.getY());
    }

    public void onMouseReleased(MouseEvent mouseEvent) {

        switch (selectedTool) {
            case RECTANGLE:
                shapeToBeDrawn = ShapeFactory.getShape("RECTANGLE");
                double width = mouseEvent.getX() - dimensions.get(0);
                double height = mouseEvent.getY() - dimensions.get(1);
                if (width < 0) {
                    width = Math.abs(width);
                    dimensions.set(0, dimensions.get(0) - width);
                }
                if (height < 0) {
                    height = Math.abs(height);
                }
                dimensions.add(2, width);
                dimensions.add(3, height);
                ((Rectangle) shapeToBeDrawn).setDimensions(dimensions);
                ((Rectangle) shapeToBeDrawn).draw(canvas.getGraphicsContext2D(), selectedColor);
                dimensions.clear();
                break;

            case SQUARE:
                shapeToBeDrawn = ShapeFactory.getShape("SQUARE");
                double length = mouseEvent.getX() - dimensions.get(0);
                if (length < 0) {
                    length = Math.abs(length);
                    dimensions.set(0, dimensions.get(0) - length);
                }
                dimensions.add(2, length);
                dimensions.add(3, length);
                ((Square) shapeToBeDrawn).setDimensions(dimensions);
                ((Square) shapeToBeDrawn).draw(canvas.getGraphicsContext2D(), selectedColor);
                dimensions.clear();
                break;

            case CIRCLE:
                shapeToBeDrawn = ShapeFactory.getShape("CIRCLE");
                double diameter = mouseEvent.getX() - dimensions.get(0);
                if (diameter < 0) {
                    diameter = Math.abs(diameter);
                    dimensions.set(0, dimensions.get(0) - diameter);
                }
                dimensions.add(2, diameter);
                dimensions.add(2, diameter);
                ((Circle) shapeToBeDrawn).setDimensions(dimensions);
                ((Circle) shapeToBeDrawn).draw(canvas.getGraphicsContext2D(), selectedColor);
                dimensions.clear();
                break;

            case LINE:
                shapeToBeDrawn = ShapeFactory.getShape("LINE");
                dimensions.add(2, mouseEvent.getX());
                dimensions.add(3, mouseEvent.getY());
                ((Line) shapeToBeDrawn).setDimensions(dimensions);
                ((Line) shapeToBeDrawn).draw(canvas.getGraphicsContext2D(), selectedColor);
                dimensions.clear();
                break;
        }


    }

    public void onMouseClicked(MouseEvent mouseEvent) {
        GraphicsContext ctx = canvas.getGraphicsContext2D();
        ctx.setFill(selectedColor);
        if (selectedTool == Tool.TRIANGLE){
            if(dimensions.isEmpty()) {
                dimensions.add(0, mouseEvent.getX());
                dimensions.add(1, mouseEvent.getY());
                double pointLength = 2;
                ctx.setFill(selectedColor);
                ctx.fillOval(mouseEvent.getX() - pointLength / 2, mouseEvent.getY() - pointLength / 2, pointLength, pointLength);
                System.out.println("1");
            } else if (dimensions.size() == 2){
                dimensions.add(2, mouseEvent.getX());
                dimensions.add(3, mouseEvent.getY());
                double pointLength = 2;
                ctx.fillOval(mouseEvent.getX() - pointLength / 2, mouseEvent.getY() - pointLength / 2, pointLength, pointLength);
                System.out.println("2");
            } else if(dimensions.size() == 4) {
                dimensions.add(4, mouseEvent.getX());
                dimensions.add(5, mouseEvent.getY());
                double pointLength = 2;
                ctx.fillOval(mouseEvent.getX() - pointLength / 2, mouseEvent.getY() - pointLength / 2, pointLength, pointLength);
                shapeToBeDrawn = ShapeFactory.getShape("TRIANGLE");
                sort(dimensions);
                ((Triangle) shapeToBeDrawn).setDimensions(dimensions);
                ((Triangle) shapeToBeDrawn).draw(ctx, selectedColor);
                dimensions.clear();
                System.out.println("3");
            }
        }
    }

    private void sort(ArrayList<Double> arry){
        double x1 = arry.get(0);
        double x2 = arry.get(2);
        double x3 = arry.get(4);
        double y1 = arry.get(1);
        double y2 = arry.get(3);
        double y3 = arry.get(5);
        arry.set(0,x1);
        arry.set(1,x2);
        arry.set(2,x3);
        arry.set(3,y1);
        arry.set(4,y2);
        arry.set(5,y3);
    }
}
