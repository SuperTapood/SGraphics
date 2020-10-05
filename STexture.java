class STexture {
  private static final int NONE = 0;
  private static final int COLOR = 1;

  private int mode;

  SColor color;

  public STexture(SColor c) {
    mode = STexture.COLOR;
    color = c;
  }

  public SColor getColorByPosition(Pt pos) {
    SColor toReturn = SColor.BLACK;
    switch (mode) {
      case STexture.NONE:
         toReturn = SColor.BLACK;
        break;
      case STexture.COLOR:
         toReturn = color;
        break;
    }
    return toReturn;
  }

  public SColor getColorByPosition(int x, int y) {
    return getColorByPosition(new Pt(x, y));
  }

  public SColor getColorByPosition(int[] pos) {
    return getColorByPosition(new Pt(pos[0], pos[1]));
  }

  public STexture copy() {
    return new STexture(this.color);
  }

  public String toString() {
    String toReturn = "STexture";
    switch (mode) {
      case STexture.NONE:
         toReturn = "NONE";
        break;
      case STexture.COLOR:
         toReturn = "COLOR="+color.toString();
        break;
    }
    return toReturn;
  }
}
