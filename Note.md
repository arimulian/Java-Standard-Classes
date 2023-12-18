# # Java Standard Classes

---

## - STRING

String di java sifatnya *Immutable*, jadi tidak bisa berubah.

Ketika ingin **memanipulasi String** di java maka akan membuat data baru dimemory.

```java
package armul.java.classes;

public class StringApp {
	public static void main(String[] args) {
		String name = "Armul";
	
		System.out.println(name.hashCode());
		System.out.println(name.toLowerCase().hashCode());
		System.out.println(name.substring(2, name.length()).hashCode());
	}
}

```

---

## - STRING BUFFER & STRING BUILDER

ketika ingin memanipulasi string yan begitu besar disarankan menggunakan **String Buffer** atau **String Builder**

String buffer dan String builder memiliki kesamaan yaitu bisa memanipulasi string, namun jika kita ingin memanipulasi string secara paralel disarankan menggunakan string buffer karena thread safe, maka secara otomatis performanya lebih lambat dibanding string builder.

```java
package armul.java.classes;

public class StringBuilderApp {
	public static void main(String[] args) {


		StringBuilder builder = new StringBuilder();

		builder.append("ari");
		builder.insert(3, "\n");
		builder.append("ar");
		builder.append("i");

		System.out.println(builder.toString().toLowerCase());
	}
}

```

---

## - STRING JOINER CLASS

string class untuk membuat string sequence yang dipisahkan dengan delimeter,

cocok ketika kita ingin membuat array dengan format yang kita mau.

```java
package armul.java.classes;

import java.util.StringJoiner;

public class StringJoinerApp {
	public static void main(String[] args) {

		String[] names = {"Zhiqiang", "Roberto", "Jianhua"};
		StringJoiner joiner = new StringJoiner(", ","[", "]");

		for(String name : names){
			joiner.add(name);
		}
		System.out.println(joiner.toString());

		StringJoiner name = new StringJoiner(", ", "{","}");
		name.add("name 1").add("name 2").add("name 3");
		System.out.println(name);

	}
}

```

---

## - NUMBER CLASS

Semua tipe data yang bukan primitif memiliki parent yang sama yaitu Number class, class tersebut memiliki banyak method dan bisa mengkonversi ke type data number lain.

```java
package armul.java.classes;

public class NumberClassesApp {

	public static void main(String[] args) {

		Integer value = 1_000_000;
		Long valueLong = value.longValue();

		System.out.println(valueLong.getClass().getSimpleName());

		String valueString = "1000000";
		int valueInt = Integer.parseInt(valueString);
		System.out.println(valueInt);

		Integer valueInteger = Integer.valueOf(valueString);
		System.out.println(valueInteger.getClass().getSimpleName());

	}
}

```

---

## - MATH CLASS

Math Class merupakan Class yang digunakan untuk mengolah type data number dengan pendekatan matematik, seperti mencari max value, min value dan lain lain.

```java
package armul.java.classes;

public class MathApp {
	public static void main(String[] args) {

		int numbers1 = 1000;
		int numbers2 = 2000;

		System.out.println(Math.max(numbers1, numbers2));
		System.out.println(Math.min(numbers1, numbers2));

	}
}

```

---

## - BIG NUMBER CLASS

merupakan class di java yang menyediakan alternatif untuk type data number jika type data seperti Integer, Long, dan dll, sudah tidak mampu untuk menyimpan datanya karena terlalu besar atau tidak sesuai kapasitas, java memberikan alternatif untuk permasalahan tersebut menggunakan BigNumber Class.

```java
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

```

---

## - SCANNER CLASS

Merupakan bagian dari Java I/O, fungsi dari class scanner untuk membaca input dari file, console, dll.

```java
package armul.java.classes;

import java.util.Scanner;

public class ScannerApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("nama : ");
		String result = scanner.nextLine();
		System.out.println("Hi " + result);
	}
}

```

/

---

## - DATE & CALENDER CLASS

merupakan class yang ada di java untuk memanipulasi waktu.

```java
package armul.java.classes;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2022);

		Date date = cal.getTime();
		System.out.println(date);
	}
}

```

---

## - SYSTEM CLASS

merupakan class di java yang berisikan banyak sekali utility static method.

```java
package armul.java.classes;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SystemApp {

	public static void main(String[] args) {

		Logger logger = Logger.getLogger(SystemApp.class.getName());
		var env = System.getenv("OS");
		logger.log(Level.INFO, "Environment " + env);

	}
}

```

---

## - RUNTIME CLASS

Setiap aplikasi Java memiliki satu instance kelas Runtime yang memungkinkan aplikasi berinteraksi dengan lingkungan tempat aplikasi berjalan. Runtime saat ini dapat diperoleh dari metode getRuntime. Suatu aplikasi tidak dapat membuat instance kelas ini sendiri.

```java
package armul.java.classes;

import java.util.logging.Level;
import java.util.logging.Logger;

public class RuntimeApp {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger(RuntimeApp.class.getName());

		Runtime runtime = Runtime.getRuntime();
		logger.log(Level.INFO,"Processors amount of threads " + (int) runtime.availableProcessors());
		logger.log(Level.INFO,"Total Memory in JVM " + (long) runtime.totalMemory());
		logger.log(Level.INFO,"Max Memory in JVM " + (long) runtime.maxMemory());
		logger.log(Level.INFO,"Free Memory in JVM " + (long) runtime.freeMemory());
	}
}

```

---

## UUID CLASS

Kelas yang mewakili pengidentifikasi unik universal (UUID) yang tidak dapat diubah. UUID mewakili nilai 128-bit.

```java
package armul.java.classes;

import java.util.UUID;

public class UUIDApp {
	public static void main(String[] args) {

		UUID uuid = UUID.randomUUID();
		String key = uuid.toString();
		for (int i = 1; i < 50 ; i++) {
			System.out.println(key);
		}
	}
}

```

---

## - BASE64 CLASS
Kelas ini secara eksklusif terdiri dari metode statis untuk mendapatkan encoder dan decoder untuk skema pengkodean Base64. Implementasi kelas ini mendukung tipe Base64 berikut seperti yang ditentukan dalam RFC 4648 dan RFC 2045 .

```java
package armul.java.classes;

import java.util.Base64;

public class Base64App {
	public static void main(String[] args) {

		String encoded = "Ari Muliansyah Manurung";
		String base64 = Base64.getEncoder().encodeToString(encoded.getBytes());
		System.out.println(base64);

		var bytes = Base64.getDecoder().decode(base64);
		String result = new String(bytes);
		System.out.println(result);
	}
}

```