import java.util.Arrays;

/*Amazon :  Given a number in an array form. Write a program to move all zeros to the end.
 * https://www.techbeamers.com/amazon-quality-assurance-engineer-interview-guide/
 */
public class MovezeroToEnd {

	public static void main(String[] args) {
		   int a[] ={1,2,0,4,5};
		   
		   System.out.println(Arrays.toString(movezerotoend(a)));
		    }//end of main
		    
		    
		    public static int[] movezerotoend(int a[]){

		    	int swap =a.length-1;
		    	int count=0;
		    	
		    		
		    		while(count<swap) {
		    			if(a[count]==0){
		    				a[count]=a[swap];
				    		a[swap]=0;
				    		swap--;
		    			}
		    			count++;
		    		}

		    	return a;

		    	}
	    	
	
}
