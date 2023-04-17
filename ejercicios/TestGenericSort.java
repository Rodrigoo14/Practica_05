package ejercicios;

public class TestGenericSort {

	public static void main(String[] args) {
		Integer [] array = {35, 56, 31, 8, 57, 64, 74, 82, 62, 13, 50, 63, 21};
		String [] arrayS = {"Hola", "mundo", "como", "asd", "hello"};
		Character [] arrayC = {'h', 'a', '4', '&', '@'};
		Golosina [] arrayG = {new Golosina("chupetin", 0.5), new Golosina("galleta", 1.2), new Golosina("caramelo", 0.1)};
		showArray(array);
		showArray(arrayS);
		showArray(arrayC);
		showArray(arrayG);
		System.out.println();
		System.out.println();
		//System.out.println("Bubble Sort");
		//System.out.println("Insertion Sort");
		//System.out.println("Selection Sort");
		//System.out.println("Shell Sort");
		//System.out.println("Quick Sort");
		System.out.println("Merge Sort");
		
		//Bubble Sort
		/*
		GenericSort.bubbleSort(array);
		GenericSort.bubbleSort(arrayS);
		GenericSort.bubbleSort(arrayC);
		GenericSort.bubbleSort(arrayG);
		*/
		//Insetion Sort
		//GenericSort.insertionSort(array);
		//Selection Sort
		//GenericSort.selectionSort(array);
		//Shell Sort
		//GenericSort.shellSort(array);
		//Quick Sort
		//GenericSort.quickSort(array, 0, 12);
		//Merge Sort
		GenericSort.mergeSort(array, 0, 5, 10);
		showArray(array);
		//showArray(arrayS);
		//showArray(arrayC);
		//showArray(arrayG);
	}
	
	
	public static <T extends Comparable<T>> void showArray(T[] arreglo) {
		System.out.println("ARRAY:");
		for (int i = 0; i < arreglo.length; i++) {
			System.out.printf("%s\t", arreglo[i]);
		}
		System.out.println();
	}
	
}
