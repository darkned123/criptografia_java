package criptografia;

import java.math.BigInteger;

public class ModularEEficienteTest {

	public static void main(String[] args) {
		ModularEEficiente meef = new ModularEEficiente();
		BigInteger n = BigInteger.valueOf(137); // modulo
		BigInteger a = BigInteger.valueOf(31); //base
		BigInteger b = BigInteger.valueOf(3); //expoente > 0
		BigInteger t;
		
		t = meef.InversaMod(n, a, b);
		System.out.println(t);

	}

}
