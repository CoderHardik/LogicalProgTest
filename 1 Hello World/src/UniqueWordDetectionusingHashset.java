import java.util.HashSet;

public class UniqueWordDetectionusingHashset {

	// for integer detection, change this array to integer array and have hashset with integer then iterate loop -->while (value.hasNext())
	
	public static void main(String[] args) {
		String[] words = new String("Nothing is as easy as it looks").split(" ");

		HashSet<String> hs = new HashSet<String>();
		
		for (String x : words) hs.add(x);

		System.out.println(hs.size() + " distinct words detected.");
		System.out.println(hs);
	}

}
