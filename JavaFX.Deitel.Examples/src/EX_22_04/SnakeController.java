package EX_22_04;

//Exercise 22.4: SnakeController.java
//Drawing Polylines, Polygons and Paths.

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polyline; 

public class SnakeController {
// instance variables that refer to GUI components
private final Polyline polyline = new Polyline();
private final Circle circle = new Circle(10);

@FXML Pane pane;

// set user data for the RadioButtons and display polyline object
public void initialize() {
    pane.getChildren().add(circle);
    pane.getChildren().add(polyline);
    polyline.setStrokeWidth(5);
}

@FXML
void mouseMoved(MouseEvent event) {
   circle.setCenterX(event.getX());
   circle.setCenterY(event.getY());
   
   polyline.getPoints().addAll(event.getX(), event.getY());
   
   if (polyline.getPoints().size() > 100) { // larger than 50 points
      polyline.getPoints().remove(0, 2);
   }
}
}

/**************************************************************************
* (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
* Pearson Education, Inc. All Rights Reserved.                           *
*                                                                        *
* DISCLAIMER: The authors and publisher of this book have used their     *
* best efforts in preparing the book. These efforts include the          *
* development, research, and testing of the theories and programs        *
* to determine their effectiveness. The authors and publisher make       *
* no warranty of any kind, expressed or implied, with regard to these    *
* programs or to the documentation contained in these books. The authors *
* and publisher shall not be liable in any event for incidental or       *
* consequential damages in connection with, or arising out of, the       *
* furnishing, performance, or use of these programs.                     *
*************************************************************************/
