class SRect extends SShape {
  int x; int y; int w; int h;

  public SRect(int x, int y, int w, int h){
    this.x = x; this.y = y; this.w = w; this.h = h;
  }

  public SRect(Pt pt, int w, int h){
    this.x = pt.x;
    this.y = pt.y;
    this.w = w;
    this.h = h;
  }

  public SRect(int[] values){
    this.x = values[0];
    this.y = values[1];
    this.h = values[2];
    this.w = values[3];
  }

  @Override
  public SRect copy(){
    return new SRect(this.x, this.y, this.w, this.h);
  }
}
