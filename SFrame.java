class SFrame {
	SPixelGrid pg;

	public SFrame(int w, int h) {
		pg = new SPixelGrid(w, h);
		SObject[] objects = new SObject[256];
	}

	public SFrame(int w, int h, int objectCount){
		pg = new SPixelGrid(w, h);
		SObject[] objects = new SObject[objectCount];
	}

	public void addObject(SObject obj) {
		SObject[] arr = SUtil.replaceSingleNull(this.objects, obj);
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
		int w = this.pg.width;
		int h = this.pg.height;
		SFrame frame = new SFrame(w, h);
		// this better work
		for (SObject obj : this.objects){
			frame.addObject(obj.copy());
		}
	}
}
