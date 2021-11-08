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
 * A simple Horse class defining Horse objects.
 * @author Giuliana Bouzon
 */
public class Horse implements Comparable <Horse> {
    //properties
    private String name;
    private String colour;
    private int birthYear;
    
    //parameterized constructor
    public Horse(String name, String colour, int birthYear) {
        this.name = (name != null && !name.isEmpty()) ? name : "noName";
        this.colour = (colour != null && !colour.isEmpty()) ? colour : "noColour";
        this.birthYear = (birthYear > 0) ? birthYear : 0;
    }
    
    //from Comparable interface
    @Override
    public int compareTo(Horse t) {
        return (this.name.compareTo(t.name));
    }

    @Override
    public String toString() {
        String str = "";
        
        str += String.format("%-15s: %s \n", "Name", this.name);
        str += String.format("%-15s: %s \n", "Colour", this.colour);
        str += String.format("%-15s: %d \n", "Birth Year", this.birthYear);
        
        return str;
    }

    //getters and setters

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty())
            this.name = name;
    }

    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        if (colour != null && !colour.isEmpty())
            this.colour = colour;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public void setBirthYear(int birthYear) {
        if (birthYear > 0)
            this.birthYear = birthYear;
    }  
}
