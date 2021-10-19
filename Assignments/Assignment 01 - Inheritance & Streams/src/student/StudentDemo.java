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

package student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

/**
* A simple application class to test Student class.
* Answers questions from Part2 of assignment0.docx
* @author Giuliana Bouzon
*/
public class StudentDemo {
    
    /**
     * Adds names starting with a specific string to a list.
     * @param students, the input Student list.
     * @param value, the specific starting string.
     * @return the list with the specified condition (start with String "value").
     */
    public static List<Student> retrieveNamesStartingWith(ArrayList<Student> students, String value) {
	return students.stream().filter(student -> student.getName().toLowerCase().
		startsWith(value.toLowerCase())).collect(Collectors.toList());
    }
    
    /**
     * Takes the summary statistics (average, min, max, sum) of a double array where the numbers are above 60.
     * @param nums, the input double array.
     * @return the statistics object.
     */
    public static DoubleSummaryStatistics getSummaryStatistics(double[] nums) {
	return DoubleStream.of(nums).filter(number -> number > 60).summaryStatistics();
    }

    public static void main(String[] args) {
	
	//creating arraylist
	ArrayList<Student> list = new ArrayList<>();
	
	//creating student objects
	Student student1 = new Student("Joan", 99);
	Student student2 = new Student("Jonathan", 58);
	Student student3 = new Student("Sarah", 81);
	Student student4 = new Student("Giuliana", 94);
	Student student5 = new Student("Ronald", 76);
	
	//adding students to the list
	list.add(student1);
	list.add(student2);
	list.add(student3);
	list.add(student4);
	list.add(student5);
	
	//print the names of all students in descending order of their scores
	System.out.println("Names of students in descending order of their score:");
	list.stream().sorted((Student s1, Student s2) -> Double.compare(s2.getScore(), s1.getScore()))
	.forEach(student -> System.out.print(student));
	
	//skipping a line
	System.out.println();

	//print the first 3 students' names with the highest scores
	System.out.println("The first 3 students' names with the highest scores:");
	list.stream().sorted((Student s1, Student s2) -> Double.compare(s2.getScore(), s1.getScore())).limit(3)
	.forEach(student -> System.out.print(student));
	
	//skipping a line
	System.out.println();
	
	//print students' names starting from the shortest name first
	System.out.println("Names of students in ascending order of length:");
	list.stream().sorted((Student s1, Student s2) -> s1.getName().length() - s2.getName().length()).
	forEach(student -> System.out.print(student));
	
	//skipping a line
	System.out.println();
	
	//print all students' name start with "Jo" 
	System.out.println("Students' names that start with 'Jo':");
	System.out.println(retrieveNamesStartingWith(list, "Jo"));
	
	//skipping a line
	System.out.println();
	
	//Q2. 
	double[] nums = {1, 10, 20, 30, 60, 70, 80, 90, 100, 110};
	System.out.println(getSummaryStatistics(nums));
	
	//skipping a line
	System.out.println();
	
	//Q4. 
	//getting average from the array
	double average = DoubleStream.of(nums).summaryStatistics().getAverage();
	
	//printing how many number are above/below/equal to the average 
	System.out.println(Arrays.toString(nums));
	System.out.println("Average of the numbers in the array: " + average);
	System.out.println("Above the average: " + DoubleStream.of(nums).filter(number -> number > average).count());
	System.out.println("Equal to the average: " + DoubleStream.of(nums).filter(number -> number == average).count());
	System.out.println("Below the average: " + DoubleStream.of(nums).filter(number -> number < average).count());
    }
}