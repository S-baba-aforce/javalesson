package jp.co.aforce.sample;

public class ArrayUtils0430 {
	public static int max(int[] num) {
		int maxNumber = num[0];
		for (int number:num) {
			if (number > maxNumber) {
				maxNumber = number;
			}
		}
		return maxNumber;
	}

	public static void main(String[] args) {
		int[] figure = {0,1,2,3,4};
		int maxNumber = ArrayUtils0430.max(figure);
		System.out.println("最大値は" + maxNumber);
		

	}

}
