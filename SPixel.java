import java.awt.Graphics;

class SPixel {
	SColor color;
	int x;
	int y;

	public SPixel(int x, int y) {
		this.x = x;
		this.y = y;
		this.color = Const.BLACK;
	}

	public SPixel(int x, int y, SColor color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}

	public SPixel(Pt loc) {
		this.x = loc.x;
		this.y = loc.y;
		this.color = Const.BLACK;
	}

	public SPixel(Pt loc, SColor color) {
		this.x = loc.x;
		this.y = loc.y;
		this.color = color;
	}

	public void setColor(SColor to) {
		this.color = to;
	}

	public SPixel copy() {
		return new SPixel(this.x, this.y, this.color);
	}

	public void render(Graphics g) {
		System.out.println("SPixel.render: Graphics g: "+g);
		System.out.println("SPixel.render(): this.color: "+this.color);
    g.setColor(this.color.getColor());
    g.drawLine(this.x, this.y, this.x, this.y);
	}
}
