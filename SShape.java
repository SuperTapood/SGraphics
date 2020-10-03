abstract class SShape {
  Pt[][] all;

  public Pt getPixelByIndex(int index);
  public Rect getBoundingBox();
  // either this is a lambda function, or this is a static boolean value
  // collide bolleans should not be static
  public boolean collides(Pt point);
}
