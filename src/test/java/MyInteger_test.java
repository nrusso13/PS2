import static org.junit.Assert.*;

import org.junit.Test;

import packageempty.MyInteger;

public class MyInteger_test {

	@Test
	public void testisEven() {
		MyInteger x = new MyInteger(6);
		MyInteger y = new MyInteger(7);
		assertTrue(x.isEven());
		assertFalse(y.isEven());
	}
	@Test
	public void testisOdd() {
		MyInteger x = new MyInteger(6);
		MyInteger y = new MyInteger(7);
		assertFalse(x.isOdd());
		assertTrue(y.isOdd());
	}
	@Test
	public void testisPrime() {
		MyInteger x = new MyInteger(3);
		MyInteger y = new MyInteger(16);
		assertTrue(x.isPrime());
		assertFalse(y.isPrime());
	}
	@Test
	public void testisEven2() {
		assertTrue(MyInteger.isEven(2));
		assertFalse(MyInteger.isEven(3));
	}
	@Test
	public void testisOdd2() {
		assertFalse(MyInteger.isOdd(2));
		assertTrue(MyInteger.isOdd(3));
	}
	@Test
	public void testisPrime2() {
		assertTrue(MyInteger.isPrime(2));
		assertFalse(MyInteger.isPrime(16));
	}
	@Test
	public void testisEven3() {
		MyInteger x = new MyInteger(6);
		MyInteger y = new MyInteger(7);
		assertTrue(MyInteger.isEven(x));
		assertFalse(MyInteger.isEven(y));
	}
	@Test
	public void testisOdd3() {
		MyInteger x = new MyInteger(6);
		MyInteger y = new MyInteger(7);
		assertFalse(MyInteger.isOdd(x));
		assertTrue(MyInteger.isOdd(y));
	}
	@Test
	public void testisPrime3() {
		MyInteger x = new MyInteger(16);
		MyInteger y = new MyInteger(3);
		assertFalse(MyInteger.isPrime(x));
		assertTrue(MyInteger.isPrime(y));
	}
	@Test
	public void testisEqual() {
		MyInteger x = new MyInteger(16);
		MyInteger y = new MyInteger(3);
		assertFalse(x.equals(7));
		assertTrue(y.equals(3));
	}
	@Test
	public void testisEqual2() {
		MyInteger x = new MyInteger(16);
		MyInteger y = new MyInteger(3);
		MyInteger z = new MyInteger(3);
		assertFalse(x.equals(z));
		assertTrue(y.equals(z));
	}
	
}
