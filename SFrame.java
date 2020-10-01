class SFrame {
	SObject[] objects = new SObject[256];
	SPixelGrid pg;

	SFrame(int w, int h) {
		pg = new SPixelGrid(w, h);
	}

	public void addObject(SObject) {
		SObject[] arr = SUtil.replaceSingleNull(this.objects, SObject);
		if (arr == null) {
			System.out.println("The Array is Full! Increase the size or remove elements");
		} else {
			this.objects = arr;
		}
	}

	public void evaluatePixelGrid() {

	}

	public void render(Graphics gr) {
		pg.render(gr);
	}
}
