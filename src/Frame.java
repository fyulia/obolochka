import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    private static final int width = 400;
    private static final int height = 400;
    private Convex convexprivate;
    public Frame(String name,Convex c){

        this.setSize(width, height);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle(name);
        convexprivate=c;


    }
    public void paint(Graphics g){
        //super.paint(g);
        //g.clearRect(0,0,2000,2000);
        g.clearRect(0,0,400,400);
        g.translate(getWidth()/2, getHeight()/2);

        g.drawLine(0,-getHeight(),0,getHeight());
        g.drawLine(-getWidth(),0,getWidth(),0);

        convexprivate.fig.draw(g);
        convexprivate.fig.obol(g);
    }
}
