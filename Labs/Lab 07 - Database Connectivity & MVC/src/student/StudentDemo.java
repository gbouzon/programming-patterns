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

import java.util.ArrayList;
import java.util.Arrays;

/**
*
* @author Giuliana Bouzon
*/
public class StudentDemo {
    
    public static ArrayList<Student> retrieveData() {
	Student[] arr = {new Student(456, "Shawn", "address1"), new Student(200, "Perry", "address1"),
		new Student(8349, "Ronald", "address1"), new Student(453, "Ahmed", "address1")};
	
	return new ArrayList<>(Arrays.asList(arr));
    }
    
    public static void main(String[] args) throws Exception {
	System.out.println("");
	ArrayList<Student> model = retrieveData(); 
	DatabaseView view = new DatabaseView();
	
	DatabaseController controller = new DatabaseController(model, view);
	controller.createTable();
	controller.addStudent(new Student(1923, "Erin", "address"));
	controller.updateView(controller.getAllStudents());
	
	
	for (Student student : model)
	    controller.addStudent(student);
	
	controller.updateView(controller.getAllStudents());
	
	controller.updateViewStudent(controller.getStudent(200));
	
    }
}