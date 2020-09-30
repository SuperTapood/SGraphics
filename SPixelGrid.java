class SPixelGrid {
  SPixel[] pixels;
  int width;
  int height;

  SPixelGrid(int w, int h) {
    width = w;
    height = h;
  }

  SPixelGrid(Rect d) {
    width = d.w;
    height = d.h;
  }
}
