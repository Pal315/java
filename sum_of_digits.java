class sum_of_digits{
	public static void main(String a[]){
		int num = 12345;
		int remainder;
		int sum = 0;
		while(num != 0){
			remainder = num % 10;
			num = num / 10;
			sum += remainder;
		}
		System.out.println("Sum of digits is "+sum);
	}
}