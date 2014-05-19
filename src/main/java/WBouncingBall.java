import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Created by brian on 5/18/14.
 */
public class WBouncingBall extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle(getClass().getSimpleName());
        Group root = new Group();

        Circle circle = new Circle(30);



        Scene scene = new Scene(root, 400, 400, Color.CORAL);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
