import java.util.Arrays;

/*Amazon :  Given a number in an array form. Write a program to move all zeros to the end.
 * https://www.techbeamers.com/amazon-quality-assurance-engineer-interview-guide/

 Dont just move and switch zeros, basically it will swap but later when you go to last element which is zero, it will swap again.
 */
public class MovezeroToEnd {

	public static void main(String[] args) {
		   int a[] ={1,2,0,4,5};
    int res[] = movezero(a);
    for(int x: res){
      System.out.println(x);
    }
  }

  public static int [] movezero(int A[]){
    int counter = 0;
    int temp=0;
   for (int i = 0; i < A.length; i++){
      if (A[i]!=0){
        temp = A[i];
        A[i]=A[counter];
        A[counter]=temp;
        counter++ ;
      }
    }
    return A;
  }
	
}
