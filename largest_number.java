class largest_number{
	public static void main(String a[]){
		int arr[] = {5,2,5,6,7,9};
		int max = arr[0];
		for(int i = 0; i<arr.length; i++){
			if(max < arr[i]){
				max = arr[i];
			}
		}
		System.out.print("Largest element in the array is "+max);
	}
}