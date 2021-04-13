package p1;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author Juan Carlos
 */
public class CirculoTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    //Caso de uso r=1
    @Test
    public void mainTestInput1() {
        String input = "1\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        Circulo.main(args);
        //(expected) output
        String consoleOutput = "Introduzca el radio: " + System.getProperty("line.separator");
        consoleOutput += "Circulo con radio 1.0," + System.getProperty("line.separator");
        consoleOutput += " la circunferencia es 6.283185307179586" + System.getProperty("line.separator");
        consoleOutput += " y el area es 3.141592653589793." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());
    }
    //Caso de uso r=3

    @Test
    public void mainTestInput3() {
        String input = "3\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        Circulo.main(args);
        //(expected) output
        String consoleOutput = "Introduzca el radio: " + System.getProperty("line.separator");
        consoleOutput += "Circulo con radio 3.0," + System.getProperty("line.separator");
        consoleOutput += " la circunferencia es 18.84955592153876" + System.getProperty("line.separator");
        consoleOutput += " y el area es 28.274333882308138." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());
    }

    //Caso de uso r=5
    @Test
    public void mainTestInput5() {
        String input = "5\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        Circulo.main(args);
        //(expected) output
        String consoleOutput = "Introduzca el radio: " + System.getProperty("line.separator");
        consoleOutput += "Circulo con radio 5.0," + System.getProperty("line.separator");
        consoleOutput += " la circunferencia es 31.41592653589793" + System.getProperty("line.separator");
        consoleOutput += " y el area es 78.53981633974483." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());
    }

    //Caso de uso r=-1
    @Test
    public void mainTestInput0() {
        String input = "0\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        Circulo.main(args);
        //(expected) output
        String consoleOutput = "Introduzca el radio: " + System.getProperty("line.separator");
        consoleOutput += "error" + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());
    }

    //Caso de uso r="abc"
    @Test
    public void mainTestInputABC() {
        String input = "abc\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        Circulo.main(args);
        //(expected) output
        String consoleOutput = "Introduzca el radio: " + System.getProperty("line.separator");
        consoleOutput += "error" + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());
    }

    /**
     * Test of main method, of class Circulo.
     */
    /*
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Circulo.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of area method, of class Circulo.
     *//*
    @Test
    public void testArea() {
        System.out.println("area");
        double r = 0.0;
        Circulo instance = new Circulo();
        double expResult = 0.0;
        double result = instance.area(r);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    /**
     * Test of circunferencia method, of class Circulo.
     *//*
    @Test
    public void testCircunferencia() {
        System.out.println("circunferencia");
        double r = 0.0;
        Circulo instance = new Circulo();
        double expResult = 0.0;
        double result = instance.circunferencia(r);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
}
