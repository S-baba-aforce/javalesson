package jp.co.aforce.sample;

public class Taiyaki0425 {
	
	String filling;
	
	//中身をセットするメソッド
	public void setFilling(String value) {
		filling = value;
		 
	}
	
	//中身を表示するメソッド
	public void showFilling() {
		System.out.println("このたい焼きの中身は：" + filling + "です。");
	}	
	
	public static void main(String[] args) {
		//①インスタンス化
		Taiyaki0425 taiyaki1 = new Taiyaki0425();
		Taiyaki0425 taiyaki2 = new Taiyaki0425();
		
		//②フィールドへ代入
		taiyaki1.filling = "クリーム";
		taiyaki2.filling = "あんこ"; 
		
		//③メソッド呼び出し
		taiyaki1.showFilling();
		taiyaki2.showFilling();
	}
}	
	


