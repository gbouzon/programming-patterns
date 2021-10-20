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

package patient;

import java.util.PriorityQueue;

/**
* Java Application class to demonstrate Patient and ComparePatient classes & Priority Queues.
* Based on Programming Patterns' lab 03 - Data Structures (Priority Queue).
* @author Giuliana Bouzon
*/
public class PatientDemo {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	PriorityQueue<Patient> patientQueue = new PriorityQueue<>(10,new ComparePatient());

	patientQueue.add(new Patient(1, "Patient1", false));
	patientQueue.add(new Patient(2, "Patient2", false));
	patientQueue.add(new Patient(3, "Patient3", true));
	patientQueue.add(new Patient(4, "Patient4", false));
	patientQueue.add(new Patient(5, "Patient5", true));

	PriorityQueue<Patient> patientQueue1 = new PriorityQueue<>(10,new ComparePatient());

	patientQueue1.add(new Patient(1, "Patient1", false));
	patientQueue1.add(new Patient(2, "Patient2", false));
	patientQueue1.add(new Patient(5, "Patient5", true));
	patientQueue1.add(new Patient(4, "Patient4", false));
	patientQueue1.add(new Patient(3, "Patient3", true));
	
	System.out.print("Doctor's waiting for patients: ");
	
	//the priority in a priority queue is only established when you start polling or removing objects
	while(!patientQueue.isEmpty())
	    System.out.print(patientQueue.poll() + " ");
	
	System.out.print("\nDoctor's waiting for patients: ");
	
	while(!patientQueue1.isEmpty())
	    System.out.print(patientQueue1.poll() + " ");
	
    }
}
