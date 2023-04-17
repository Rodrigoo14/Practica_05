package ejercicios;

public class GenericSort <T> {

	public static <T extends Comparable<T>> void bubbleSort (T[] arreglo) {
		boolean fl = true;
		int pass = 0;
		int n = arreglo.length;
		
		for (pass = 0; pass < n-1 && fl; pass++) {
			fl = false;
			for (int j = 0; j < n-pass-1; j++) {
				if (arreglo[j].compareTo(arreglo[j+1]) > 0) {
					fl = true;
					T aux = arreglo[j];
					arreglo[j] = arreglo[j+1];
					arreglo[j+1] = aux;
				}
			}
		}
		
	}
	
	
	public static <T extends Comparable<T>> void insertionSort(T[] arreglo) {
		int i, j;
		T aux;
		for (i = 1; i < arreglo.length; i++) {
			//El indice j explora sublista arreglo[a-1]..a[0]
			//Buscando posicion correcta del elemento destion, para asignarlo en a[j]
			j = i;
			aux = arreglo[i];
			//Se localiza el punto de insercion explorando hacia atras
			while (j > 0 && aux.compareTo(arreglo[j-1]) < 0) {
				arreglo[j] = arreglo[j-1];
				j--;
			}
			arreglo[j] = aux;
		}
		
	}
	
	
	public static <T extends Comparable<T>> void selectionSort(T[] arreglo) {
		int min;
		for (int i = 0; i < arreglo.length - 1; i++) {
			min = i;
			for (int j = i+1; j < arreglo.length; j++) {
				if (arreglo[min].compareTo(arreglo[j]) > 0) {
					min = j;
				}
			}
			T aux = arreglo[min];
			arreglo[min] = arreglo[i];
			arreglo[i] = aux;
		}
	}

	
	public static <T extends Comparable<T>> void shellSort (T[] arreglo) {
		int interval = arreglo.length / 2;
		int i, j;
		T aux;
		
		while (interval > 0) {
			for (i = interval; i < arreglo.length; i++) {
				j = i;
				aux = arreglo[i];
				while ((j >= interval) && (arreglo[j-interval].compareTo(aux) > 0)) {
					arreglo[j] = arreglo[j-interval];
					j = j - interval;
				}
				arreglo[j] = aux;
			}
			interval = interval / 2;
		}
	}
	
	
	public static <T extends Comparable<T>> void quickSort (T[] arreglo, int l, int r) {
		int i = l;
		int j = r;
		T pivot = arreglo[(l+r)/2];
		do {
			while (arreglo[i].compareTo(pivot) < 0) {
				i++;
			}
			while (pivot.compareTo(arreglo[j]) < 0) {
				j--;
			}
			if (i <= j) {
				if (i != j) {
					T aux = arreglo[i];
					arreglo[i] = arreglo[j];
					arreglo[j] = aux;
				}
				i++;
				j--;	
			}
		} while (i <= j);
		if (l < j) {
			quickSort(arreglo, l, j);
		}
		if (i < r) {
			quickSort(arreglo, i, r);
		}
	}
	
	public static <T extends Comparable<T>> void mergeSort(T[] arreglo, int izquierda, int medio, int derecha) {
        int n1 = medio - izquierda + 1;
        int n2 = derecha - medio;
        Object[] arregloI = (T[]) new Object[n1];
        Object[] arregloD = (T[]) new Object[n2];
        for (int i = 0; i < n1; ++i)
        	arregloI[i] = arreglo[izquierda + i];
        for (int j = 0; j < n2; ++j)
        	arregloD[j] = arreglo[medio + 1 + j];
        int i = 0, j = 0;
        int k = izquierda;
        while (i < n1 && j < n2) {
        	T auxI = (T) arregloI[i];
        	T auxJ = (T) arregloD[j];
            if (auxI.compareTo(auxJ) <= 0) {
            	arreglo[k] = (T) arregloI[i];
                i++;
            } else {
            	arreglo[k] = (T) arregloD[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
        	arreglo[k] = (T) arregloI[i];
            i++;
            k++;
        }
        while (j < n2) {
        	arreglo[k] = (T) arregloD[j];
            j++;
            k++;
        }
    }
	
}
