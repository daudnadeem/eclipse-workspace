import java.text.NumberFormat;

public class Runner {

	public static void main(String[] args) {

//		return1to10();
//		return100to999();
		System.out.println(convert(1000));
//		return1to100();
//		return1to1000();

	}

	public static void return1to10() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	public static void return100to999() {
		for (int i = 100; i <= 999; i++) {
			System.out.println(i);
		}
	}


		public static String convert(final int n) {
			String[] unitNumberNames = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", 
					"Nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen" , "eighteen" , "nineteen" , "twenty" };
			
			String[] tens = { "", "", "Twenty", "Thirty","Forty","Fifty","Sixty", "Seventy","Eighty", "Ninety" }; 
			
			if (n < 20) {
				return unitNumberNames[n];
			}

			if (n < 100) {
				return tens[n / 10] + " " + unitNumberNames[n % 10];
			}

			if (n < 1000) {
				return unitNumberNames[n / 100] + " Hundred and" + convert(n % 100);
			}
			
			if (n == 1000) {
				return convert(n / 1000) + " Thousand";
			}

			
			return convert(n);
		}
	
	public static void return1to100() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
	}

	public static void return1to1000() {
		for (int i = 1; i <= 1000; i++) {
			System.out.println(i);
		}
	}
}
