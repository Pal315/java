class SwapVariables{
	public static void main(String a[]){
		int num1 = 10;
		int num2 = 20;
		System.out.println("Variables before swapping are "+num1+" and "+num2);
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("Variables after swapping are "+num1+" and "+num2);
	}
}