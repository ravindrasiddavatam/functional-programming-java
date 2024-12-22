package programming;

import java.util.Arrays;
import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		List<Integer> numbers = List.of(12,9,10,18,20,30,3);
		//printAllEvenNumbersinListStructured(numbers);
		List<String> courses = List.of("Spring","SpringBoot","API","MicroServices",
				"AWS","PCF","Azure","Docker","Kubernetes");
		
		//printAllOddNumbersinListStructured(numbers);
		//printAllCoursesIndividually(courses);
		//printAllCoursesContainingSpring(courses);
		//printAllCourseNamesContainsAtleastfourcharacters(courses);
		printCubesOfOddNumbers(numbers);
		//printnumberofcharactersineachcourse(courses);
		
	}
	
	
private static void printnumberofcharactersineachcourse(List<String> courses) {
			
		courses.stream().map(course -> course + " -> " +course.length())
		.forEach(System.out::println);
		
	}


private static void printCubesOfOddNumbers(List<Integer> numbers) {
		
		numbers.stream().filter(number -> number % 2 !=0)
		.map(number ->number + "->" + number*number*number).forEach(System.out::println);
		
	}


private static void printAllCourseNamesContainsAtleastfourcharacters(List<String> courses) {
		
		courses.stream().filter(course->course.length()>=4)
		.forEach(System.out::println);
	}


		private static void printAllCoursesContainingSpring(List<String> courses) {
		courses.stream().filter(course->course.contains("Spring"))
		.forEach(System.out::println);
		
	}


		private static void printAllCoursesIndividually(List<String> courses) {
		courses.stream().forEach(System.out::println);
		
	}


		private static void printAllOddNumbersinListStructured(List<Integer> numbers) {
				
			numbers.stream().filter(number -> number%2 != 0)
			.forEach(System.out::println);
				
			}


//	private static boolean  isEven(int number){
//		return number%2==0;
//	}
	private static void printAllEvenNumbersinListStructured(List<Integer> numbers) {
		//method reference
		numbers.stream().filter(number->number%2==0).forEach(System.out::println);
	}
}
