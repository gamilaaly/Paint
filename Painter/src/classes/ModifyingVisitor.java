package classes;

import javafx.scene.paint.Color;

public interface ModifyingVisitor {
    //Listing the visits
    void visit(Shape shape, Color c);
}
