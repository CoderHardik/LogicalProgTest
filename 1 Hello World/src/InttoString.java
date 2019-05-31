
import java.util.HashMap;
import java.util.Map;

public class InttoString {

	public static void main(String[] args) {
		
		int num= 114;
		String st =numMassage(num);
		System.out.println(st);

	}//end of main
	
	public static String numTostring(int a) {
		Map <Integer, String> hm = new HashMap<>();
		hm.put(0, "zero");
		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "three");
		hm.put(4, "four");
		hm.put(5, "five");
		hm.put(6, "six");
		hm.put(7, "seven");
		hm.put(8, "eight");
		hm.put(9, "nine");
		hm.put(10, "ten");
		hm.put(11, "eleven");
		hm.put(12, "twelve");
		hm.put(13, "thirteen");
		hm.put(14, "fourteen");
		hm.put(15, "fifteen");
		hm.put(16, "sixteen");
		hm.put(17, "seventeen");
		hm.put(18, "eighteen");
		hm.put(19, "nineteen");
		hm.put(20, "twenty");
		hm.put(30, "thirty");
		hm.put(40, "forty");
		hm.put(50, "fifty");
		hm.put(60, "sixty");
		hm.put(70, "seventy");
		hm.put(80, "eighty");
		hm.put(90, "ninty");
		hm.put(100, "hundred");
		
		return hm.get(a);
	}// end of numTostring
	
	public static String numMassage(int num) {
		int a[]=new int[3];
		int temp=0, count=0;
		while(num>0) {
			temp=num%10;
			num=num/10;
			a[count]=temp;
			count++;
		}//end of while
		String res="";
		
		res = stringforthirddigit(a[2])+' ' +stringfortwodigit(a[1], a[0]);
		
		return res;
		
	}// end of num massage
	
	public static String stringforthirddigit(int a) {
		
		String st = numTostring(a)+' '+"hundred";
		return st;
	}//end of stringfor
	
	public static String stringfortwodigit(int a, int b) {
		int num = (a*10)+b;
		String st;
		if(num<20) {
			st = numTostring(num);
		}
		
		else {
			st = numTostring(a*10)+' '+numTostring(b);
		}
		
		return st;
	}

}
