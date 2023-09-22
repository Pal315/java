class Sum_of_n_numbers{
	public static void main(String a[]){
		int num = 10;
		int sum = 0;
		for(int i = 1; i <= num; i++){
			sum += i;
		}
		System.out.println("Sum of " + num + " natural numbers is " + sum);
	}
}