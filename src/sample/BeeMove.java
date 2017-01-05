package sample;

import javafx.scene.image.ImageView;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by belikov.a on 16.12.2016.
 */
public class BeeMove{
    private ImageView bee;
    private double xSpeed = 0.1;
    private int ySpeed = 10;
    private double x0;
    private double y0;
    private double i;
    //public TimerTask runBee();

    public BeeMove(ImageView beeIn) {
        this.bee = beeIn;
        this.x0 = 0;//bee.getX();
        this.y0 = 0;//bee.getY();
        this.i = 0;

    }

    private void runBee() {
        //System.out.println("ТИК");
        Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();
        //System.out.println(sSize);

        double xMax = sSize.getWidth()-100;
        double yMax = sSize.getHeight()-100;


        //if((x0 + xSpeed > xMax)||(x0 + xSpeed < 0))xSpeed *= -1;
        //if((y0 + ySpeed > yMax)||(y0 + xSpeed < 0))ySpeed *= -1;
        double x = Math.sin(i/4) * xMax/2 + 632;//x0 + xSpeed;
        double y = Math.sin(i) * yMax/2 + 332;
        this.i += xSpeed;
        double angleRad = Math.atan2((y0 - y),(x0 -x));
        float angleGrad = Math.round((angleRad * 180)/3.1416) - 90;

        //System.out.println(angleGrad +": : :"+x+": : :"+y);

        this.bee.setRotate(angleGrad);

        //System.out.println("X="+ x + "; Y=" + y);
        bee.setX(x);
        bee.setY(y);
        x0 = x;
        y0 = y;
    }

    public void go() {

        try {
            Timer timer = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    runBee();
                }
            };
            timer.schedule(task, 1000, 100);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}