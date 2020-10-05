import java.awt.Graphics;

class SFrame {
	SPixelGrid pg;
	SObject[] objects = new SObject[256];

	public SFrame(int w, int h) {
		pg = new SPixelGrid(w, h);
	}

	public void addObject(SObject obj) {
		SObject[] arr = SUtil.replaceSingleNull(this.objects, obj);
		if (arr == null) {
			System.out.println("The Array is Full! Increase the size or remove elements");
			System.out.println(objects);
			String toOutput = "[";
			for (int i = 0; i < 256; i++) {
				toOutput += objects[i].toString() + ", ";
			}
			System.out.println(toOutput + "END]");
		} else {
			this.objects = arr;
			System.out.println("The Array is NOT Full! Item: "+obj.toString()+" was added successfully");
			System.out.println(objects);
			String toOutput = "[";
			for (int i = 0; i < 256; i++) {
				toOutput += objects[i].toString() + ", ";
			}
			System.out.println(toOutput + "END]");
		}
	}

	public void evaluatePixelGrid() {
		for (SObject o : objects) {
			pg.drawObject(o);
		}
	}

	public void render(Graphics gr) {
		pg.render(gr);
	}

	public SFrame copy() {
		int w = this.pg.width;
		int h = this.pg.height;
		SFrame frame = new SFrame(w, h);
		for (SObject obj : this.objects){
			frame.addObject(obj.copy());
		}
		return frame;
	}
}
