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

/**
 * A simple Student class defining Student objects.
 * Its only purpose is to demo Comparable and Comparator interface.
 * @author Giuliana Bouzon
 */
public class Student implements Comparable <Student> {
    //properties
    private int idNumber;
    private String name;
    private double gpa;
    
    //constructor
    public Student(int idNumber, String name, double gpa) {
      this.idNumber = idNumber;
      this.name = name;
      this.gpa = gpa; 
    }

    //getters and setters
    
    public double getGpa() { 
        return this.gpa;
    }
    
    public int getIdNumber(){
        return this.idNumber;
    }
    
    public String getName(){
        return this.name;
    }

    @Override
    public int compareTo(Student t) {
        return this.idNumber - t.idNumber;
    }
}
