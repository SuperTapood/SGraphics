abstract class SShape {
  public abstract Pt getPixelByIndex(int index);
  public abstract Rect getBoundingBox();
  public abstract boolean collides(Pt point);
}
