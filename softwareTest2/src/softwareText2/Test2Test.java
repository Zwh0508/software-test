package softwareText2;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Test2Test {
	ByteArrayOutputStream out;
    PrintStream ps;
    public Test2 primes = new Test2();
    int[] print = {2, 3, 5};

   

    @Before
    public void setUp(){
        out = new ByteArrayOutputStream();
        ps = new PrintStream(out);
        System.setOut(ps);
    }
    
    @Test
    public void test() throws IOException {
        out.flush();
        primes.printPrimes(3);
        assertEquals("Prime: 2\r\nPrime: 3\r\nPrime: 5\r\n", out.toString());
    }
}