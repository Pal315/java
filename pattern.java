import java.util.Scanner;

class pattern{
	public static void main(String a[]){

		Scanner read = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = read.nextLine();
		//System.out.println(str.charAt(0));
		int len = str.length();

		for(int i = 0; i < len; i++){
			for(int k = 0; k < len-1-i; k++){
				System.out.print(" ");
			}

			for(int j = 0; j < i+1; j++){
				System.out.print(str.charAt(j));
				System.out.print(" ");
			}
			System.out.println();
		}	
							
	}
}