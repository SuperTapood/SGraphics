// Rectangle

class Rect {
  int w;
  int h;
  Pt origin;

  public Rect(int w, int h, Pt origin){
    this.w = w;
    this.h = h;
  }

  public int getSize() {
    return w * h;
  }

  public Pt getPositionByIndex(int i) {
    return this.getPositionByCoordinates(i % w, i / w);
  }

  public Pt getPositionByCoordinates(int x, int y) {
    return origin.copy().add(x, y);
  }

  public boolean collides(Pt point) {
    return origin.x < point.x && origin.y < point.y && origin.x + w > point.x && origin.y + h > point.y;
  }

  public Rect copy(){
    return new Rect(this.w, this.h);
  }
}
