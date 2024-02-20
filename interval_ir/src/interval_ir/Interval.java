package interval_ir;

/**
 * Elke instantie van deze klasse slaat een interval van de gehele as op.
 * 
 * @invar De bovengrens is niet kleiner dan de ondergrens.
 *     | getOndergrens() <= getBovengrens()
 * @invar De lengte is gelijk aan het verschil tussen de bovengrens en de ondergrens.
 *     | getLengte() == getBovengrens() - getOndergrens()
 */
public class Interval {
	
	/**
	 * @invar De bovengrens is niet kleiner dan de ondergrens.
	 *     | ondergrens <= bovengrens
	 */
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
	
	/**
	 * Initialiseert dit object met de gegeven ondergrens en lengte.
	 * 
	 * @pre De gegeven lengte is niet negatief.
	 *     | 0 <= initiëleLengte
	 * @post De ondergrens is gelijk aan de gegeven ondergrens.
	 *     | getOndergrens() == initiëleOndergrens
	 * @post De lengte is gelijk aan de gegeven lengte.
	 *     | getLengte() == initiëleLengte
	 */
	public Interval(int initiëleOndergrens, int initiëleLengte) {
		this.ondergrens = initiëleOndergrens;
		this.bovengrens = initiëleOndergrens + initiëleLengte;
	}
	
	/**
	 * Stelt de ondergrens in op de gegeven waarde.
	 * 
	 * @pre De gegeven ondergrens is niet groter dan de huidige bovengrens.
	 *     | nieuweOndergrens <= getBovengrens()
	 * @mutates | this
	 * @post De ondergrens is gelijk aan de gegeven waarde.
	 *     | getOndergrens() == nieuweOndergrens
	 * @post De bovengrens blijft ongewijzigd
	 *     | getBovengrens() == old(getBovengrens()) 
	 */
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
