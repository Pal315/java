class CopyArray {    
    public static void main(String[] args) {
        int [] arr1 = {4,7,8,9,1,3};
	int arr2[] = new int[arr1.length];  
        for (int i = 0; i < arr1.length; i++) {     
            arr2[i] = arr1[i];     
        }    
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < arr1.length; i++) {     
           System.out.print(arr1[i] + " ");    
        }     
            
        System.out.println();    
        System.out.println("Elements of new array: ");    
        for (int i = 0; i < arr2.length; i++) {     
           System.out.print(arr2[i] + " ");    
        }     
    }    
}