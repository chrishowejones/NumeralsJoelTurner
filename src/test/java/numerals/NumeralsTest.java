package numerals;

import numerals.Numerals;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by chrishowe-jones on 03/11/2014.
 */
public class NumeralsTest {

    @Test
    public void test1() {
        assertEquals("I", Numerals.getNumeral(1));
    }

    @Test
    public void test2() {
        assertEquals("II", Numerals.getNumeral(2));
    }

    @Test
    public void test3() {
        assertEquals("III", Numerals.getNumeral(3));
    }

    @Test
     public void test4() {
        assertEquals("IV", Numerals.getNumeral(4));
    }

    @Test
    public void test5() {
        assertEquals("V", Numerals.getNumeral(5));
    }

    @Test
    public void test6() {
        assertEquals("VI", Numerals.getNumeral(6));
    }

    @Test
    public void test8() {
        assertEquals("VIII", Numerals.getNumeral(8));
    }

    @Test
    public void test9() {
        assertEquals("IX", Numerals.getNumeral(9));
    }

    @Test
    public void test10() {
        assertEquals("X", Numerals.getNumeral(10));
    }

    @Test
    public void test11() {
        assertEquals("XI", Numerals.getNumeral(11));
    }

    @Test
    public void test14() {
        assertEquals("XIV", Numerals.getNumeral(14));
    }

    @Test
    public void test19() {
        assertEquals("XIX", Numerals.getNumeral(19));
    }

    @Test
    public void test20() {
        assertEquals("XX", Numerals.getNumeral(20));
    }

    @Test
    public void test25() {
        assertEquals("XXV", Numerals.getNumeral(25));
    }

    @Test
    public void test39() {
        assertEquals("XXXIX", Numerals.getNumeral(39));
    }

    @Test
    public void test40() {
        assertEquals("XL", Numerals.getNumeral(40));
    }

    @Test
    public void test44() {
        assertEquals("XLIV", Numerals.getNumeral(44));
    }

    @Test
    public void test49() {
        assertEquals("XLIX", Numerals.getNumeral(49));
    }

    @Test
    public void test50() {
        assertEquals("L", Numerals.getNumeral(50));
    }

    @Test
    public void test90() {
        assertEquals("XC", Numerals.getNumeral(90));
    }

    @Test
    public void test100() {
        assertEquals("C", Numerals.getNumeral(100));
    }

    @Test
    public void test400() {
        assertEquals("CD", Numerals.getNumeral(400));
    }

    @Test
    public void test500() {
        assertEquals("D", Numerals.getNumeral(500));
    }

    @Test
    public void test900() {
        assertEquals("CM", Numerals.getNumeral(900));
    }

    @Test
    public void test1000() {
        assertEquals("M", Numerals.getNumeral(1000));
    }
}
