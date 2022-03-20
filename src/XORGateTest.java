import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XORGateTest {

    @Test
    @DisplayName("Tests XOR gate output behaviour for all possible inputs")
    void xorBits() {
        XORGate xor = new XORGate(false, false);
        assertEquals(false, xor.isInput1());
        assertEquals(false, xor.isInput2());
        assertEquals(false, xor.isOutput());

        xor.setInput1(true);
        assertEquals(true, xor.isInput1());
        assertEquals(false, xor.isInput2());
        assertEquals(true, xor.isOutput());

        xor.setInput1(false);
        xor.setInput2(true);
        assertEquals(false, xor.isInput1());
        assertEquals(true, xor.isInput2());
        assertEquals(true, xor.isOutput());

        xor.setInput1(true);
        xor.setInput2(true);
        assertEquals(true, xor.isInput1());
        assertEquals(true, xor.isInput2());
        assertEquals(false, xor.isOutput());
    }
}