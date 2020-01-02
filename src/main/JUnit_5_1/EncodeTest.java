package main.JUnit_5_1;

import org.junit.Test;

import static org.junit.Assert.*;

public class EncodeTest {

    @Test
    public void compress() {
        Encode encode = new Encode();

        String res = "1a1d1s\\21d1f1q\\3";
       assertEquals(res, encode.compress("ads2dfq3"));

       String res2 = "1a1w1e1r\\2\\11s1d\\\\";
       assertEquals(res2, encode.compress("awer21sd\\"));

        String res3 = "1S1d1c1s2A";
        assertEquals(res3, encode.compress("SdcsAA"));

    }
}