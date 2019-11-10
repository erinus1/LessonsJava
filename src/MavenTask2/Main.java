package MavenTask2;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class Main {

    @Test
    public static void main(String[] args) {
        Equation equation = new Equation();
         
        ArrayList<Double> test1 = equation.calculate(4,0,-2);

        assertEquals(test1.size(), 2);
        assertEquals(test1.get(0).toString(), String.valueOf(-0.7071067811865476));
        assertEquals(test1.get(1).toString(), String.valueOf(0.7071067811865476));

        ArrayList<Double> test2 = equation.calculate(1,2,1);

        assertEquals(test2.size(), 1);
        assertEquals(test2.get(0).toString(), String.valueOf(-1.0));
    }
}