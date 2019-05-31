import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MergeTwoArraylistinoneAndSortWithStream {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(4);
		list1.add(5);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(2);
		list2.add(3);
		list2.add(6);
		
		//Merging two list
		Stream<Integer> newStream = Stream.concat(list1.stream(), list2.stream());
		
		newStream.sorted().forEach(s->System.out.println(s));

	}

}
