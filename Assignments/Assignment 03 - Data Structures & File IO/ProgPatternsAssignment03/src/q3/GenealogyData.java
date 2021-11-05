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
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

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
     * Tokenizes line and populates map accordingly.
     * @param map, the input map.
     * @param line, the line to be parsed
     * @return the populated map.
     */
    private static Map<String, List<String>> parseLine(Map<String, List<String>> map, String line) {
		//line will be: name number {name * number}
		int descendantNb = 0;
		String ancestor = "";
		List<String> descendants = new ArrayList<>();
		Scanner strScan = new Scanner(line);
		
		while (strScan.hasNext()) {
		    ancestor = strScan.next().toLowerCase();
		    
		    if (strScan.hasNextInt()) {
			descendantNb = strScan.nextInt();
			
			for (int i = 0; i < descendantNb; i++)
			    descendants.add(strScan.next().toLowerCase());
			
			map.put(ancestor, descendants);
		    }
		}
		
		strScan.close();
		return map;
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
		Scanner input = new Scanner(new FileInputStream(file));
		
		//getting number of lines (aka size of map)
		if (input.hasNextInt()) 
		    nbLines = input.nextInt();
		
		for (int i = 0; i <= nbLines; i++) 
		    map = parseLine(map, input.nextLine());
		
		input.close();
		return map;
    }
    
    /**
     * Checks if descendant is really a descendant of ancestor
     * @param familyMap, the input map object
     * @param ancestor, the string value for the ancestor
     * @param descendant, the string value for the descendant
     */
    public static void isDescendant(Map<String, List<String>> familyMap, String ancestor, String descendant) {
		//case insensitivity
		ancestor = ancestor.toLowerCase();
		descendant = descendant.toLowerCase();
		
		String descendantCopy = descendant;
		String ancestorCopy = ancestor;
		LinkedList<String> names = new LinkedList<>();
        names.addLast(descendant);
        
        if (familyMap.keySet().contains(descendant) || familyMap.keySet().contains(ancestor)) {
        // Keep turning
            while (!names.contains(ancestor)) {
                for (Map.Entry<String, List<String>> entry : familyMap.entrySet()) {
                    if (entry.getValue().contains(descendant)) {
                        names.addFirst(entry.getKey());
                        descendant = entry.getKey();   // change descendant to new Key
                    }
                }
                try {
	                if (familyMap.get(ancestor).isEmpty()) {
	                	names.clear();
	                    System.out.println("No " + descendantCopy.substring(0, 1).toUpperCase() + 
	                    		descendantCopy.substring(1) + " is not a descendant of " + 
	                    		ancestorCopy.substring(0, 1).toUpperCase() + ancestorCopy.substring(1));
	                    break;
	                }
                }
                catch (Exception e) {
                	names.clear();
                	break;
                }
            }      
            try {
            	names.subList(0, names.size() - 1).forEach(e -> System.out.print(e + " ----> "));
                System.out.println(names.getLast());
                
                if (names.getLast().equalsIgnoreCase(descendantCopy) && names.getFirst().equalsIgnoreCase(ancestorCopy)) 
                    System.out.println(descendantCopy.substring(0, 1).toUpperCase() + 
                    		descendantCopy.substring(1) + " is a descendant of " + ancestorCopy.substring(0,
            				1).toUpperCase() + ancestorCopy.substring(1));
            }
            catch (Exception e) {
                System.out.println("Please put correct input");
            }
        }
        
        else {
            System.out.println("Descendant \'" + descendantCopy.substring(0, 1).toUpperCase() + 
            		descendantCopy.substring(1) + "\' and ancestor \'" + ancestorCopy.substring(0,
    				1).toUpperCase() + ancestorCopy.substring(1) + "\' are not in this family.");
            return;
        } 
    }

    public static void main(String[] args) {
    	//converted all names to lowercase to apply case insensitivity
    	//output however is not title case - check that later

    	//creating map
    	Map<String, List<String>> familyMap = new LinkedHashMap<>();
	
    	//populating map with info from file
    	try {
    		populateMap(familyMap);
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		}
	
    	//getting user input for descendant and ancestor
        String descendant = retrieveName("descendant");
        String ancestor = retrieveName("ancestor");
        
        isDescendant(familyMap, ancestor, descendant);   
        
        console.close();
    }
}