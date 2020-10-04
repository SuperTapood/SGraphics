class SRect extends SShape {
  Rect rect;
  STexture texture;

  public SRect(int w, int h, STexture texture){
    this.rect = new Rect(w, h);
    this.texture = texture;
  }

  public SRect(int[] values, STexture texture){
    int h = values[2];
    int w = values[3];
    this.rect = new Rect(h, w);
    this.texture = texture;
  }

  public SRect(Rect rect, STexture texture){
    this.rect = rect;
    this.texture = texture;
  }


  public SRect copy(){
    return new SRect(this.rect.copy(), this.texture.copy());
  }
}
