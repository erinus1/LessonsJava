package JUnit_5_1;

import org.junit.Test;

import static org.junit.Assert.*;

public class EncodeTest {

    @Test
    public void compress() {
        Encode encode = new Encode();
        encode.compress("Test 1 "+"AaaaBB\\\\2");
        encode.compress("Test 2 "+"AaaaBB2");


    }
}