
public class ReverseInteger {

	public static void main(String[] args) {
		
		int inum= 71265;
		
		int rev=0;
		
		int temp=inum;
		
		while(temp>0) {
			rev = (rev*10)+(temp%10);
			temp=temp/10;
		}//end of while

		System.out.println(rev);
	}

}
