package criptografia;

import java.math.BigInteger;

public class InversoX {
	
	BigInteger inversa;
	BigInteger n;
	BigInteger mod;
 
	public InversoX(BigInteger a, BigInteger mod) {
		this.n = a;
		this.mod = mod;
	}

	public  void testeMod(){
		inversa =  n.gcd(mod);
		if(!inversa.equals(BigInteger.ONE)){
			System.out.println(n+" Não tem inversa.");
		}else{
			inversa = n.modInverse(mod);
			System.out.println(" A inversa modular de "+n+"mod("+mod+") é: "+inversa);
		}
	}
	


}
