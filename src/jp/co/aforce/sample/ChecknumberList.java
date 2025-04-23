package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class ChecknumberList {
	public static void main(String args[]) {
		
		/*問題*/
		
		List<String> emptyList = new ArrayList<String>();
		
		int num = 7;                        //整数型の変数
		
		String large = "large";
		String small = "small";
		
		if (num > 10) {
			emptyList.add (large);
		} else {
			emptyList.add (small);
		}
		System.out.println(emptyList);
	}
}
