
public class LongestCommingPrefix {

	public static void main(String[] args) {
		
		String st1= "java"; // convert all to lower case in generic solution so that part is taken care of
		String st2 = "javascipt";
		String st3 = "javamachine";
		
		char [] ch1 = st1.toLowerCase().toCharArray();
		char [] ch2 = st2.toLowerCase().toCharArray();
		char ch3[] = st3.toLowerCase().toCharArray();
		char [] small;
		if(ch3.length<ch2.length && ch3.length<ch1.length) {
			small= ch3;
		}
		
		else if(ch2.length<ch1.length && ch2.length<ch3.length) {
			small=ch2;
		}
		else {
			 small=ch1;
		}
		
		String res="";
		
		for (int i=0; i<small.length; i++) {
			if(st1.charAt(i)==small[i] && st2.charAt(i)==small[i] && st3.charAt(i)==small[i]) {
				res = res + small[i];
			}//end of if
			else
			{
				res ="";
			}
			
		}//end of for
	
		System.out.println(res);

	}

}
