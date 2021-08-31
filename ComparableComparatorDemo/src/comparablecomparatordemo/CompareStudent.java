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

import java.util.Comparator;

/**
 * Comparing Student objects based on their properties.
 * Usually, one class per way of comparing but too lazy to create a gazillion classes.
 * @author Giuliana Bouzon
 */
public class CompareStudent implements Comparator <Student> {

    /*based on the idNumber (ascending)
    @Override
    public int compare(Student t, Student t1) {
        return (t.getIdNumber() - t1.getIdNumber());
    } 
    */
    
    /*
    //based on the name(alphabetically)
    @Override
    public int compare(Student t, Student t1) {
        return t.getName().compareTo(t1.getName());
    }
    */
    
    ///*
    //based on the gpa(descending)
    @Override
    public int compare(Student t, Student t1) {
        return Double.compare(t1.getGpa(), t.getGpa());
    }
    //*/

}
