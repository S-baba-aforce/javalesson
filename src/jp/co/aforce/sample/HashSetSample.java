package jp.co.aforce.sample;

import java.util.HashSet;
import java.util.Set;

public class HashSetSample {                                  //「Set」→ 要素の重複を許さない
	public static void main(String args[]) {
		
		Set<Integer> numList = new HashSet<Integer>();

		numList.add(2);
		numList.add(1);
		numList.add(1);
		numList.add(3);
		System.out.println(numList);	
	}

}
