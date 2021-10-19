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

package myset;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
*
* @author Giuliana Bouzon
*/
class MySetTest {
    
    public MySetTest() {}
    
    @BeforeAll
    public static void setUpClass() {}
    
    @AfterAll
    public static void tearDownClass() {}
    
    @BeforeEach
    public void setUp() {}
    
    @AfterEach
    public void tearDown() {}
    
    /**
     * Test of add method, of class MySet.
     */
    @Test
    public void testAddE() {
        Object element = 3;
        MySet set = new MySet();
        boolean expResult = true;
        boolean result = set.add(element);
        assertEquals(expResult, result);
    }

    /**
     * Test of remove method, of class MySet.
     */
    @Test
    public void testRemoveE() {
        Object element = 13;
        MySet set = new MySet();
        set.add(1);
        set.add(2);
        set.add(3);
        boolean expResult = false;
        boolean result = set.remove(element);
        assertEquals(expResult, result);
    }

    /**
     * Test of union method, of class MySet.
     */
    @Test
    public void testUnion() {
        Integer[] arr1 = {1, 2, 3, 4, 5};
        Integer[] arr2 = {1, 3, 5, 7, 9};
        MySet instance = new MySet(arr1);
        MySet otherSet = new MySet(arr2);
        Integer expResult = 1;
        MySet result = instance.union(otherSet);
        assertEquals(expResult, result.get(0));
    }

    /**
     * Test of intersection method, of class MySet.
     */
    @Test
    public void testIntersection() {
        Integer[] arr1 = {4, 5, 6};
        Integer[] arr2 = {2, 3, 4};
        MySet set1 = new MySet(arr1);
        MySet set2 = new MySet(arr2);
        Integer expResult = 4;
        MySet result = set1.intersection(set2);
        assertEquals(expResult, result.get(0));
    }

    /**
     * Test of difference method, of class MySet.
     */
    @Test
    public void testDifference() {
        Integer[] arr1 = {4, 5, 6};
        Integer[] arr2 = {4, 5, 6, 10};
        MySet set1 = new MySet(arr1);
        MySet set2 = new MySet(arr2);
        Integer expResult = 10;
        MySet result = set1.difference(set2);
        assertEquals(expResult, result.get(0));
    }

    /**
     * Test of clear method, of class MySet.
     */
    @Test
    public void testClear() {
        MySet set = new MySet();
        set.add(1);
        set.add(2);
        set.clear();
        boolean result = set.isEmpty();
        boolean expResult = true;
        assertEquals(expResult, result);
    }

    /**
     * Test of isEmpty method, of class MySet.
     */
    @Test
    public void testIsEmpty() {
        MySet set = new MySet();
        set.add(1);
        boolean expResult = false;
        boolean result = set.isEmpty();
        assertEquals(expResult, result);
    }

    /**
     * Test of contains method, of class MySet.
     */
    @Test
    public void testContains() {
        Object object = "Hello";
        MySet set = new MySet();
        set.add("World");
        set.add("Hello");
        boolean expResult = true;
        boolean result = set.contains(object);
        assertEquals(expResult, result);
    }

    /**
     * Test of indexOf method, of class MySet.
     */
    @Test
    public void testIndexOf() {
        Object object = 13;
        MySet set = new MySet();
        set.add(1);
        int expResult = -1;
        int result = set.indexOf(object);
        assertEquals(expResult, result);
    }

    /**
     * Test of get method, of class MySet.
     */
    @Test
    public void testGet() {
        int index = 2;
        MySet set = new MySet();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        Object expResult = 3;
        Object result = set.get(index);
        assertEquals(expResult, result);
    }

    /**
     * Test of set method, of class MySet.
     */
    @Test
    public void testSet() {
        Object object = 4;
        int index = 0;
        MySet set = new MySet();
        set.add(2);
        set.add(5);
        set.set(object, index);
        int expResult = 4;
        Object result = set.get(index);
        assertEquals(expResult, result);
    }

    /**
     * Test of size method, of class MySet.
     */
    @Test
    public void testSize() {
        MySet set = new MySet();
        int expResult = 0;
        int result = set.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class MySet.
     */
    @Test
    public void testAddIndex() {
        int index = 13;
        Object object = 1864;
        MySet set = new MySet();
        set.add(index, object);
    }

    /**
     * Test of remove method, of class MySet.
     */
    @Test
    public void testRemoveIndex() {
        int index = 0;
        MySet set = new MySet();
        set.add(230);
        Object expResult = 230;
        Object result = set.remove(index);
        assertEquals(expResult, result);
    }
}
