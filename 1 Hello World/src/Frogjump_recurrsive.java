
public class Frogjump_recurrsive {

	
/*
	 Frog can jump 1 or 2 steps write the code to find out number of ways to go up to n steps
--   scenario 1: n=2  feet ==> start -> 1 feet step1 -> 1 feet end = here there are 2 way. 
	 start-step1-end   and start-end
--   Scenario 2: n=3  feet ==> start- 1 feet steps1 --> 1 feet step2 --> end  total steps are 5
	 2 possible steps from point start(to step1, to step2), 
	 2 possible steps from step1 (to step2, to end), 
	 1 possible step from step 2 (to end)
--   Scenario 3: n=4 	 
*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jump= jumpSteps(5);
		System.out.println("Total possible jumps: "+jump);
		
	}
	
	static int jumpSteps(int step)
	{
	if (step == 1)
	return 1;
	else if (step == 2)
	return 2;

	return jumpSteps(step - 1) + jumpSteps(step - 2);
	} 

}
