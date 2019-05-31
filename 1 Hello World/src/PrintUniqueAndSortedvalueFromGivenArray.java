import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintUniqueAndSortedvalueFromGivenArray {

	public static void main(String[] args) {
		
		//This is done by using streams
		List <Integer> list = Arrays.asList(3,2,2,7,5,1,9,7);
		
		 List<Integer> res= list.stream().distinct().sorted().collect(Collectors.toList());
	
		 res.stream().forEach(s->System.out.println(s));
		

	}

}
