import java.awt.*;
import javax.swing.JFrame;

class MainExample extends Canvas {
  int sizeX = 500;
  int sizeY = 500;

  public void paint(Graphics gr) {
    SGraphics g = new SGraphics(gr, sizeX, sizeY);
    System.out.println("SGraphics:"+g);
    System.out.println("Graphics:"+gr);
    // All the drawing attempts and syntax review.
    Rect objectShape1 = new Rect(100, 100);
    g.drawRect(objectShape1, SColor.WHITE);
    gr.setColor(new Color(0, 0, 0));
    gr.fillRect(0, 0, 100, 100);

    g.finishFrame(gr);
  }
  public static void main(String[] args) {
    MainExample m = new MainExample();
    JFrame f = new JFrame();

    f.add(m);
    f.setSize(m.sizeX, m.sizeY);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }
}
