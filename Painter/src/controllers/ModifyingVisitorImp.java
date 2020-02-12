package controllers;


import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class ModifyingVisitorImp implements ModifyingVisitor {
    public void visit (Shape shape, Color c, GraphicsContext graphicsContext)
    {
        //System.out.println(shape.getType());
        shape.draw(graphicsContext, c);
    }
}