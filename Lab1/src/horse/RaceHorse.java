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

package horse;

/**
 * A simple RaceHorce class defining RaceHorse objects.
 * @author Giuliana Bouzon
 */
public class RaceHorse extends Horse {
    //properties
    private int noOfRaces;
    
    //constructor
    public RaceHorse(String name, String colour, int birthYear, int noOfRaces) {
        super(name, colour, birthYear);
        this.noOfRaces = (noOfRaces >= 0) ? noOfRaces : 0;
    }

    @Override
    public String toString() {
        String str = "";
        
        str += String.format("%s: \n", "Racehorse"); 
        str += super.toString();
        str += String.format("%-10s: %d \n", "Number of Races", this.noOfRaces);
        
        return str;
    }
    
    //getter and setter

    public int getNoOfRaces() {
        return this.noOfRaces;
    }

    public void setNoOfRaces(int noOfRaces) {
        if (noOfRaces >= 0)
            this.noOfRaces = noOfRaces;
    }  
}
