// Line

class Ln {
    Pt a;
    Pt b;

    public Ln(Pt a, Pt b) {
      this.a = a;
      this.b = b;
    }

    public Ln(Pt a, int x, int y) {
      this.a = a;
      this.b = Pt(x, y);
    }

    public Ln(int x1, int y1, int x2, int y2) {
      this.a = Pt(x1, y1);
      this.b = Pt(x2, y2);
    }

    @Override
  	public Ln copy() {
  		Pt a = this.a.copy();
      Pt b = this.b.copy();
      return new Ln(a, b);
  	}
}
