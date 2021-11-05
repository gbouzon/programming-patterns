/** MIT License Copyright (c) 2021 Chilka Castro, Giuliana Bouzon

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

package q1;

/**
* Class defines Client objects.
* @author Chilka Castro & Giuliana Bouzon
*/
public class Client {
    
    //properties
    private String name;
    private String address;
    private Contact contact;
    
    //default constructor
    public Client() {
	this("noName", "noAddress", new Contact());
    }

    //parameterized constructor
    public Client(String name, String address, Contact contact) {
        this.name = (name != null && !name.isEmpty()) ? name : "noName";
        this.address = (address != null && !address.isEmpty()) ? address : "noAddress";
        this.contact = new Contact(contact);
    }
    
    //copy constructor
    public Client(Client client) {
	this(client.name, client.address, client.contact);
    }

    @Override
    public String toString() {
        String str = "";

        str += String.format("%-15s : %s\n", "Name", name);
        str += String.format("%-15s : %s\n", "Address", address);
        str += String.format("%-15s : %s\n", "Phone number", contact.getPhoneNum());
        str += String.format("%-15s : %s\n", "Email address ", contact.getEmail());
        
        return str;
    }

    //getters and setters
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
	if (name != null && !name.isEmpty())
	    this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
	if (address != null && !address.isEmpty())
	    this.address = address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
	contact.setEmail(contact.getEmail());
        contact.setPhoneNum(contact.getPhoneNum());
    }
}