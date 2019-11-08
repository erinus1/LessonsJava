package MavenTask2;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class Main {

    @Test
    public static void main(String[] args) {
        Equation equation = new Equation();
        equation.calculate(4,0,-2); //res = -0.7071067811865476 and 0.7071067811865476


    }
}