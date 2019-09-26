import java.util.Arrays;

public class Sorting {
	
	public Sorting() {
	}
	
	//BubbleSorting in ascending order
	public void bubbleSort(int [] array) {
		
		for(int i=0; i<array.length - 1; i++) {
			
			for(int j=0; j<array.length-i-1; j++) {
				
				if(array[j]>array[j+1]) {
					
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
			System.out.println(Arrays.toString(array));
		}
	}
	
	//Sorting using selectionSort Algorithm
	
	public void selectionSort(int [] array) {
		
		//10,3,6,13,2,1
		//1,3,6,13,2,10 
		//1,2,6,13,3,10
		//1,2,3,13,6,10
		//1,2,3,6,13,10
		//1,2,3,6,10,13
		
		int minValue = 0;
		int minIndex = 0; 
		
		for(int i=0; i<array.length-1; i++) {
			
			minValue = array[i];
			
			for(int j=i; j<array.length; j++) {
				
				if(array[j]<minValue) {
					
					minValue = array[j];
					minIndex = j;
				}
			}
			int temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
			System.out.println(Arrays.toString(array));
		}
	}
	
	public void insertionSort(int[]array) {
		
		//10,3,6,13,2,1				12,11,13,5,6
		//3,10,6,13,2,1				11,12,13,5,6
		//3,6,10,13,2,1				5,11,12,13,6
		//2,3,6,10,13,1				5,6,11,12,13
		//1,2,3,6,10,13
		
		for(int i=1; i<array.length; i++) {
			
			int key = array[i];
			int j = i - 1;
			
			while(j >=0 && array[j] > key) {
				
				array[j+1] = array[j];
				j = j - 1;
			}
			array[j+1] = key;
			System.out.println(Arrays.toString(array));
		}
	}
	
	public void mergeSort(int [] array) {
		
		int length = array.length; 
		if(length<2) {
			return;
		}
		
		int mid = length/2;
		
		int [] left = new int [mid];
		int [] right = new int[length-mid];
		
		for(int i=0; i<mid; i++) {
			
			left[i] = array[i];
		}
		for(int j=mid; j<length; j++) {
			
			right[j - mid] = array[j];
		}
		mergeSort(left);
		mergeSort(right);
		merge(left,right,array);
	}
	
	public void merge(int [] left,int [] right,int [] array) {
		
		int nL = left.length; 
		int rL = right.length;
		
		int i = 0 ,j = 0 ,k = 0;
		
		while(i<nL && j<rL) {
			
			if(left[i]<=right[j]) {
				array[k] = left[i];
				i = i + 1;
			}else {
				array[k] = right[j];
				j = j + 1;
			}
			k = k+1;
		}
		while(i<nL) {
			array[k] = left[i];
			i = i + 1; 
			k = k + 1; 
		}
		while(j<rL) {
			array[k] = right[j];
			j = j + 1; 
			k = k + 1; 
		}
	}
	//Function to print the array
	
	public void printArray(int [] array) {
		
		for(int i =0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}