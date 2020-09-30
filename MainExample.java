import java.awt.*;
import javax.swing.JFrame;

class MainExample extends Canvas {
  int sizeX = 500;
  int sizeY = 500;

  public void paint(Graphics gr) {
    SGraphics g = new SGraphics(gr);
    // All the drawing attempts and syntax review.
  }
  public static void main(String[] args) {
    MainExample m = new MainExample();
    JFrame f = new JFrame();
    
    f.add(m);
    f.setSize(m.sizeX, m.sizeY);
    f.setDefaultClosingOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }
}
