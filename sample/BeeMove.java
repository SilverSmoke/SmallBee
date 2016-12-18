package sample;

import javafx.scene.image.ImageView;

import java.awt.*;
import java.util.TimerTask;

/**
 * Created by belikov.a on 16.12.2016.
 */
public class BeeMove extends TimerTask {
    public ImageView bee;
    private int xSpeed = 10;
    private int ySpeed = 10;

    public BeeMove(ImageView beeIn) {
        this.bee = beeIn;
    }

    public void run() {
        //System.out.println("ТИК");
        Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();

        double xMax = sSize.getWidth();
        double yMax = sSize.getHeight();

        double x = bee.getX();
        double y = bee.getY();
        if((x + xSpeed > xMax)||(x + xSpeed < 0))xSpeed *= -1;
        if((y + ySpeed > yMax)||(y + xSpeed < 0))ySpeed *= -1;
        x += xSpeed;
        y += ySpeed;
        //System.out.println("X="+ x + "; Y=" + y);
        bee.setX(x);
        bee.setY(y);
    }
}
