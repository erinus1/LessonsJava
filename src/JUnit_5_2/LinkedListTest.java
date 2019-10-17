package JUnit_5_2;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class LinkedListTest {

    LinkedList<String> name = new LinkedList<>();
    LinkedList<Integer> years = new LinkedList<>();

    LinkedList<String> name1 = new LinkedList<>();
    LinkedList<Integer> years1 = new LinkedList<>();

    @Test
    public void add() {

        name.add("Ivan");
        name.add("Petr");
        name.add("Olena");
        name.add("Nickolay");

        name1.add("Ivan");
        name1.add("Petr");
        name1.add("Olena");
        name1.add("Nickolay");

        assertEquals(name, name1);

        years.add(26);
        years.add(42);

        years1.add(26);
        years1.add(42);

        assertEquals(years, years1);

    }

    @Test
    public void get() {
        years.add(22);
        years1.add(26);

        years.get(0);
        years1.get(0);

        assertNotEquals(years, years1);

    }

    @Test
    public void remove() {

        name.add("Olena");
        name.add("Nickolay");

        name1.add("Olena");
        name1.add("Nickolay");

        name.remove(1);
        name1.remove(1);

        assertEquals(name, name1);
    }

}