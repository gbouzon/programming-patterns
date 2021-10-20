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

package instructor;

import java.util.Objects;

/**
* A simple Instructor class defining Instructor objects.
* Class based on Programming Patterns' lab 3, Q3 (Data Structures - HashSet).
* @author Giuliana Bouzon
*/
public class Instructor {
    
    //properties
    private String fname;
    private String lname;
    private int office;
    
    //default constructor
    public Instructor() {
	this("noFname", "noLname", 0);
    }
    
    //parameterized constructor
    public Instructor(String fname, String lname, int office) {
	this.fname = (fname != null && !fname.isEmpty()) ? fname : "noFName";
	this.lname = (lname != null && !lname.isEmpty()) ? lname : "noLName";
	this.office = (office > 0) ? office : 0;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((fname == null) ? 0 : fname.hashCode());
	result = prime * result + ((lname == null) ? 0 : lname.hashCode());
	result = prime * result;
	return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) 
            return true;
        if (obj == null) 
            return false;
        if (getClass() != obj.getClass()) 
            return false;
        final Instructor other = (Instructor) obj;
        if (!Objects.equals(this.lname, other.lname)) 
            return false;
        if (!Objects.equals(this.fname, other.fname)) 
            return false;
        return true;
    }
    
    @Override
    public String toString() {
	return String.format("%s %s: %d", this.fname, this.lname, this.office);
    }
}