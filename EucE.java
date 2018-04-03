package estudo;

import java.math.BigInteger;

public class EucE {

	public void euclides(BigInteger m, BigInteger b) {

		BigInteger a[] = { BigInteger.ONE, BigInteger.ZERO, m };
		BigInteger b1[] = { BigInteger.ZERO, BigInteger.ONE, b };

		do {
			if (b1[2].equals(BigInteger.ZERO)) {

				System.out.println(" Não tem inversa");
				break;
			} else if (b1[2].equals(BigInteger.ONE)) {
				b1[2] = m.gcd(b);
				b1[1] = b.modInverse(m);
				System.out.println(b1[0] + ", [" + b1[1] + "], " + b1[2]);
				break;
			} else {

				BigInteger q = a[2].divide(b1[2]);

				BigInteger[] t = { a[0].subtract((q).multiply(b1[0])), a[1].subtract((q).multiply(b1[1])),
						a[2].subtract((q).multiply(b1[2])) };

				a[0] = b1[0];
				a[1] = b1[1];
				a[2] = b1[2];

				b1[0] = t[0];
				b1[1] = t[1];
				b1[2] = t[2];

				if (b1[2].equals(BigInteger.ZERO)) {
					a[2] = m.gcd(b);
					System.out.println(" Não tem inversa");
				}

			}
		} while (b1[2].compareTo(BigInteger.ZERO) != 0);

	}
}
