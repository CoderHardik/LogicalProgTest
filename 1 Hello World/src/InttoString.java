
import java.util.HashMap;
import java.util.Map;

public class InttoString {

	public static void main(String[] args) {
		int num= 999;
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
		}
		int b[]= new int[a.length];
		
		for(int i: b) {	
			b[i]=(a[i])*(10^i);
		}	
		String res="";
		res = stringforthirddigit(a[2])+' ' +stringfortwodigit(a[1], a[0]);
		return res;
	}
	
	public static String stringforthirddigit(int a) {
		String st = numTostring(a)+' '+"hundred";
		return st;
	}
	
	public static String stringfortwodigit(int a, int b) {
		int num = (a*10)+b;
		String st;
		if(num<20) {
			st = numTostring(num); //refer to hashmap
		}
		
		else {
			st = numTostring(a*10)+' '+numTostring(b);
		}
		
		return st;
	}

}


/* Following is much better and proper way to do this

public class NumberToWords {
    // Arrays to store word representations
    private static final String[] units = {
        "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
        "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] tens = {
        "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    public static String convert(int n) {
        if (n == 0) return "zero";
        
        // Handle numbers up to 999,999 (can be extended to millions/billions)
        if (n < 20) return units[n]; // Basically call array index and that will have given number
        if (n < 100) return tens[n / 10] + (n % 10 != 0 ? " " + units[n % 10] : ""); 
		//if 34 - n/10 will give thirty and then (n % 10 != 0 ? " " + units[n % 10] : "") will check if any one digit value in our example 4 so - thirty four
		// following program by if else
		//String result = tens[n / 10]; // Get "thirty"

		//	if (n % 10 != 0) {
    	//  result = result + " " + units[n % 10]; // Add " " and "four"
		//   } else {
    	//  result = result + ""; // Add nothing
}
        if (n < 1000) return units[n / 100] + " hundred" + (n % 100 != 0 ? " " + convert(n % 100) : "");
        if (n < 1000000) return convert(n / 1000) + " thousand" + (n % 1000 != 0 ? " " + convert(n % 1000) : "");
        
        return "number too large";
    }

    public static void main(String[] args) {
        int ip = 1234;
        String op = convert(ip);
        System.out.println("ip = " + ip + " then op = " + op);
    }
}


*/
