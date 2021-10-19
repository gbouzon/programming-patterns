/** MIT License Copyright (c) 2021 Giuliana Bouzon

* Permission is hereby granted, free of charge, to any person obtaining a copy
* of this software and associated documentation files (the "Software"), to deal
* in the Software without restriction, including without limitation the rights
* to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
* copies of the Software, and to permit persons to whom the Software is
* furnished to do so, subject to the following conditions:

* The above copyright notice and this permission notice shall be included in
* all copies or substantial portions of the Software.

* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
* FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
* AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
* LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
* OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
* THE SOFTWARE.
*/

package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
* Demo on how to use Streams in Java
* From Using_Java_Streams.pdf 
* @author Giuliana Bouzon
*/
public class UsingStreams {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	//LAMBDA EXPRESSIONS AND STREAMS
	
	Double[] numbers = {2.4, 55.6, 90.12, 26.6};
        ArrayList<Double> list = new ArrayList<>(Arrays.asList(numbers));
        int count = 0;
        
          for (double num: list)
              if (num > 60) 
        	count++;
          
        System.out.println("Count is " + count);
            
        System.out.println("Count using Streams is " + list.stream().filter(e -> e > 60).count());
        
        list.stream().filter(e -> e > 60).count();
        
        //creating stream from an array
        Stream.of(numbers).filter(num -> num > 60).count();
        Stream.of(2.4, 55.6, 90.12, 26.6).filter(e -> e > 60).count();
        
        
        // Printing result -------------------------------Parameters------Expression-----------//
        System.out.println("min is : " + list.stream().min((e1, e2) -> Double.compare(e1, e2)));
        
         //works similar to 2 parameter sort() method.
         //Compares any two elements of the list (in this case, the stream)
         //**please rename variables**
        
        List<Integer> intList = Arrays.asList(2, 4, 5, 6, 8);
        boolean allEven = intList.stream().allMatch(i -> i % 2 == 0);
        boolean oneEven = intList.stream().anyMatch(i -> i % 2 == 0);
        boolean noneMultipleOfThree = intList.stream().noneMatch(i -> i % 3 == 0);
        
        System.out.println("My source: " + intList);
        System.out.println("All matching: " + allEven);
        System.out.println("Any matches: " + oneEven);
        System.out.println("No matches: " + noneMultipleOfThree);
        
        //STREAM METHODS
        
        String[] names = {"John", "Peter", "Susan", "Kim", "Jen", "George", "Alan", "Stacy", "Michelle", "john"}; 
        
        // Display the first four names sorted
        Stream.of(names).limit(4).sorted().forEach(name -> System.out.print(name + " ")); 
        
        // Skip four names and display the rest sorted ignore case
        // Using Lambda expression
        Stream.of(names).skip(4).sorted((name1, name2) -> 
        name1.compareToIgnoreCase(name2)).forEach(name -> System.out.print(name + " ")); 
        
        // Using method reference
        //method reference - String::compareToIgnoreCase
        Stream.of(names).skip(4).sorted(String::compareToIgnoreCase).forEach(name -> System.out.print(name + " ")); 	
        System.out.println("\nLargest string with length > 4: " + 
        	Stream.of(names).filter(name -> name.length() > 4).max(String::compareTo).get());

        System.out.println("Smallest string alphabetically: " + Stream.of(names).min(String::compareTo).get());
        
        System.out.println("Is Stacy in names? " + Stream.of(names).anyMatch(name -> name.equals("Stacy")));
        
        System.out.println("All names start with a capital letter? " + 
        Stream.of(names).allMatch(name -> Character.isUpperCase(name.charAt(0))));
        
        System.out.println("No name begins with Ko? " + 
        Stream.of(names).noneMatch(name -> name.startsWith("Ko")));
        
        System.out.println("Number of distinct case-insensitive strings: " 
        	+ Stream.of(names).map(name -> name.toUpperCase()) .distinct().count());
        
        System.out.println("Skip 4 and get any element in this stream: " + 
        	Stream.of(names).skip(4).sorted().findAny().get()); 
        
        
        //YOU DO IT PART
        int[] nums = {1, 2};
        
        //use subtype of Stream when possible(works better)
        System.out.println("There are " + 
        	IntStream.of(nums).distinct().count() + " distinct numbers in nums");
        
        IntStream.of(nums).distinct().sorted().forEach(num -> System.out.print(num + " "));
    }
}