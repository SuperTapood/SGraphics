class SPixelGrid {
  SPixel[][] pixels;
  int width;
  int height;

  public SPixelGrid(int w, int h) {
    width = w;
    height = h;
    pixels = new SPixel[width][height];
  }

  public SPixelGrid(Rect d) {
    width = d.w;
    height = d.h;
    pixels = new SPixel[width][height];
  }

  public void fillShape(SShape s, STexture t) {
    // Fill Method - Heavy Operation (ShZil will do)
  }
}
