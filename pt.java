// Point

class Pt {
	int x;
	int y;

	public Pt(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Pt(int[] loc) {
		this.x = loc[0];
		this.y = loc[1];
	}

	public Pt(Pt other) {
		this.x = other.x;
		this.y = other.y;
	}

	@Override
	public Pt copy() {
		return new Pt(this.x, this.y);
	}

	public void add(Pt other) {
		this.x += other.x;
		this.y += other.y;
	}

	public void add(int x, int y) {
		this.add(new Pt(x, y));
	}

	public void add(int[] loc) {
		this.add(new Pt(loc));
	}

	public void sub(Pt other) {
		this.x -= other.x;
		this.y -= other.y;
	}

	public void sub(int x, int y) {
		this.sub(new Pt(x, y));
	}

	public void sub(int[] loc) {
		this.sub(new Pt(loc));
	}

	public void mult(Scale scale) {
		this.x *= scale.x;
		this.y *= scale.y;
	}

	public void div(Scale scale) {
		this.x /= scale.x;
		this.y /= scale.y;
	}
}
