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

package company;

/**
*
* @author Giuliana Bouzon
*/

class Data {
    
    //properties
    private String fName;
    private String lName;
    private String name;
    private String address;
    
    //default constructor
    public Data() {
	this("noFName", "noLName", "noAddress");
    }
    
    //parameterized constructor
    public Data(String fName, String lName, String address) {
	this.fName = (fName != null && !fName.isEmpty()) ? fName : "noFName";
	this.lName = (lName != null && !lName.isEmpty()) ? lName : "noLName";
	this.name = this.fName + " " + this.lName;
	this.address = (address != null && !address.isEmpty()) ? address : "noAddress";
    }
    
    //copy constructor
    public Data(Data data) {
	this(data.fName, data.lName, data.address);
    }
    
    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((fName == null) ? 0 : fName.hashCode());
	result = prime * result + ((lName == null) ? 0 : lName.hashCode());
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
	Data other = (Data) obj;
	if (fName == null) {
	    if (other.fName != null)
		return false;
	} else if (!fName.equals(other.fName))
	    return false;
	if (lName == null) {
	    if (other.lName != null)
		return false;
	} else if (!lName.equals(other.lName))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return String.format("%s: %s", this.name, this.address);
    }
    
    //getters
    
    public String getName() {
	return this.name;
    }
    
    public String getAddress() {
	return this.address;
    }
}

public class Client {

    //properties
    private int id;
    private Data data;
    
    //constructor
    public Client() {
	this(0, new Data());
    }
    
    //parameterized constructor
    public Client(int id, Data data) {
	this.id = (id > 0) ? id : 0;
	this.data = (data != null) ? new Data(data) : new Data();
    }
    
    //copy constructor
    public Client(Client client) {
	this(client.id, client.data);
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((data == null) ? 0 : data.hashCode());
	result = prime * result + id;
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
	Client other = (Client) obj;
	if (data == null) {
	    if (other.data != null)
		return false;
	} else if (!data.equals(other.data))
	    return false;
	if (id != other.id)
	    return false;
	return true;
    }
    
    @Override
    public String toString() {
	return String.format("ID: %d for %s", this.id, this.data.toString());
    }

    //getters
    
    public int getId() {
        return this.id;
    }

    public Data getData() {
        return new Data(this.data);
    }  
}