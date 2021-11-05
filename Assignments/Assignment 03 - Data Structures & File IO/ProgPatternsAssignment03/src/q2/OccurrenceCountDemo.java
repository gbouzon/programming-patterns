/** MIT License Copyright (c) 2021 Chilka Castro, Giuliana Bouzon

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

package q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
* Application class for Assignment 01, Q2.
* @author Giuliana Bouzon
*/
public class OccurrenceCountDemo {

    public static void main(String[] args) {

	//creating scanner object for user input
	Scanner console = new Scanner(System.in);
	
	//variables & data structures
        Map<Integer, Integer> numsMap = new HashMap<>();
        Integer num;
        Integer occurence = 1;
        List<Integer> inputs = new ArrayList<>();

        do {
            System.out.println("Please input a number");
            num = console.nextInt();
            inputs.add(num);
            
            if (!numsMap.containsKey(num)) 
                numsMap.put(num, occurence);
            
            else
                for (Map.Entry<Integer, Integer> entry : numsMap.entrySet())
                    if (entry.getKey().equals(num))
                        entry.setValue(entry.getValue() + 1);
            
        } while (num != 0);

        numsMap.forEach((k, v) -> System.out.println("Key : " + k + " Frequency: " + v));
        Integer maxValue = Collections.max(numsMap.values());
        
        for (Map.Entry<Integer, Integer> entry : numsMap.entrySet())
            if (entry.getValue() == maxValue)
                System.out.println("Number that occurred most: " + entry.getKey() 
                        + "  " + "Frequency : " + maxValue);
                        
        System.out.println("\nAll input integers : " + inputs);
        
        //closing scanner to avoid resource leaks
        console.close();
    }
}