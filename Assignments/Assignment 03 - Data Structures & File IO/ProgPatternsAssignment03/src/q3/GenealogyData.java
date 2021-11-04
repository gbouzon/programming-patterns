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

package q3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
*
* @author Chilka Castro & Giuliana Bouzon
*/
public class GenealogyData {
    
    //DONT FORGET TO CLOSE ALL SCANNERS AT THE END 
    //RESOURCE LEAKS ARE A THING IN JAVA :facepalm:^
    
    //class variables
    static Scanner console = new Scanner(System.in);
    static String nameRegex = "^[A-Za-z]+$"; //regex to only accept 1+ letters when retrieving user input
    static File file = new File("data.txt");
    
    /**
     * Retrieves descendant/ancestor name.
     * Only accepts valid input
     * @param type, descendant or ancestor
     * @return the entered String value.
     */
    public static String retrieveName(String type) {
	String name = "";
	do {
	    System.out.print("Please enter " + type + " name: ");
	    name = console.nextLine();
	} while (!Pattern.matches(nameRegex, name));
	
	return name;
    }
    
    /**
     * Populates the linkedhashmap with the information in the file
     * @param map, the linkedhashmap to be populated
     * @return ^^
     * @throws FileNotFoundException 
     */
    public static Map<String, List<String>> populateMap(Map<String, List<String>> map) 
	    throws FileNotFoundException {
	
	//initializing variables
	int nbLines = 0;
	String ancestor = "";
	List<String> descendants = new ArrayList<>();
	Scanner input = new Scanner(new FileInputStream(file));
	
	//getting number of lines (aka size of map)
	while(input.hasNextInt()) {
	    nbLines = input.nextInt();
	}
	//testing
	System.out.println(nbLines);
	
	
	return map;
    }

    public static void main(String[] args) {
	
	Map<String, List<String>> familyMap = new LinkedHashMap<>();
	
	//TESTINGGGGGGGGG
	try {
	    populateMap(familyMap);
	} catch (FileNotFoundException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	
	//deal with all this laters
	//also: switch from linkedlist to arraylist pls and thank
        familyMap.put("Ben", Arrays.asList(new String[]{"Anna", "Sam", "Eddy"}));
        familyMap.put("Anna",Arrays.asList(new String[]{"Pierre"}));
        familyMap.put("Sam", Arrays.asList(new String[]{"Nasrine", "Alex", "Mary"}));
        familyMap.put("Eddy", new ArrayList<>());
        familyMap.put("Pierre", Arrays.asList(new String[]{"Rita", "Miguel"}));
        familyMap.put("Nasrine", new ArrayList<>());
        familyMap.put("Alex", new ArrayList<>());
        familyMap.put("Rita", new ArrayList<>());
        familyMap.put("Miguel", new ArrayList<>());
        
        familyMap.forEach((k, v) -> System.out.println("Key:" + k + "  " + "      Number of Children : " + 
        v.size() + "    " + "Children : " + v));
    
        String descendant = retrieveName("descendant");
        String descendantCopy = descendant;
        String ancestor = retrieveName("ancestor");
        String ancestorCopy = ancestor;
        
        LinkedList<String> names = new LinkedList<>();
        names.addLast(descendant);
        if (familyMap.keySet().contains(descendant) || familyMap.keySet().contains(ancestor)) {
        // Keep turning
            while (!names.contains(ancestor)){
                for (Map.Entry<String, List<String>> entry : familyMap.entrySet()) {
                    if (entry.getValue().contains(descendant)) {
                        names.addFirst(entry.getKey());
                        descendant = entry.getKey();   // change descendant to new Key
                    }
                }
                
                if (familyMap.get(ancestor).isEmpty()) {
                    System.out.println("No " + descendantCopy + " is not a descendant of " + ancestorCopy);
                    break;
                }
            }
                   

            System.out.println(names);  
            if (names.getLast().equals(descendantCopy) && names.getFirst().equals(ancestorCopy))
                System.out.println("Yes " + descendantCopy + " is a descendant of " + ancestorCopy);
            else 
                System.out.println("No " + descendantCopy + " is not a descendant of " + ancestorCopy);
        }
        else {
            System.out.println("Descendant" + descendant + "and" + "Ancestor" + ancestor + "not in this family");
            return;
        }
    }
}