package armul.java.classes;

import java.math.BigInteger;

public class BigNumberApp {
	public static void main(String[] args) {

		BigInteger bigInteger1 = new BigInteger("2000000000000");
		BigInteger bigInteger2 = new BigInteger("1000000000000");

		BigInteger tambah = bigInteger1.add(bigInteger2);
		BigInteger kurang = bigInteger1.subtract(bigInteger2);
		BigInteger kali = bigInteger1.multiply(bigInteger2);
		BigInteger bagi = bigInteger1.divide(bigInteger2);

		System.out.println(tambah);
		System.out.println(kurang);
		System.out.println(kali);
		System.out.println(bagi);


	}
}
