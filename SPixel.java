class SPixel {
	SColor color;
	int x;
	int y;

	public SPixel(int x, int y) {
		this.x = x;
		this.y = y;
		this.color = SColor.BLACK;
	}

	public SPixel(int x, int y, SColor color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}

	public SPixel(Pt loc) {
		this.x = loc.x;
		this.y = loc.y;
		this.color = SColor.BLACK;
	}

	public SPixel(Pt loc, SColor color) {
		this.x = loc.x;
		this.y = loc.y;
		this.color = color;
	}

	@Override
	public SPixel copy() {
		// Fill Method
	}

	public void render(Graphics g) {
    g.setColor(this.color.getColor());
    g.drawLine(this.x, this.y, this.x, this.y);
	}
}
