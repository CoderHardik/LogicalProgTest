import java.util.ArrayList;

/*https://www.techbeamers.com/amazon-quality-assurance-engineer-interview-guide/
 * i.e.
 * N-3
 * Input: [1,3,5,7,9,11,15,17,19], 
 * Output: [5,3,1,11,9,7,19,17,15].
 * 
 */


public class ReverseArrayWithSubsetofNAmazon {
	
	public static void main(String[] args) {
    	int []A = {1,3,5,7,9,11,15,17,19};
    	reverse_subset(A,3);
    }//end of main 


    public static void reverse_subset (int A[], int n){
    	ArrayList <Integer> al = new ArrayList <Integer>();	
    	
    	int len = A.length;
    	int x = (len/n);
    	int temp=1;
    	int m=1;
    	
   
    	while(m<=x) { // m is internal counter, with every n=3 it will restart
    		if (temp <=n){
		    al.add(A[(m*n)-temp]); // this is index of where to put element- A[(m*n)-temp
		    temp++;   // Here temp is condition to run loop,  
		    }
		    else{
		    m++;
		    temp=1;
		    }
		 }//end of while
	 
    Object Res[] = al.toArray();  // convert Arraylist to array
    	
    for (Object a:Res) {
    	System.out.println(a);
    }
}//end of method    

}
