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

import java.util.Objects;

/**
*
* @author Giuliana Bouzon
*/
public class InternationalDivision extends Division {
    
    //properties
    private String country;
    private String language;
    
    //default constructor
    public InternationalDivision() {
	this("noName", 0, "noCountry", "noLanguage");
    }
    
    //parameterized constructor
    public InternationalDivision(String name, int accountNumber, String country, String language) {
	super(name, accountNumber);
	this.country = (country != null && !country.isEmpty()) ? country : "noCountry";
	this.language = (language != null && !language.isEmpty()) ? language : "noLanguage";
    }
    
    //copy constructor
    public InternationalDivision(InternationalDivision division) {
	this(division.name, division.accountNumber, division.country, division.language);
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + Objects.hash(country, language);
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (!super.equals(obj))
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	InternationalDivision other = (InternationalDivision) obj;
	return Objects.equals(country, other.country) && Objects.equals(language, other.language);
    }
    
    @Override
    public String toString() {
	String str = "";
	
	str += "International Division\n";
	str += super.toString();
	str += String.format("%-10s: %s\n", "Country", this.country);
	str += String.format("%-10s: %s\n", "Language", this.language);
	
	return str;
    }
    
    //getters and setters
    
    public String getCountry() {
	return this.country;
    }
    
    public void setCountry(String country) {
	if (country != null && !country.isEmpty())
	    this.country = country;
    }
    
    public String getLanguage() {
	return this.language;
    }
    
    public void setLanguage(String language) {
	if (language != null && !language.isEmpty())
	    this.language = language;
    }
}