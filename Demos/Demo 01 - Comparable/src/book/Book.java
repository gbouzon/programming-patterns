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

package book;

/**
 * A simple Book class defining book objects.
 * @author Giuliana Bouzon
 */
public class Book implements Comparable<Book> {
    
    //properties
    private String title;
    private String author;
    
    //default constructor
    public Book(){
        this("Programming Patterns", "Daniel Liang");
    }
    
    //parameterized constructor
    public Book(String title, String author) {
        setTitle(title);
        setAuthor(author);
    }

    @Override
    public String toString() {
        String str = "";
        
        str += String.format("%-10s: %s\n", "Title", this.title);
        str += String.format("%-10s: %s\n", "Author", this.author);
        
        return str;
    }
   
    @Override
    public int compareTo(Book t) {
        return this.title.compareTo(t.title);
    }

    // getters and setters
    
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = (!title.isEmpty()) ? title : "noTitle";
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {    
        this.author = (!author.isEmpty()) ? author : "noAuthor";
    }  
}
