abstract class SShape {
  Pt[][] all;

  public Pt getPixelByIndex(int index);
  public Rect getBoundingBox();
  public boolean collides(Pt point);
}
