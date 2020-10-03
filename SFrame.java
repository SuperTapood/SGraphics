class SFrame {
	SObject[] objects = new SObject[256];
	SPixelGrid pg;

	SFrame(int w, int h) {
		pg = new SPixelGrid(w, h);
	}

	// what the hell is this
	// why cant we just get an append function
	// and shouldn't SObject include a parameter name as well?
	public void addObject(SObject) {
		SObject[] arr = SUtil.replaceSingleNull(this.objects, SObject);
		if (arr == null) {
			System.out.println("The Array is Full! Increase the size or remove elements");
		} else {
			this.objects = arr;
		}
	}

	public void evaluatePixelGrid() {
		// Fill Method - Heavy operation! (ShZil will do)
	}

	public void render(Graphics gr) {
		pg.render(gr);
	}

	@Override
	public SFrame copy() {
		// Fill Method
	}
}
