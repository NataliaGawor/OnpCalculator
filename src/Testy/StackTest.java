package Testy;


import org.junit.Before;
import org.junit.Test;
import Onp.Stack;

import java.util.EmptyStackException;

import static org.junit.Assert.*;


public class StackTest {

    private Stack stack;
    private String e1 = "test1", e2 = "test2", e3 = "test3", nullEl = null;
    private int size = 30;

    @Before
    public void prepare(){
        stack = new Stack(size);
    }

    @Test
    public void testIsEmpty(){
        assertTrue("Stack should be empty!", stack.isEmpty());
        stack.push(e1);
        assertFalse("Stack should not be empty!", stack.isEmpty());
    }

    @Test(expected = EmptyStackException.class)
    public void testTopEmptyStack(){
        stack.top();
    }

    @Test(expected = EmptyStackException.class)
    public void testPopEmptyStack(){
        stack.pop();
    }

    @Test(expected = EmptyStackException.class)
    public void testForOneElementIn(){
        stack.push(e1);

        assertEquals("Test 1 : Not the same string value!", e1, stack.top());
        assertEquals("Test 2 : Not the same string value!", e1, stack.top());
        assertEquals("Test 3 : Not the same string value!", e1, stack.top());

        assertFalse("Stack should not be empty!", stack.isEmpty());
        assertSame("Not the same string object!", e1, stack.pop());
        assertTrue("Stack should be empty!", stack.isEmpty());

        //will throw an EmptyStackException
        stack.pop();
    }

    @Test(expected = EmptyStackException.class)
    public void testForTwoElementsIn(){
        stack.push(e1);
        stack.push(e2);
        stack.push(e3);

        assertFalse("Stack should not be empty!", stack.isEmpty());

        assertEquals("Test 1 for e3 object : Not the same string value!", e3, stack.top());
        assertEquals("Test 2 for e3 object : Not the same string value!", e3, stack.top());

        assertSame("Its not e3 string object!", e3, stack.pop());
        assertSame("Its not e2 string object!", e2, stack.pop());
        assertSame("Its not e1 string object!", e1, stack.pop());

        assertTrue("Stack should be empty!", stack.isEmpty());

        //will throw an EmptyStackException
        stack.pop();
    }

    @Test
    public void testForNullElement(){
        stack.push(nullEl);

        assertEquals("Not null!", nullEl, stack.top());
        assertSame("Not null object!", nullEl, stack.pop());
    }

    @Test
    public void testRunAfterException(){
        try{
            stack.pop();
            fail(); // if doesn't throw na exception then test failed
        }
        catch (EmptyStackException e){
            assertTrue("Stack should be empty!", stack.isEmpty());
            stack.push(e1);
            assertEquals("Not the same string value!", e1, stack.top());
            assertFalse("Stack should not be empty!", stack.isEmpty());
            assertSame("Not the same string object!", e1, stack.pop());
            assertTrue("Stack should be empty!", stack.isEmpty());
        }
    }
}
