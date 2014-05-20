import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * Created by brian on 5/17/14.
 */
public class JMediaPlayer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(final Stage primaryStage) throws Exception {

        primaryStage.setTitle(getClass().getSimpleName());
        Group root = new Group();
        Scene scene = new Scene(root, 400, 400, Color.CORAL);

        // -- 1. A MediaView is used to display the video
        MediaView mediaView = new MediaView();
        root.getChildren().add(mediaView);

        // -- 2. A media object is a reference to a video or audio file
        final Media media = new Media("http://download.oracle.com/otndocs/products/javafx/oow2010-2.flv");


        // -- 3. A MediaPlayer allows the mediaview to play the video
        // TODO - create an instance of a mediaplayer and add it to the mediaView.




        // -- 4. The movie is loaded asynchronously (i.e. in a different thread). It takes a moment before
        // it is ready to be played. This call back will set the size of the window to match the video size
        // when enough information has been loaded to determine the movie size.
        // TODO - after the media player has been added uncomment the code below
        // mediaPlayer.setOnReady(new Runnable() {
        //     @Override
        //     public void run() {
        //         primaryStage.setWidth(media.getWidth());
        //         primaryStage.setHeight(media.getHeight());
        //     }
        // });


        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
