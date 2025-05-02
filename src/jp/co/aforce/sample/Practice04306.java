package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class Practice04306 {

	public static void main(String[] args) {
		
//		List<String> prefectureList = new ArrayList<String>();
//		
//		prefectureList.add("東京");
//		prefectureList.add("大阪");
//		prefectureList.add("京都");
//		prefectureList.add("福岡");
//		prefectureList.add("札幌");
//		
//		//1
//		Map<String, String> tourlistsData = new HashMap<>(); 
//
//		tourlistsData.put("東京","150万人、250万人");
//		tourlistsData.put("大阪","120万人、180万人");
//		tourlistsData.put("京都","80万人、120万人");
//		tourlistsData.put("福岡","50万人、80万人");
//		tourlistsData.put("札幌","40万人、60万人");
//		
//		System.out.println("\n" +tourlistsData + "\n");
//			
//		System.out.println("都道府県" + " " + "国内" + " " + "国外");
//		for (String pref: prefectureList) {
//			String data = tourlistsData.get(pref);
//			
//			System.out.println(pref + " " + " " + data);
//		}
//		
//		//2
//		/*全都市の総観光客数を計算する機能*/
//		
//		
//		Map<Integer, Integer> tourlistsData2 = new HashMap<>(); 
//		
//			tourlistsData2.put(150, 250);
//			tourlistsData2.put(120, 180);
//			tourlistsData2.put(80, 120);
//			tourlistsData2.put(50, 80);
//			tourlistsData2.put(40, 60);
//		
//			int total1 = 0;
//			for (int national: tourlistsData2.keySet()) {
//				total1 += national;
//			}
//			
//			int total2 = 0;
//			for (int foreign: tourlistsData2.values()) {
//				total2 += foreign;
//			}
//			
//			int totalAll = total1 + total2;
//			System.out.println("全都市の観光客数→" + totalAll + "万人");
		
			
		/*観光客数が100万人を超える都市を抽出する機能*/	
//		int each = 	tourlistsData2.key() + tourlistsData2.value();
		
//		
//		int i = 0;
//        for (Map.Entry<Integer, Integer> entry : tourlistsData2.entrySet()) {
//            String city = prefectureList.get(i);
//            int kokunai = entry.getKey();
//            int kokugai = entry.getValue();
//            
//            System.out.println(city + ", " + kokunai + ", " + kokugai);
//            i++;
//        }   
//        int eachTotal = 0;
//		for (Integer key: tourlistsData2.keySet() ) {
//			eachTotal += key + tourlistsData2.get(key);
//		}
//		if (eachTotal > 100) {
//			
//		}
//		Map<String, Integer> tourlistsData3 = new HashMap<>(); 
//			
//			tourlistsData3.put("東京", 150);
//			tourlistsData3.put("大阪", 120);
//			tourlistsData3.put("京都", 80);
//			tourlistsData3.put("福岡", 50);
//			tourlistsData3.put("札幌", 40);
//			
//		Map<String, Integer> tourlistsData4 = new HashMap<>(); 
//			
//			tourlistsData4.put("東京", 250);
//			tourlistsData4.put("大阪", 180);
//			tourlistsData4.put("京都", 120);
//			tourlistsData4.put("福岡", 80);
//			tourlistsData4.put("札幌", 60);
//			
//		for (String city: tourlistsData3.keySet()) {
//			
//		}
//		List<Integer> domestic = new ArrayList<Integer>();
//			
//			domestic.add(150);
//			domestic.add(120);
//			domestic.add(80);
//			domestic.add(50);
//			domestic.add(40);	
//			
//		List<Integer> international = new ArrayList<Integer>();
//			
//			domestic.add(150);
//			domestic.add(120);
//			domestic.add(80);
//			domestic.add(50);
//			domestic.add(40);
		
		List<TourlistData0430> tourlistDatas = new ArrayList<TourlistData0430>();
		tourlistDatas.add(new TourlistData0430("東京",150,250));
		tourlistDatas.add(new TourlistData0430("大阪",120,180));
		tourlistDatas.add(new TourlistData0430("京都",80,120));
		tourlistDatas.add(new TourlistData0430("福岡",50,80));
		tourlistDatas.add(new TourlistData0430("札幌",40,60));
		
		int total = 0;
		for (TourlistData0430 data: tourlistDatas) {
			int subTotal = data.calcTotal();
			total += subTotal;	
		}
		
		System.out.println("全都市の総観光客数→" + total);
		
		/*観光客数が100万人を超える都市を抽出する機能*/
		for (TourlistData0430 data: tourlistDatas) {
			int subTotal = data.calcTotal();
			total += subTotal;
			if (subTotal >= 100) {
			System.out.println(data.getCityName());
			}
		}	
		/*割合比較*/
		
		
		for (TourlistData0430 data: tourlistDatas) {
			
//			double ratio1 = data.getRatio();
			
//			if (ratio1 > maxRatio) {
//				
//			}
//		Collections.sort(data.getRatio());
		System.out.println(data.getCityName() + " → 割合: " + data.getRatio());
		}
	}

}
