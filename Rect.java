// The Abstract Idea of a Rectangle

class Rect {
  // Which has an origin, width, and height.
  int w;
  int h;
  Pt origin;

  public Rect(int w, int h) {
    this.w = w;
    this.h = h;
    this.origin = new Pt(0, 0);
  }

  public Rect(int w, int h, Pt origin) {
    this.w = w;
    this.h = h;
    this.origin = origin;
  }

  public Rect(Pt origin, int w, int h) {
    this.w = w;
    this.h = h;
    this.origin = origin;
  }

  public int getSize() {
    return w * h;
  }

  // Converts the 2d grid of points in the Rectangle to a 1d array. Top left is index 0, going right, and down when the line ends.
  public Pt getPositionByIndex(int i) {
    return this.getPositionByCoordinates(i % w, i / w);
  }

  // Get a point in the Rectangle if the origin was (0,0)
  public Pt getPositionByCoordinates(int x, int y) {
    return origin.copy().add(x, y);
  }

  // Checks if the given Pt point is inside the Rectangle
  public boolean collides(Pt point) {
    return origin.x < point.x && origin.y < point.y && origin.x + w > point.x && origin.y + h > point.y;
  }

  public Rect copy() {
    return new Rect(this.w, this.h);
  }

  // Format:
  // "Rect:x/y/w/h"
  public String toString() {
    return "Rect:"+origin.x+"/"+origin.y+"/"+w+"/"+h;
  }
}
