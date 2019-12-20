package test.java.jar;

import Selenium_9Module.FirstTest.FaceBook;
import main.java.MavenTask2.Equation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

public class EquationTest {
    @Test
    public void calculate() {
        Equation equation = new Equation();
        ArrayList<Double> test1 = equation.calculate(4, 0, -2);

        final Logger logger = LogManager.getLogger(EquationTest.class);

        assertEquals(test1.size(), 2);
        assertEquals(test1.get(0).toString(), String.valueOf(-0.7071067811865476));
        assertEquals(test1.get(1).toString(), String.valueOf(0.7071067811865476));

        ArrayList<Double> test2 = equation.calculate(1, 2, 1);

        assertEquals(test2.size(), 1);
        assertEquals(test2.get(0).toString(), String.valueOf(-1.0));

    }
}
