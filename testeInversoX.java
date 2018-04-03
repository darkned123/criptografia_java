package criptografia;

import java.math.BigInteger;

public class testeInversoX {

	public static void main(String[] args) {
		
		BigInteger a = BigInteger.valueOf(3);
		BigInteger mod = BigInteger.valueOf(26);
		InversoX t = new InversoX(a, mod);
		t.testeMod();
		
	}

}
