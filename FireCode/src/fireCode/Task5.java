package fireCode;

public class Task5 {

	public static int[] bubbleSort(int[] arr) {

		for (int x = 0; x < arr.length; x++) {

			for (int y = 0; y < arr.length - 1; y++) {

				if (arr[x] < arr[y]) {

					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
				}
			}
		}
		return arr;
	}
	
/*	
	public static int[] bubbleSort(int[] arr) {
		
		boolean swapped = true;
		
		for (int x = 0; x < arr.length - 1; x++) {
		
			check = false;
			
			for (int y = 0; y < arr.length - x - 1; y++) {
			
				if (arr[x] > arr[y]) {
					
					swapped = true;
					int temp = arr[y];
					arr[y] = arr[y+1];
					arr[y+1] = temp;
				}
			}
			if(swapped == false) 
			break;
		}
		return arr;
	}
*/	

	public static void printArray(int[] arr) {

		for (int i : arr)
			System.out.print(i + " ");
	}

	public static void main(String[] args) {

		int[] niz = { 11, 9, 7, -10, 3, 14, 21, 13, -22 };

		Task5.printArray(niz);

		Task5.bubbleSort(niz);

		System.out.println();

		Task5.printArray(niz);

	}
}
