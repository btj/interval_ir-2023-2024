package interval_ir;

public class Interval {
	
	private int ondergrens;
	private int bovengrens;
	
	// Getters (ook inspectoren genoemd)
	public int getOndergrens() {
		return this.ondergrens;
	}
	
	public int getBovengrens() {
		return this.bovengrens;
	}
	
	public int getLengte() {
		return this.bovengrens - this.ondergrens;
	}
	
	// Setters (ook mutatoren genoemd)
	public void setOndergrens(int nieuweOndergrens) {
		this.ondergrens = nieuweOndergrens;
	}
	
	public void setBovengrens(int nieuweBovengrens) {
		this.bovengrens = nieuweBovengrens;
	}
	
	public void setLengte(int nieuweLengte) {
		this.bovengrens = this.ondergrens + nieuweLengte;
	}

}
