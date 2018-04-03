package criptografia;

import java.math.BigDecimal;

/* o mod tem q ser > que a mensagem */

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;

public class RSA {
	// publicKey tem que ser assim:1<e<phi(n);
	private BigInteger publicKey = BigInteger.ONE; 
	private BigInteger privateKey;

	private BigInteger mod;
	private final static BigInteger one = new BigInteger("1");
	private final static SecureRandom random = new SecureRandom();
	public BigInteger gerapublic;


	/**
	 * @param N
	 *  modulo RSA(N) gera chave pública e privada
	 */
	RSA(int N) {
		BigInteger p = BigInteger.probablePrime(N / 2, random);
		// BigInteger p = BigInteger.valueOf(13);
		BigInteger q = BigInteger.probablePrime(N / 2, random);
		// BigInteger q = BigInteger.valueOf(11);
		// (p-1)(q-1)
		BigInteger phi = (p.subtract(one)).multiply(q.subtract(one));
		System.out.println("phi " + phi);
		// mod pq, p e q são primos distintos
		mod = p.multiply(q);
		// publicKey = new BigInteger("35551");
		gerapublic = phi.subtract(new BigInteger("1"));

		while (publicKey.compareTo(gerapublic) < 1){
			//System.out.println("passou");
			// publicKey = publicKey.add(new BigInteger(N, random));
			// publicKey = BigInteger.valueOf(gerador.nextInt(N));
			publicKey = randomBigInteger(gerapublic);
			if (phi.gcd(publicKey).compareTo(new BigInteger("1")) == 0) {
				break;
			}

		} 

		// ed congruente 1(mod(p-1)(q-1)), retorna a inversa de e(e^-1). Então,
		// d = e^-1(mod pq)
		privateKey = publicKey.modInverse(phi);

	}

	//random em BigInteger..
	public static BigInteger randomBigInteger(BigInteger n) {
		Random rnd = new Random();
		int maxNumBitLength = n.bitLength();
		BigInteger aRandomBigInt;
		do {
			aRandomBigInt = new BigInteger(maxNumBitLength, rnd);
		} while (aRandomBigInt.compareTo(n) > 0);
		return aRandomBigInt;
	}

	// C = T^e(mod PQ)
	BigInteger C(BigInteger T) {
		return T.modPow(publicKey, mod);
	}

	// T = C^e(mod PQ)
	BigInteger T(BigInteger E) {
		return E.modPow(privateKey, mod);
	}


}