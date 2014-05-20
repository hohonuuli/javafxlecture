import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Created by brian on 5/16/14.
 */
public class GEventsAgain extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle(getClass().getSimpleName());

        final Group root = new Group();
        Scene scene = new Scene(root, 400, 400, Color.WHEAT);

        // -- 1. Add our custom circle node
        // TODO add one red MyCircle instance of 30px radius at 200, 200 to root
        final Circle circle = null;
        



        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

class MyCircle extends Circle {

    public MyCircle(double radius, Paint fill) {
        super(radius, fill);
        setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (getFill().equals(Color.RED)) {
                    setFill(Color.BLUE);
                }
                else {
                    setFill(Color.RED);
                }
            }
        });
    }

}
