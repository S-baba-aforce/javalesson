package jp.co.aforce.sample;

public class TourlistCalculate {
	int up;
	int down;
	
	public TourlistCalculate(int up, int down) {
		this.up = up;
		this.down = down;
	}	
	public 	double getRatio() {
		return (double)up/down;
		
	
	}
}
