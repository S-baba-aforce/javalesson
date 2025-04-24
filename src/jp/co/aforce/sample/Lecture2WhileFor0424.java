package jp.co.aforce.sample;

import java.util.ArrayList;

public class Lecture2WhileFor0424 {

	public static void main(String[] args) {
		ArrayList<Integer> scores = new ArrayList<>();
		scores.add(85);
		scores.add(92);
		scores.add(78);
		scores.add(65);
		scores.add(98);
		scores.add(70);
		
		int count = 0;
		
		for (int score: scores ) {
			if (score >= 70) {
			count ++;
			} 	
		}
		
		System.out.println("70点以上の得点の数は" + count + "個です。");
			
	}

}


