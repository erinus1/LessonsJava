package JUnit_5_1;

import Module6_2.Decode;
import org.junit.Test;

public class DecodeTest {

    @Test
    public void decompress() {
        Decode decode = new Decode();
        decode.decompress("Test 1: "+ "4A3a6B\\\\1\\2");
    }
}