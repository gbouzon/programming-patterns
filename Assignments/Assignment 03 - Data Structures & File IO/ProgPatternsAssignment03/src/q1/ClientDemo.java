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

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
* Application class to test Assignment 03, Q1
* @author Chilka Castro & Giuliana Bouzon
*/
public class ClientDemo {

    public static void main(String[] args) {
	//creating map
	Map<Contact, Client> clientsMap = new HashMap<>();
	
	//creating client objects
        Client c1 = new Client("Karl Anderson", "1999 Netherland", new Contact("200089065",
                "anderson@gmail.com"));
        Client c2 = new Client("Libby Hodges", "3723 Merivale Road", new Contact("599086457",
                "libbyhodges@gmail.com"));
        Client c3 = new Client("Sidrah Winters", "4270 Parkdale Avenue", new Contact("099985016",
                "sidwinters@gmail.com"));
        Client c4 = new Client("Marlon Osborne", "2577 Fallon Drive", new Contact("75751436785",
                "mosborne@gmail.com"));
        Client c5 = new Client("Peppa Pig", "2087 Robson St", new Contact("75751436785",
                "mosborne@gmail.com"));
        Client c6 = new Client("AA", "203 Robson St", new Contact("10012836785",
                "zoddasd@gmail.com"));

        //adding clients to map
        clientsMap.put(c1.getContact(), c1);
        clientsMap.put(c2.getContact(), c2);
        clientsMap.put(c3.getContact(), c3);
        clientsMap.put(c4.getContact(), c4);
        clientsMap.put(c5.getContact(), c5);
        clientsMap.put(c6.getContact(), c6);

        System.out.println("\tUNSORTED PHONE NUMBER KEYS");
        clientsMap.forEach((k, v) -> System.out.println(k + "" + v));
        
        System.out.println("\n\n\tSORTED PHONE NUMBER KEYS");
        Map<Contact, Client> sortedClientMap = new TreeMap<>(clientsMap);
        sortedClientMap.forEach((k, v) -> System.out.println(k + "" + v));
    }
}