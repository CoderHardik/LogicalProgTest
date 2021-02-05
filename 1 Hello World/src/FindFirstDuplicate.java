import java.util.ArrayList;

/*
 * Eg. I/P : [1, 2, 4, 4, 1, 3, 7, 5, 5, 2]
O/P : 4

This is little ambiguous. Here if question is that which repeated element show up first then it is 4
and if which element that is repeated shows up first then it is 2.
 * https://www.geeksforgeeks.org/amazon-interview-experience-set-420-qae/
 * 
 */
public class FindFirstDuplicate {
	
	public static void main(String[] args) {
    	
    	int A[] = {1, 2, 4, 4, 1, 3, 7, 5, 5, 2};
    	int res = first_duplicate(A);
    	System.out.println(res);
    	
    }//end of main
    
   
    public static int first_duplicate(int A[]){

    	ArrayList<Integer> ls = new ArrayList<Integer>();
    	
    	int duplicate = 0;
    	for(int a: A){
    	if(ls.contains(a)){
    	duplicate=a;
    	break;
    }//end of if

    else{
    	ls.add(a);
    }//end of else

    }//end of for
    	
    	return duplicate;
    }//end of method
    	
    

}
