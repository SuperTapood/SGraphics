import java.awt.Color;

class SColor {
	int r;
	int g;
	int b;

	private static int floatToInt(float x) {
		return (int)(x * 255);
	}

	public SColor(int r, int g, int b) {
		this.r = r;
		this.g = g;
		this.b = b;
	}

	public SColor(int[] rgb) {
		this.r = rgb[0];
		this.g = rgb[1];
		this.b = rgb[2];
	}

	public SColor(float[] rgb) {
		this.r = SColor.floatToInt(rgb[0]);
		this.g = SColor.floatToInt(rgb[1]);
		this.b = SColor.floatToInt(rgb[2]);
	}

	public SColor(float gray) {
		int staticColor = this.floatToInt(gray);
		this.r = staticColor;
		this.g = staticColor;
		this.b = staticColor;
	}

	public SColor(int gray) {
		this.r = gray;
		this.g = gray;
		this.b = gray;
	}

	public SColor() {
		this.r = 0;
		this.g = 0;
		this.b = 0;
	}

	public SColor copy() {
		return new SColor(this.r, this.g, this.b);
	}

	public Color getColor() {
		return new Color(this.r, this.g, this.b);
	}

	public String toString() {
		if (r == g && g == b) {
			return "GREY:"+r;
		} else {
			return "RGB:"+r+","+g+","+b;
		}
	}
}
