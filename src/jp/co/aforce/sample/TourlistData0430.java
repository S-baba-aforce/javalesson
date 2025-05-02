package jp.co.aforce.sample;

public class TourlistData0430 {
	String cityName;
	int domesticTourlist;
	int foreignTourlist;
	
	public TourlistData0430(String cityName, int domesticTourlist, int foreignTourlist) {
		this.cityName = cityName;
		this.domesticTourlist = domesticTourlist;
		this.foreignTourlist = foreignTourlist;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getDomesticTourlist() {
		return domesticTourlist;
	}

	public void setDomesticTourlist(int domesticTourlist) {
		this.domesticTourlist = domesticTourlist;
	}

	public int getForeignTourlist() {
		return foreignTourlist;
	}

	public void setForeignTourlist(int foreignTourlist) {
		this.foreignTourlist = foreignTourlist;
	}
	
	public int calcTotal() {
		return this.domesticTourlist + foreignTourlist;
	}	
	
	public double getRatio() {
		return (double)foreignTourlist/(double)this.calcTotal();
	}
}
