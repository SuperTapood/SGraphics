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
    switch (mode) {
      case STexture.NONE:
        return SColor.BLACK;
        break;
      case STexture.COLOR:
        return color;
        break;
    }
  }

  public SColor getPixelByPosition(int x, int y) {
    return getPixelByPosition(new Pt(x, y));
  }

  public SColor getPixelByPosition(int[] pos) {
    return getPixelByPosition(new Pt(pos[0], pos[1]));
  }

  public STexture copy(){
    return new STexture(this.color);
  }
}
