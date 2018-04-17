package EX_22_05;

//GradientsController.java
//Creating custom gradients. 
import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;

public class GradientsController {   
@FXML private Rectangle rectangle;
@FXML private Slider startRedSlider;
@FXML private Slider startGreenSlider;
@FXML private Slider startBlueSlider;
@FXML private Slider startAlphaSlider;
@FXML private Slider endRedSlider;
@FXML private Slider endGreenSlider;
@FXML private Slider endBlueSlider;
@FXML private Slider endAlphaSlider;

public void initialize() {
   rectangle.setFill(new LinearGradient(0, 0, 1, 0, true, CycleMethod.REPEAT, new Stop(0, Color.BLACK), new Stop(1, Color.BLACK)));

   // listeners that set Rectangle's fill based on Slider changes
   startRedSlider.valueProperty().addListener((ov, oldValue, newValue) -> {colorChanged();});                                                                  
   startGreenSlider.valueProperty().addListener((ov, oldValue, newValue) -> {colorChanged();});                                                                      
   startBlueSlider.valueProperty().addListener((ov, oldValue, newValue) -> {colorChanged();});                                                                
   startAlphaSlider.valueProperty().addListener((ov, oldValue, newValue) -> {colorChanged();});                                                                      
   endRedSlider.valueProperty().addListener((ov, oldValue, newValue) -> {colorChanged();});                                                                  
   endGreenSlider.valueProperty().addListener((ov, oldValue, newValue) -> {colorChanged();});                                                                      
   endBlueSlider.valueProperty().addListener((ov, oldValue, newValue) -> {colorChanged();});                                                                
   endAlphaSlider.valueProperty().addListener((ov, oldValue, newValue) -> {colorChanged();});                                                                      
}

private void colorChanged() {
   rectangle.setFill(new LinearGradient(0, 0, 1, 0, true, CycleMethod.REPEAT, 
      new Stop(0, Color.rgb((int)startRedSlider.getValue(), (int)startGreenSlider.getValue(), (int)startBlueSlider.getValue(), startAlphaSlider.getValue())), 
      new Stop(1, Color.rgb((int)endRedSlider.getValue(), (int)endGreenSlider.getValue(), (int)endBlueSlider.getValue(), endAlphaSlider.getValue()))));
   
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
