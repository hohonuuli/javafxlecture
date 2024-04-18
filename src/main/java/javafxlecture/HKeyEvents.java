package javafxlecture;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Created by brian on 5/16/14.
 */
public class HKeyEvents extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle(getClass().getSimpleName());

        Group root = new Group();
        Scene scene = new Scene(root, 800, 600, Color.BLACK);

        // -- 1. Add a circle


        // -- 2. Add an image of our bug using ImageView


        // -- 3. Create a event handler for when a key is pressed.


        // -- 4. When a key is released check to see if the circle and image intersect


        stage.setScene(scene);
        stage.show();
    }

    private void consume(Circle circle, ImageView iv) {
        if (iv.intersects(circle.getBoundsInLocal())) {
            circle.setFill(Color.BEIGE);
        }
        else {
            circle.setFill(Color.RED);
        }
    }

}

class MyKeyEventHandler implements EventHandler<KeyEvent> {
    private ImageView iv;

    MyKeyEventHandler(ImageView iv) {
        this.iv = iv;
    }

    public void handle(final KeyEvent keyEvent){
        if(keyEvent.getCode()==KeyCode.RIGHT){
            iv.setX(iv.getX()+5);
            iv.setRotate(90);
        }
        else if(keyEvent.getCode()==KeyCode.LEFT){
            iv.setX(iv.getX()-5);
            iv.setRotate(-90);
        }
        else if(keyEvent.getCode()==KeyCode.UP){
            iv.setY(iv.getY()-5);
            iv.setRotate(0);
        }
        else if(keyEvent.getCode()==KeyCode.DOWN){
            iv.setY(iv.getY()+5);
            iv.setRotate(180);
        }
    }
}

