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

/**
* A Student class defining Student objects.
* Answers questions from Part2 of assignment0.docx
* @author Giuliana Bouzon
*/
public class Student {
    
    //properties
    private String name;
    private double score;
    
    //default constructor
    public Student() {
	this("noName", 0.0);
    }
    
    //parameterized constructor
    public Student(String name, double score) {
	this.name = (name != null && !name.isEmpty()) ? name : "noName";
	this.score = (score >= 0) ? score : 0;
    }
    
    //copy constructor
    public Student(Student student) {
	this(student.name, student.score);
    }

    @Override
    public String toString() {
	String str = "";
	
	str += String.format("%-10s: %s \n", "Name:", this.name);
	str += String.format("%-10s: %s \n", "Score:", this.score);
	
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
    
    public double getScore() {
	return this.score;
    }
    
    public void setScore(double score) {
	if (score > 0)
	    this.score = score;
    }
}