package controllers;


import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public interface ModifyingVisitor {
    //Listing the visits
    void visit(Shape shape, Color c, GraphicsContext graphicsContext);
}
