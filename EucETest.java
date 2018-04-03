package estudo;

import java.math.BigInteger;

public class EucETest {

	public static void main(String[] args) {
		 EucE e = new EucE();

		BigInteger m = BigInteger.valueOf(26); //modulo
		BigInteger b = BigInteger.valueOf(19); //valor

		e.euclides(m, b);
		
	}
}
