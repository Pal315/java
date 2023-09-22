class pattern1{
	public static void main(String a[]){
		String str = "Stream";
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