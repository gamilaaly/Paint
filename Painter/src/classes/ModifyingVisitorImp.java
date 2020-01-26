package classes;

import javafx.scene.paint.Color;

public class ModifyingVisitorImp implements ModifyingVisitor {
    public void visit (Shape shape, Color c)
    {
        //System.out.println(shape.getType());
        shape.setColor(c);
    }
}