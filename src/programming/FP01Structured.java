package programming;

import java.util.Arrays;
import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		List<Integer> numbers = List.of(12,9,10,18,20,30);
		printAllEvenNumbersinListStructured(numbers);
		
	}

	private static void printAllEvenNumbersinListStructured(List<Integer> numbers) {
		
		for(int number:numbers) {
			if(number % 2 ==0)
				System.out.println(number);
		}
	}
	
	

}
