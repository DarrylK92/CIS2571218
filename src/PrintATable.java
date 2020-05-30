import static java.lang.Math.pow;

/**
 * Homework1 - 2.18: Prints a table
 * 
 * CIS2571-002
 * @author Darryl Karney
 * @version 06Jun2018
 */
public class PrintATable {

	public static void main(String[] args) {
		//Print headers
		System.out.println("a    b    pow(a, b)");
		
		//Print table
		for(float i = 1f; i < 6f; i++) {
			float iPlusOne = i+1f;
			System.out.println((int)i + "    " + (int)iPlusOne + "    " + (int)pow((int)i, (int)iPlusOne));
		}
	}

}
 