import java.awt.*;
import javax.swing.*;
public class ConvexTest {
    public static void main(String[] args) throws Exception {
        Convex c = new Convex();
        Frame w=new Frame("Оболочка",c);

       // w.setBackground(Color.white);
        while (true) {
            c.add(new R2Point());
            w.repaint();
            System.out.println("S = " + c.area() + " , P = " + c.perimeter());
        }

    }
}


