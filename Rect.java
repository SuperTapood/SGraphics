// Rectangle

class Rect {
  int w;
  int h;
  Pt origin;

  public Rect(int w, int h){
    this.w = w;
    this.h = h;
  }

  public Rect copy(){
    return new Rect(this.w, this.h);
  }
}
