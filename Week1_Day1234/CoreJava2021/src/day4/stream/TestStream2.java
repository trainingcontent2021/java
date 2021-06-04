package day4.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream2 {
	public static void main(String[] args) {
		//Stream.iterate(initial value, next value)
		Stream.iterate(0, n -> n + 1)
		                .limit(10)
		                .forEach(x -> System.out.println("Test:"+x));
		
		//-------------------------------------------
		Stream.iterate(0, n -> n + 1)
		.filter(x -> x % 2 != 0) //odd
		.limit(10)
		.forEach(x -> System.out.println(x));

		
		//----------------------------------------Intermediate Operations-------------
		/*FILTER - accepts a Predicate to filter all elements of the stream. 
		 * This operation is intermediate which enables us to call another stream operation (e.g. forEach()) on the result.
		 * */
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Alex");
		memberNames.add("Sams");
		memberNames.add("Adam");
		memberNames.add("Rox");
		memberNames.add("Soleman");
		memberNames.add("Lokesh");
		memberNames.stream().filter((s) -> s.startsWith("A"))
        .forEach(System.out::println);

		
		//Map - The map() intermediate operation converts each element in the stream into another object via the given function.
		
		memberNames.stream().filter((s) -> s.startsWith("A"))
		 .map(String::toUpperCase)
		 .forEach(System.out::println);  

		//Sorted() - The sorted() method is an intermediate operation that returns a sorted view of the stream. 
		memberNames.stream().sorted()
        .map(String::toUpperCase)
        .forEach(System.out::println);

		//flatmap =  flattening is referred to as merging multiple collections/arrays into one.
		{        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,5,6);
        List<Integer> list3 = Arrays.asList(7,8,9);
        List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);
         
        List<Integer> listOfAllIntegers = listOfLists.stream()
                            .flatMap(x -> x.stream())
                            .collect(Collectors.toList());  
        System.out.println(listOfAllIntegers);
    }

		//------------------Terminal Oepration-----------------------------------
		// Collect()
		System.out.println("------------Terminal Oeprations");
		List<String> memNamesInUppercase = memberNames.stream().sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
		System.out.print(memNamesInUppercase);
		
		//match()
		boolean matchedResult = memberNames.stream().anyMatch((s) -> s.startsWith("A"));   
		System.out.println(matchedResult); //true
		matchedResult = memberNames.stream().allMatch((s) -> s.startsWith("A")); 
		System.out.println(matchedResult); //false
		matchedResult = memberNames.stream().noneMatch((s) -> s.startsWith("A")); 
		System.out.println(matchedResult); //false

		//count() =
		long totalMatched = memberNames.stream()
			    .filter((s) -> s.startsWith("A"))
			    .count();
		
		//reduce()
		Optional<String> reduced = memberNames.stream()
		        .reduce((s1,s2) -> s1 + "#" + s2);
		 
		reduced.ifPresent(System.out::println);

		System.out.println(totalMatched); //2

	}

}
