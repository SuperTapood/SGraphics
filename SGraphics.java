class SGraphics {
	Graphics g;
	SFrame previous = null;
	SFrame current = new SFrame(SFrame.FROM_BG_COLOR, new SColor());

	public SGraphics(Graphics g) {
		this.g = g;
	}

	public void drawRect(Rect s, STexture t) {

	}
}

// https://docs.oracle.com/javase/7/docs/api/java/awt/Graphics.html
