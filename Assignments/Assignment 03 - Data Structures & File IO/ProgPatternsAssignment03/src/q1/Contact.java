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

import java.util.Objects;

/**
*
* @author Chilka Castro & Giuliana Bouzon
*/
class Contact implements Comparable<Contact> {
    
    //properties
    private String phoneNum;
    private String email;

    //default constructor
    public Contact() {
	this("noPhoneNumber", "noEmail");
    }
    
    //parameterized constructor
    public Contact(String phoneNum, String email) {
        this.phoneNum = (phoneNum != null && !phoneNum.isEmpty()) ? phoneNum : "noPhoneNumber";
        this.email = (email != null && !email.isEmpty()) ? email : "noEmail";
    }
    
    //copy constructor
    public Contact(Contact contact) {
	this(contact.phoneNum, contact.email);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.phoneNum);
        hash = 17 * hash + Objects.hashCode(this.email);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Contact other = (Contact) obj;
        if (!Objects.equals(this.phoneNum, other.phoneNum))
            return false;
        if (!Objects.equals(this.email, other.email))
            return false;
        return true;
    }
    
    @Override
    public int compareTo(Contact contact) {
       return this.phoneNum.compareTo(contact.phoneNum);
    }
    
    @Override
    public String toString() {
        return String.format("%-15s : %s, %s\n", "Keys", phoneNum, email);
    }

    //getters and setters 
    
    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
	if (phoneNum != null && !phoneNum.isEmpty())
	    this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
	if (email != null && !email.isEmpty())
	    this.email = email;
    }
}