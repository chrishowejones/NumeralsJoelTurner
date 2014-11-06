package numerals;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumbersTest {
	
	@Test
	public void textI() throws InvalidNumeralFormatException{
		assertEquals(1, Numerals.getNumber("I"));
	}
	
	@Test
	public void textII() throws InvalidNumeralFormatException{
		assertEquals(2, Numerals.getNumber("II"));
	}
	
	@Test
	public void textIII() throws InvalidNumeralFormatException{
		assertEquals(3, Numerals.getNumber("III"));
	}

	@Test
	public void textIV() throws InvalidNumeralFormatException{
		assertEquals(4, Numerals.getNumber("IV"));
	}
	
	@Test
	public void textV() throws InvalidNumeralFormatException{
		assertEquals(5, Numerals.getNumber("V"));
	}
	
	@Test
	public void textVI() throws InvalidNumeralFormatException{
		assertEquals(6, Numerals.getNumber("VI"));
	}
	
	@Test
	public void textVII() throws InvalidNumeralFormatException{
		assertEquals(7, Numerals.getNumber("VII"));
	}
	
	@Test
	public void textVIII() throws InvalidNumeralFormatException{
		assertEquals(8, Numerals.getNumber("VIII"));
	}
	
	@Test
	public void textIX() throws InvalidNumeralFormatException{
		assertEquals(9, Numerals.getNumber("IX"));
	}
	
	@Test
	public void textX() throws InvalidNumeralFormatException{
		assertEquals(10, Numerals.getNumber("X"));
	}
	
	@Test
	public void textXIX() throws InvalidNumeralFormatException{
		assertEquals(19, Numerals.getNumber("XIX"));
	}
	
	@Test
	public void textXXXIX() throws InvalidNumeralFormatException{
		assertEquals(39, Numerals.getNumber("XXXIX"));
	}
	
	@Test
	public void textXL() throws InvalidNumeralFormatException{
		assertEquals(40, Numerals.getNumber("XL"));
	}
	
	@Test
	public void textXLIX() throws InvalidNumeralFormatException{
		assertEquals(49, Numerals.getNumber("XLIX"));
	}
	
	@Test
	public void textL() throws InvalidNumeralFormatException{
		assertEquals(50, Numerals.getNumber("L"));
	}
	
	@Test
	public void textXC() throws InvalidNumeralFormatException{
		assertEquals(90, Numerals.getNumber("XC"));
	}
	
	@Test
	public void textC() throws InvalidNumeralFormatException{
		assertEquals(100, Numerals.getNumber("C"));
	}
	
	@Test
	public void textCD() throws InvalidNumeralFormatException{
		assertEquals(400, Numerals.getNumber("CD"));
	}
	
	@Test
	public void textD() throws InvalidNumeralFormatException{
		assertEquals(500, Numerals.getNumber("D"));
	}
	
	@Test
	public void textCM() throws InvalidNumeralFormatException{
		assertEquals(900, Numerals.getNumber("CM"));
	}
	
	@Test
	public void textM() throws InvalidNumeralFormatException{
		assertEquals(1000, Numerals.getNumber("M"));
	}
	
	@Test
	public void textMM() throws InvalidNumeralFormatException{
		assertEquals(2000, Numerals.getNumber("MM"));
	}
	
	@Test
	public void textMMM() throws InvalidNumeralFormatException{
		assertEquals(3000, Numerals.getNumber("MMM"));
	}
	
	@Test
	public void textMMMM() throws InvalidNumeralFormatException{
		assertEquals(4000, Numerals.getNumber("MMMM"));
	}
	
	@Test(expected = InvalidNumeralFormatException.class)
	public void textMMMMM() throws InvalidNumeralFormatException{
		assertEquals(5000, Numerals.getNumber("MMMMM"));
	}
	
	@Test(expected = InvalidNumeralFormatException.class)
	public void textIMMMM() throws InvalidNumeralFormatException{
		assertEquals(3999, Numerals.getNumber("IMMMM"));
	}
	
	@Test(expected = InvalidNumeralFormatException.class)
	public void textXMMMM() throws InvalidNumeralFormatException{
		assertEquals(3990, Numerals.getNumber("XMMMM"));
	}
	
	@Test(expected = InvalidNumeralFormatException.class)
	public void textDD() throws InvalidNumeralFormatException{
		assertEquals(1000, Numerals.getNumber("DD"));
	}
	
	@Test(expected = InvalidNumeralFormatException.class)
	public void textICCC() throws InvalidNumeralFormatException{
		assertEquals(999, Numerals.getNumber("ICCC"));
	}
	
	@Test(expected = InvalidNumeralFormatException.class)
	public void textCCCC() throws InvalidNumeralFormatException{
		assertEquals(400, Numerals.getNumber("CCCC"));
	}
	
	@Test(expected = InvalidNumeralFormatException.class)
	public void textLL() throws InvalidNumeralFormatException{
		assertEquals(100, Numerals.getNumber("LL"));
	}
	
	@Test(expected = InvalidNumeralFormatException.class)
	public void textIC() throws InvalidNumeralFormatException{
		assertEquals(99, Numerals.getNumber("IC"));
	}
	
	@Test(expected = InvalidNumeralFormatException.class)
	public void textXXXX() throws InvalidNumeralFormatException{
		assertEquals(40, Numerals.getNumber("XXXX"));
	}
	
	@Test(expected = InvalidNumeralFormatException.class)
	public void textIL() throws InvalidNumeralFormatException{
		assertEquals(49, Numerals.getNumber("IL"));
	}
	
	@Test(expected = InvalidNumeralFormatException.class)
	public void textIIII() throws InvalidNumeralFormatException{
		assertEquals(4, Numerals.getNumber("IIII"));
	}
}

