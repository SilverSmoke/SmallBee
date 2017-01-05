package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import static javafx.scene.Cursor.*;

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


        System.out.println();
        bee.setCursor(OPEN_HAND);

        BeeMove beeGray = new BeeMove(bee);

        beeGray.go();

    }


    public static void main(String[] args) {
        launch(args);
    }
}