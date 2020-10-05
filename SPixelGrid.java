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
    System.out.println("SPixelGrid.render(): "+gr);
    for (int i = 0; i < pixels.length; i++) {
      for (int j = 0; j < pixels[i].length; j++) {
        pixels[i][j].render(gr);
      }
    }
  }
}
