class SColor {
	int r;
	int g;
	int b;

	private static int FloatToInt(float x) {
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

	public SColor(float gray){
		staticColor = SColor.FloatToInt(gray);
		this.r = staticColor;
		this.g = staticColor;
		this.b = staticColor;
	}

	public SColor(int gray){
		this.r = gray;
		this.g = gray;
		this.b = gray;
	}
}