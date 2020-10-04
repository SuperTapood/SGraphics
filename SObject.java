class SObject {
	SShape s;
	STexture t;

	public SObject(SShape s, STexture t){
		this.s = s;
		this.t = t;
	}


	public SObject copy(){
		return new SObject(s, t);
	}
}
