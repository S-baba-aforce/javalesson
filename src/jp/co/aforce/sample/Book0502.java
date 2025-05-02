package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class Book0502 {

	public static void main(String[] args) {
		
		List<BookData0502>list = new ArrayList<BookData0502>();
		list.add(new BookData0502("「Python入門」","山田太郎",1500,2500));
		list.add(new BookData0502("「データ分析の基礎」","鈴木花子",1200,3000));
		list.add(new BookData0502("「AI技術最前線」","佐藤一郎",800,4000));
		list.add(new BookData0502("「Webデザイン講座」","田中美咲",2000,2000));
		list.add(new BookData0502("「はじめての機械学習」","中村健一",900,3500));
		
		int total = 0;
		for (BookData0502 data: list) {
			total = data.calcTotal();
		}
		
		System.out.println("全書籍の総売上額;" + total);
		
		for (BookData0502 data: list) {
//			for (data.getRatio() = 0;)
//			System.out.println(data.getTitle() + " → 割合: " + data.getRatio());
		}
	}

}
