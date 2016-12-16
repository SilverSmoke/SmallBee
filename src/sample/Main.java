package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Parent root = FXMLLoader.load(getClass().getResource("bee.fxml"));
        FXMLLoader loader = new FXMLLoader(getClass().getResource("bee.fxml"));
        //loader.setController(new Controller("Controller"));
        Parent root = loader.load();


        primaryStage.setTitle("Bee");
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.setScene(new Scene(root, Color.TRANSPARENT));
        primaryStage.setResizable(false);
        primaryStage.setMaximized(true);
        primaryStage.setFullScreen(false);
        primaryStage.show();

        ImageView bee = (ImageView) root.lookup("#bee");
        bee.setRotate(180);

        System.out.println(bee.getParent().getProperties().);


        /*Timer timer = new Timer();
        TimerTask task = new BeeMove(bee);
        timer.schedule(task, 1000, 100);*/
    }


    public static void main(String[] args) {
        launch(args);
    }
}