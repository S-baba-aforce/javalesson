package jp.co.aforce.sample;

import java.util.HashMap;
import java.util.Map;

public class CountryCapital {
	public static void main(String[] args) {
		
		Map<String, String> CountryCity = new HashMap<>();
		
		System.out.println("すべての国名と首都");
		CountryCity.put("日本", "東京");
		CountryCity.put("アメリカ合衆国","ワシントンD.C");
		CountryCity.put("フランス","パリ");
		CountryCity.put("中国","北京");
		
		for (String country: CountryCity.keySet()) {
			System.out.println("国名: " + country + " 首都: " + CountryCity.get(country));
		}
		
//		String sun = CountryCity.get("日本");
		
//		if (sun!= null) {
//			System.out.println("「日」を含む国とその首都");
//		}
		
		for (Map.Entry<String, String> entry : CountryCity.entrySet()) {
            if (entry.getKey().contains("日")) {
                System.out.println("「日」を含む国とその首都");
            }
        }	
	}
}
