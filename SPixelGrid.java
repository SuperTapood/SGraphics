import java.awt.Graphics;

class SPixelGrid {
  SPixel[][] pixels;
  int width;
  int height;

  public SPixelGrid(int w, int h) {
    width = w;
    height = h;
    pixels = new SPixel[width][height];
    construct();
  }

  public SPixelGrid(Rect d) {
    width = d.w;
    height = d.h;
    pixels = new SPixel[width][height];
    construct();
  }

  public void drawObject(SObject o) {
    Rect boundingBox = o.getBoundingBox();
    for (int i = 0; i < boundingBox.getSize(); i++) {
      Pt point = boundingBox.getPositionByIndex(i);
      pixels[point.x][point.y].setColor(o.getPixel(point));
      System.out.println("Point was altered: X="+point.x+", Y="+point.y+", To="+o.getPixel(point).getBrightness());
    }
  }

  public void construct() {
    for (int i = 0; i < pixels.length; i++) {
      for (int j = 0; j < pixels[i].length; j++) {
        pixels[i][j] = new SPixel(i, j, Const.BLACK);
      }
    }
  }

  public void render(Graphics gr) {
    // System.out.println("SPixelGrid.render(): "+gr);
    for (int i = 0; i < pixels.length; i++) {
      if (i % 20 == 0) {
        System.out.println("Hello, I just rendered column #"+i);
      }
      for (int j = 0; j < pixels[i].length; j++) {
        pixels[i][j].render(gr);
      }
    }
  }

  public String toString(int jump) {
    String out = "SPixelGrid:\n";
    for (int i = 0; i < pixels.length - jump; i+=jump) {
      out += "[";
      for (int j = 0; j < pixels[j].length - jump; j+=jump) {
        out += pixels[i][j].getAvg();
        out += ", ";
      }
      out = out.substring(0, out.length() - 2) + "],\n[";
    }
    out = out.substring(0, out.length() - 3) + "]";
    return out;
  }

  public String toString() {
    return this.toString(20);
  }
}
