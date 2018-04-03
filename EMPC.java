package criptografia;

import java.math.BigInteger;

public class EMPC {

	public static void main(String[] args) {

		BigInteger e = BigInteger.valueOf(13);
		BigInteger y = BigInteger.ONE;
		BigInteger x = BigInteger.valueOf(4);
		BigInteger n = BigInteger.valueOf(497);
		int k = e.toString(2).length();
		BigInteger pot = x.mod(n);

		for (int i = k - 1; i >= 0; i--) {
			if (e.toString(2).charAt(i) == '1') {
				y = (y.multiply(pot)).mod(n);

			}
			pot = (pot.multiply(pot)).mod(n);

		}
		System.out.println(y);

	}

}
