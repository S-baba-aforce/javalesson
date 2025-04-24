package jp.co.aforce.sample;

public class Practice0421 {
	public static void main(String[] args) {
		
		/*17*/
        boolean a = true;
        boolean b = false;
        boolean c = (a && b) || (!a && !b);
        	System.out.println(c);
        	
       /*18*/
        boolean x = true;
        boolean y = false;
        boolean z = x || y && !x;
        	System.out.println(z); 
        	
        /*19*/
        boolean p = false;
        boolean q = true;
        boolean r = !(p || q) && (p && !q);
        	System.out.println(r);
        		
	}
}
