class prime{
	static int is_prime(int n){
		for(int i=2; i<n; i++){
			if(n%i==0){
				return 0;
			}
		}
		return 1;
	}

	public static void main(String a[]){
		int n;
		n = 10;
		int count = 1;
		int i = 2;
		while(count <= n){
			if(is_prime(i) == 1){
				count++;
				System.out.println(i);
			}
			i++;
		}
	}
}