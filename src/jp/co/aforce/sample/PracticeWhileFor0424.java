package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.Scanner;


public class PracticeWhileFor0424 {
	public static void main(String args[]) {
		
		/*=========while文========*/
		//問１
		int num = 1;
		while (num <= 10) {
			System.out.println("numの値は" + num);
			num ++;
		}
		
		//問２
		num = 1;
		int sum = 0;
		while (num <= 100) {
			num++;
			sum += num;
			System.out.println("numの合計は" + sum);
		}
		
		//問３
		Scanner NumberScan = new Scanner (System.in);
		num = 0;
		sum = 0;
		System.out.println("整数を入力せよ（「0」を入力すると終了）：");
		while ((num = NumberScan.nextInt()) != 0) {
			System.out.println("→" + num);
//			num = NumberScan.nextLine();
//			NumberScan.close();
			
//			if (num ==0) {
//				break;
//			}
				sum += num;
		}
		NumberScan.close();
		System.out.println("合計：" + sum);
		
		/*=============do-while文==============*/
		//問１
		int number = 1;
		do {
			System.out.println("numberの値は" + number);
			number ++;
		} while (number <= 10);
		
		//問２
		number = 1;
		int sum2 = 0;
		do {
			number++;
			sum2 += number;
			System.out.println("numberの合計は" + sum2);
		} while (number <= 100);
		
		//問３
		
		/*==============for文===============*/
		//問１
		for (int figure = 1; figure<=10; figure ++) {
			System.out.println("整数を1から10まで並べると" + figure);
		}
		
		//問２
		int sum5 = 0;
		for (int figure = 1; figure <= 100; figure ++) {
			sum += 1;
			
			System.out.println("合計→" + sum5);
		}
		//問３
		
		
		int y = 13;
		int z = 17;
		int total = y + z;
		System.out.println(total);
		
		/*================拡張for文==================*/
		//1
		int[] figures = {1,2,3,4,5};
		
		for (int figure : figures ) {
			System.out.println(figure);
		}
		
		//2
		ArrayList<String> list = new ArrayList<>();
		list.add("dog");
		list.add("fish");
		list.add("monkey");
		
		for (String animal:list) {
			System.out.println(animal);
		}
		
		//3
		int[] figures2 = {6,7,8,9};
		int total1 = 0;
		
		for (int figure2:figures2) {
			total += figure2;
			
			System.out.println("合計は" + "" + total1);
			
		}
		
	}

}
