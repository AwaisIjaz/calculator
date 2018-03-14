import java.util.Arrays;
import java.util.ArrayList;
public class Calculator {

	public static void main(String[] args) {
		int[] threeNumbers = new int[3];
	    threeNumbers[0] = 5;
	    threeNumbers[1] = 3;
	    threeNumbers[2] = 15;
	    
	    findCalculationOutcomes(threeNumbers);
	}
	
	static void findCalculationOutcomes(int[] threeNumbers) {
		Arrays.sort(threeNumbers);
		ArrayList<int[]> multiplicationOutcomes = findMultiplicationOutcomes(threeNumbers);
		printOutcomes(multiplicationOutcomes, "*");
		
		
	}
	
	static void printOutcomes(ArrayList<int[]> outcomes, String operator) {
		
		for (int[] outcome : outcomes) {
			System.out.println(formatCalculation(outcome, operator));
		}
	}
	
	static ArrayList<int[]> findMultiplicationOutcomes(int[] threeNumbers) {
		ArrayList<int[]> multiplicationOutcomes = new ArrayList<int[]>();
		int[] permutation =  {threeNumbers[0], threeNumbers[1], threeNumbers[2]};
		if (permutation[2] == permutation[1] * permutation[0]) {
			multiplicationOutcomes.add(permutation);
		}
		return multiplicationOutcomes;	
		
	}
	
	static String formatCalculation(int[] threeNumbers, String operator) {
		String equation = String.format("%d %s %d = %d", threeNumbers[0], operator, threeNumbers[1], threeNumbers[2]);
		return equation;	
	}
		
	
}
