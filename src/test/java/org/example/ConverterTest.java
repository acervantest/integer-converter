package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    @Test
    void convertOneToOctal() {
        Converter c = new Converter();
        assertEquals("1", c.itoa(1,8));
    }

    @Test
    void convertHundredTwentySevenToOctal() {
        Converter c = new Converter();
        assertEquals("177", c.itoa(127,8));
    }

    @Test
    void convertSevenTeenToOctal() {
        Converter c = new Converter();
        assertEquals("21", c.itoa(17,8));
    }

    @Test
    void convertFiveToDec() {
        Converter c = new Converter();
        assertEquals("5.0", c.itoa(5,10));
    }

    @Test
    void convertFiftyThreeToDec() {
        Converter c = new Converter();
        assertEquals("53.0", c.itoa(53,10));
    }

    @Test
    void convertHundredThirtyToDec() {
        Converter c = new Converter();
        assertEquals("130.0", c.itoa(130,10));
    }

    @Test
    void convertThreeHundredToDec() {
        Converter c = new Converter();
        assertEquals("300.0", c.itoa(300,10));
    }

    @Test
    void convertTwoThousandThreeHundredToDec() {
        Converter c = new Converter();
        assertEquals("2300.0", c.itoa(2300,10));
    }
    @Test
    void convertFiveToHex(){
        Converter c = new Converter();
        assertEquals("5", c.itoa(5,16));
    }

    @Test
    void convertThirteenToHex(){
        Converter c = new Converter();
        assertEquals("d", c.itoa(13,16));
    }
    @Test
    void convertEighteenToHex(){
        Converter c = new Converter();
        assertEquals("12", c.itoa(18,16));
    }

    @Test
    void convertTwentyThreeToHex(){
        Converter c = new Converter();
        assertEquals("17", c.itoa(23,16));
    }
    @Test
    void convertThirtyToHex(){
        Converter c = new Converter();
        assertEquals("1e", c.itoa(30,16));
    }

    @Test
    void convertFortyTwoToHex(){
        Converter c = new Converter();
        assertEquals("2a", c.itoa(42,16));
    }

    @Test
    void convertTwentySevenToHex(){
        Converter c = new Converter();
        assertEquals("1b", c.itoa(27,16));
    }

    @Test
    void convertTwentyEightToHex(){
        Converter c = new Converter();
        assertEquals("1c", c.itoa(28,16));
    }

    @Test
    void convertFortyFiveToHex(){
        Converter c = new Converter();
        assertEquals("2d", c.itoa(45,16));
    }

    @Test
    void convertFifteenToHex(){
        Converter c = new Converter();
        assertEquals("f", c.itoa(15,16));
    }

    @Test
    void negativeOneShouldReturnIllegalArgumentException(){
        Converter c = new Converter();
        assertThrows(IllegalArgumentException.class, () -> c.itoa(-1,8) );
    }

    @Test
    void invalidBaseShouldReturnIllegalArgumentException(){
        Converter c = new Converter();
        assertThrows(IllegalArgumentException.class, () -> c.itoa(15,2) );
    }
}