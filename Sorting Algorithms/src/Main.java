public class Main {

	public static void main(String[]args) {
	
		int [] array = {10,3,6,13,2,1};
		
		int [] array2 = {2,4,1,6,8,5,3,7}; 
		
		/*Sorting sort = new Sorting();
		System.out.println("Printed array : ");
		sort.printArray(array);
		System.out.println();
		System.out.println("Printed array after sorting : ");
		sort.bubbleSort(array);
		sort.printArray(array);
		*/
		
		/*Sorting sort = new Sorting();
		System.out.println("Printed array : ");
		sort.printArray(array);
		System.out.println();
		System.out.println("Printed array after sorting : ");
		sort.selectionSort(array);
		sort.printArray(array);*/
		
		/*Sorting sort = new Sorting();
		System.out.println("Printed array : ");
		sort.printArray(array);
		System.out.println();
		System.out.println("Printed array after sorting : ");
		sort.insertionSort(array);
		sort.printArray(array);*/
		
		Sorting sort = new Sorting();
		System.out.println("Printed array : ");
		sort.printArray(array2);
		System.out.println();
		System.out.println("Printed array after sorting : ");
		sort.mergeSort(array2);
		sort.printArray(array2);
	}
}