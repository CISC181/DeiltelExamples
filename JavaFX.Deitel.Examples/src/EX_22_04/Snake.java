package EX_22_04;

//Snake.java
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Snake extends Application {
@Override
public void start(Stage stage) throws Exception {
   Parent root = 
      FXMLLoader.load(getClass().getResource("Snake.fxml"));
   
   Scene scene = new Scene(root);
   stage.setTitle("Draw Polylines, Polygons and Paths");
   stage.setScene(scene);
   stage.show();
}

public static void main(String[] args) {
   launch(args);
}
}
