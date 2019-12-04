package JUnit_5_1;

import Module6_2.Decode;
import org.junit.Test;
import static org.junit.Assert.*;

public class DecodeTest {

    @Test
    public void decompress() {
        Decode decode = new Decode();

        String res = "hhh";
        assertEquals(res, decode.decompress("3h"));

        String res1 = "AAAAaaaBBBBBB";
        assertEquals(res1, decode.decompress("4A3a6B" ));

        String res2 = "dddffff\\\\ggggg";
        assertEquals(res2, decode.decompress( "3d4f\\\\5g"));

    }
}