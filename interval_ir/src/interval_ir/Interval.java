package interval_ir;

public class Interval {
	
	private int ondergrens;
	private int bovengrens;
	
	// Getters (ook inspectoren genoemd)
	public static int getOndergrens(Interval interval) {
		return interval.ondergrens;
	}
	
	public static int getBovengrens(Interval interval) {
		return interval.bovengrens;
	}
	
	public static int getLengte(Interval interval) {
		return interval.bovengrens - interval.ondergrens;
	}
	
	// Setters (ook mutatoren genoemd)
	public static void setOndergrens(Interval interval, int nieuweOndergrens) {
		interval.ondergrens = nieuweOndergrens;
	}
	
	public static void setBovengrens(Interval interval, int nieuweBovengrens) {
		interval.bovengrens = nieuweBovengrens;
	}
	
	public static void setLengte(Interval interval, int nieuweLengte) {
		interval.bovengrens = interval.ondergrens + nieuweLengte;
	}

}
