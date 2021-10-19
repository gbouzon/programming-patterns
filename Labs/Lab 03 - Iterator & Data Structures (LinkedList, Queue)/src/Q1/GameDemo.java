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

package Q1;

/**
*
* @author Giuliana Bouzon
*/
public class GameDemo {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	GameList topTen = new GameList();
        topTen.insert("Whiz", 105);
        topTen.insert("G-Man", 99);
        topTen.insert("JediMaster", 95);
        topTen.insert("Spike", 120);
        topTen.insert("CoolWhip", 500);
        topTen.insert("Tutu", 425);
        topTen.insert("Dragonslippers", 230);
        topTen.insert("Zerfiz", 178);
        topTen.insert("Bartolomew", 36);
        topTen.insert("Lilo", 784);
        
        topTen.insert("Afonz", 100);
        topTen.insert("Semi-colon", 765);
        topTen.insert("Mer", 1000);
        
        System.out.println(topTen.getList().toString());
    }
}