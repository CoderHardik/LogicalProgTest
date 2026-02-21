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


    public static List<Integer> revsubset(int A[], int n){

        if (A.length % n != 0) {
        System.out.println("not a valid N");
        return new ArrayList<>(); // Return empty list instead of 'break'
    }

        int block = A.length/n; // size of each block 
        int reverse_counter = 1; // pointer that will move
        int m=1; //current segment

        List<Integer> al = new ArrayList<>();
        
        while(m<=block){// when current segment reaches max segment then terminate

            if(reverse_counter<=n){
                al.add([m*n-reverse_counter]);
                reverse_counter++;
            }
            else{
                m++;
                reverse_counter=1;
            }
        }
        return al;
    }
     

}
