public class NumberToWordConverter {
	private static final String[] ones = {
	"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
 	"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
 	};
 	private static final String[] tens = {
 	"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
 	};
 	public static String convertToWord(int number) {
 		if (number == 0) {
 			return "Zero";
 		}
 		if (number < 20) {
 			return ones[number];
 		}
 		if (number < 100) {
 			return tens[number / 10] + " " + ones[number % 10];
		}
 		if (number < 1000) {
 			return ones[number / 100] + " Hundred " + convertToWord(number % 100);
 		}
		if (number < 20000) {
			return ones[number / 1000] + " Thousand " + convertToWord(number % 1000);
		}
		if (number < 100000) {
			return tens[number / 10000] + " " + convertToWord(number % 10000);
		}
 			return "Number out of range";
 	}
 	public static void main(String[] args) {
 		int number = 59695;
 		String word = convertToWord(number);
 		System.out.println(number + " in words: " + word);
 	}
}