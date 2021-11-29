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

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
*
* @author Giuliana Bouzon
*/
public class DatabaseController {
    
    //properties
    private ArrayList<Student> model;
    private DatabaseView view;
    private Connection connection;
    
    public DatabaseController(ArrayList<Student> model, DatabaseView view) throws Exception {
	this.model = model;
	this.view = view;
	this.connection = DatabaseConnection.getSingleInstance();
    }
    
    //creates student table
    public void createTable() throws Exception {
	String query = "CREATE TABLE STUDENT \n"
                + "(studentId INT PRIMARY KEY     NOT NULL,\n"
                + " Name          TEXT    NOT NULL,\n"
                + " Address       TEXT    NOT NULL)";
	
        Statement st = connection.createStatement();
        st.executeUpdate("DROP table if exists STUDENT");
        st.executeUpdate(query);
        System.out.println("Table Student successfully created.");
    }
    
    public Student getStudent(int studentId) throws Exception {
	int id = 0;
	String name = "";
	String address = "";
	
	String query = "SELECT * FROM STUDENT WHERE studentId = " + studentId + ";";
	
	Statement st = connection.createStatement();
	ResultSet rs = st.executeQuery(query);
	
	while (rs.next()) {
	    id = rs.getInt("studentId");
	    name = rs.getString("Name");
	    address = rs.getString("Address");
	    
	}
	return new Student(id, name, address);
    }
    
    public Map getAllStudents() throws Exception {
	Map<Integer, String> map = new HashMap<>();
	String query = "SELECT * FROM STUDENT";
	Statement st = connection.createStatement();
	ResultSet rs = st.executeQuery(query);
	
	while(rs.next())
	    map.put(rs.getInt("studentId"), " Student name: " + rs.getString("Name") + 
		    ", Student address: " + rs.getString("Address"));
	return map;
    }
    
    public void addStudent(Student student) throws Exception {
	String query = "INSERT into Student(studentId, Name, Address)" +
		"VALUES (" + student.getStudentId() + ", \"" + 
		student.getName() + "\", \"" + student.getAddress() + "\");";
	
	Statement st = connection.createStatement();
	st.executeUpdate(query);
    }
    
    public void deleteStudent(int studentId) {
	String query = "DELETE FROM STUDENT WHERE STUDENTID = " + studentId + ";";
	
	Statement st = connection.createStatement();
	st.executeUpdate(query);
    }
    
    public void updateView(Map map) {
	view.printTable(map);
    }
    
    public void updateViewStudent(Student student) {
	view.printStudent(student);
    }
}