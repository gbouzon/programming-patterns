/** MIT License Copyright (c) 2021 Giuliana Bouzon
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package comparablecomparatordemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A simple driver class.
 * @author Giuliana Bouzon
 */
public class ComparableComparatorDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List <Student> listOne = new ArrayList<>();
         
        listOne.add(new Student(12678, "Harry", 3.4));
        listOne.add(new Student(13679, "Eric", 2.9));
        listOne.add(new Student(14666, "Jean", 3.5));
         
        for (Student student : listOne) 
            System.out.println("ID Number is " + student.getGpa());
         
        //natural sorting calls the compareTo() method defined by the Comparable interface
        //to call the Comparator interface, use the sort() method with 2 parameters as is done below 
        System.out.println("Using Natural-order sort ");

        /* if we write this line without having the Student class implement
            the Comparable or the Comparator interface we get an error.
            Student class is a user-defined class and the compiler does not
            know how to sort it, so we have to tell it by implementing one of the
            sorting interfaces.
        */ 
    
        Collections.sort(listOne, new CompareStudent());
        
        //if we want to reverse the order of our comparator, we call the inverse() method
        //method WITH parameters uses whatever comparator class we want
        //method WITHOUT parameters goes to the natural sorting which uses Comparable interface (compareTo() method).
        Collections.reverseOrder(new CompareStudent());

        for (Student student : listOne)
            System.out.println("ID Number is " + student.getGpa());
    }
}
