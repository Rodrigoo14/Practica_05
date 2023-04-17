	package actividades;
	
	public class TestSort {
		
		public static void main(String[] args) {
			int [] array = {35, 56, 31, 8, 57, 64, 74, 82, 62, 13, 50, 63, 21};
			showArray(array);
			//System.out.println("Bubble Sort");
			//System.out.println("Insertion Sort");
			//System.out.println("Selection Sort");
			//System.out.println("Shell Sort");
			//System.out.println("Quick Sort");
			//System.out.println("BrickSort");
			System.out.println("ShakeSort");
			//Bubble Sort
			//Sort.bubbleSort(array);
			//Insetion Sort
			//Sort.insertionSort(array);
			//Selection Sort
			//Sort.selectionSort(array);
			//Shell Sort
			//Sort.shellSort(array);
			//Quick Sort
			//Sort.quickSort(array, 0, 12);
			//BrickSort
			//Sort.bricksort(array);
			//ShakeSort
			Sort.shakesort(array);
			showArray(array);
		}
		
		
		public static void showArray(int[] arreglo) {
			System.out.println("Arreglo:");
			for (int i = 0; i < arreglo.length; i++) {
				System.out.printf("%d\t", arreglo[i]);
			}
			System.out.println();
		}
		
	}
