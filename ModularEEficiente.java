package criptografia;

import java.math.BigInteger;

public class ModularEEficiente {

	
	
	
	public BigInteger InversaMod(BigInteger n, BigInteger a, BigInteger b) {
		
		BigInteger x = a;
		BigInteger t = BigInteger.ONE;
		
		while(b.compareTo(BigInteger.ZERO) == 1){
			if(b.mod(BigInteger.valueOf(2)).compareTo(BigInteger.ONE) == 0){
				t = (t.multiply(x)).mod(n);
				b = b.subtract(BigInteger.ONE);
			}
			x = (x.pow(2)).mod(n);
			b = b.divide(BigInteger.valueOf(2));
			
		}
		return t;
		
	}
	
	
}
