class SColor {
	int r;
	int g;
	int b;

	public static final SColor BLACK = new SColor(0f);
	public static final SColor WHITE = new SColor(1f);

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

	public SColor(float[] rgb){
		this.r = SColor.FloatToInt(rgb[0]);
		this.g = SColor.FloatToInt(rgb[1]);
		this.b = SColor.FloatToInt(rgb[2]);
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

	@Override
	public SColor copy() {
		return SColor(this.r, this.g, this.b);
	}
}
