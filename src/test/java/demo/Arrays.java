package demo;

public class Arrays {
	
	public static void printarrya(int arr[]) {
		int n = arr.length;
		
//		for(int i=0; i<n; i++) {
//			System.out.print(arr[i]+" ");
//		}
		int i = n-1;
		while(i >= 0) {
			System.out.print(arr[i--]+" ");
//			i--;
		}
		System.out.println();
	}
	
	public static int[] reverseArray(int[] arr) {
		int n = arr.length;
		int j = 0;
		int[] ans = new int[n];
		System.out.print("Reversed Array: ");
		
//		for(int i=n-1; i>=0; i--) {
//			ans[j++] = arr[i];
//		}
		
		int i = n-1;
		while(i>=0) {
			ans[j++] = arr[i--];
//			i--;
//			j++;
		}
		return ans;
	}
	
	
	public static void swapInArray(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void reverseArrayItself(int arr[]) {
		int i=0, j = arr.length-1;
		
		while(i < j) {
			swapInArray(arr, i, j);
			i++;
			j--;
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		System.out.print("Original array: ");
		printarrya(arr);
//		int[] ans = reverseArray(arr);
//		printarrya(ans);
		
		reverseArrayItself(arr);
		System.out.print("Reversed array: ");
		printarrya(arr);
		
 	}

}
