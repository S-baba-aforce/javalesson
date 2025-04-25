package jp.co.aforce.sample;

public class Student0425 {
	String name;
	int[] scores;
	
	public Student0425(String name,int[] scores) {
		this.name = name;
        this.scores = scores;
	}
	
	public void showAverage() {
		int sum = 0;
		for (int score:scores) {
			sum += score;
		}
		double average = sum / scores.length;
			System.out.println("成績の平均は" + average);
	}
	
	public static void main(String[] args) {
		int[] soheeScores = {98,78,76};
		Student0425 sohee = new Student0425("sohee", soheeScores);
		
		sohee.showAverage();
		
	}	
}