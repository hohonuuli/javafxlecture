import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Created by brian on 5/16/14.
 */
public class ASimpleApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        // -- 1. The stage is a Window. The application provides this for you so you
        // don't need to create one
        primaryStage.setTitle(getClass().getSimpleName());

        // -- 2. You need a root node that contains ALL other nodes in the scene graph. The root node must be
        // an instance of javafx.scene.Parent. JavafX provides several subclasses of Parent: Group, Region, and WebView.
        // - Group is a node where you explicitly provide coordinates for child nodes
        // - Regions provide layout managers for child nodes. They can also be styled with CSS
        // - WebView is used to render HTML.
        // TODO - add a root element

        // -- 3. A scene is added to the stage. THe scene contains the scene graph
        // This construction takes the width, height and a background color
        // TODO - add a scene        


        // TODO Uncomment to add a circle to scene
        //Circle circle = new Circle(20);
        //root.getChildren().add(circle);


        // -- 4. Add the scene to the stage and all show to make if visible
        // TODO - add a scene to the stage and show the stage



    }
}
