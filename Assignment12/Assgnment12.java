package Practice;
import java.util.*;

public class Assignment12 {
	
	// 1. Display array	
	public static void display(int array[], int size) {
		for(int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
	}
	
	// 2. Insert Element
	public static void insert(int array[], int size, int capacity, int idx, int element) {
		if(size >= capacity) {
			System.out.println("Error Array is already full");
			return;
		}
		
		if(idx > size ||idx >= capacity || idx < 0) {
			System.out.println("Error index out of bound");
			return;
		}
		
		for(int i = size; i > idx; i--) {
			array[i] = array[i-1]; 
		}
		
		array[idx] = element;
	}
	
	// 3. Delete Element
	public static void delete(int array[], int size, int capacity, int idx) {
		
		if(idx >= size ||idx >= capacity || idx < 0) {
			System.out.println("Error index out of bound");
		}
		
		for(int i = idx; i < size-1; i++) {
			array[i] = array[i+1];
		}
	}
	
	//4. Linear Search
	public static void linearSearch(int array[], int size, int element) {
		int idx = -1;
		
		for(int i = 0; i < size; i++) {
			if(array[i] == element) {
				idx = i;
				break;
			}
		}
		
		if(idx == -1) System.out.println("Element not found");
		else System.out.println("Element found at index = " + idx);
	}
	
	//5. Binary Search
	public static void binarySearch(int array[], int size, int element) {
		
		Arrays.sort(array);
		
		int idx = -1;
		int lo = 0, hi = size;
		
		while(lo <= hi) {
			int mid = lo + (hi - lo)/2;
			
			if(array[mid] == element) {
				idx = mid;
				break;
			}
			
			if(array[mid] < element) {
				lo = mid + 1;
			}
			else {
				hi = mid - 1;
			}
		}
		
		if(idx == -1) System.out.println("Element not found");
		else System.out.println("Element found at index = " + idx);
	}
	
	//6. Maximum Element
	public static void maxElement(int array[]) {
		int max = Integer.MIN_VALUE;
		
		for(int it : array) {
			max = Math.max(max, it);
		}
		
		System.out.println("Maximum Element of array : " + max);
	}
	
	//7. Count Even and odd
	public static void cntEvenOdd(int array[]) {
		int odd = 0, even = 0;
		
		for(int it: array) {
			if(it%2 == 0) even++;
			else odd++;
		}
		
		System.out.println("Number of Evens : " + even + " Number of Odds : " + odd);
	}
	
	//8. Insertion Sort
	public static void sort(int array[], int size) {
		System.out.println("Before Sort");
		for(int it: array) {
			System.out.print(it + " ");
		}
		System.out.println();
		
		
		for(int i = 1; i < size; i++) {
			int key = array[i];
			int j = i-1;
			
			while(j >= 0 && key < array[j]) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = key;
		}
		
		System.out.println("After Sort");
		for(int it: array) {
			System.out.print(it + " ");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert the capacity");
		int capacity = sc.nextInt();
		
		int[] array = new int[capacity];
		
		int size = 0;
		
		int choice;
		do {
			System.out.println("1. Display Array");
            System.out.println("2. Insert Element");
            System.out.println("3. Delete Element");
            System.out.println("4. Linear Search");
            System.out.println("5. Binary Search (Requires Sorted Array)");
            System.out.println("6. Find Maximum Value");
            System.out.println("7. Count Even and Odd Numbers");
            System.out.println("8. Perform Insertion Sort");
            System.out.println("9. Exit");
            System.out.print("Enter your choice (1-9): ");
            
			choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					display(array, size);
					break;
				
				case 2:
					System.out.println("Enter the index and element for insertion: ");
					int idx = sc.nextInt();
					int element = sc.nextInt();
					insert(array, size, capacity, idx, element);
					size++;
					break;
					
				case 3:
					System.out.println("Enter the elemt index you want to delete:");
					idx = sc.nextInt();
					delete(array, size, capacity, idx);
					size--;
					break;
					
				case 4:
					System.out.println("Enter the element for search");
					element = sc.nextInt();
					linearSearch(array, size, element);
					break;
					
				case 5:
					System.out.println("Enter the element for search");
					element = sc.nextInt();
					binarySearch(array, size, element);
					break;
					
				case 6:
					maxElement(array);
					break;
				
				case 7:
					cntEvenOdd(array);
					break;
				
				case 8:
					sort(array, size);
					break;
				
				case 9:
					System.out.println("--- Exit -- ");
					break;
			}
			
		}while(choice != 9);
		
		
		sc.close();
	}
}
