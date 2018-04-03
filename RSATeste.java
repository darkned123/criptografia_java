package criptografia;

import java.math.BigInteger;

public class RSATeste {

	public static void main(String[] args) {

		BigInteger T;
		BigInteger E;
		BigInteger D;

		int N = 3283; // N = pq é o módulo com p;q primos distintos, usualmente
						// cada um tem ao menos 100 dígitos.
		RSA key = new RSA(N);
		T = new BigInteger("12001907767623232323230420179");
		E = key.C(T);
		D = key.T(E);
		System.out.println("message   = " + T);
		System.out.println("encrpyted = " + E);
		System.out.println("decrypted = " + D);

	}

}
