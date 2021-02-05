
public class PowerFactorWithLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base = 3, exponent = 4;

        long result = 1;

        for (int i=1 ;i<exponent; i++)
        {
            result *= base;
        }

        System.out.println("Answer = " + result);

	}

}
