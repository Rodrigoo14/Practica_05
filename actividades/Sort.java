package actividades;

public class Sort {

	public static void bubbleSort (int[] arreglo) {
		boolean fl = true;
		int pass = 0;
		int n = arreglo.length;
		
		for (pass = 0; pass < n-1 && fl; pass++) {
			//Bucle extremo controla la cantidad de pasadas
			fl = false;
			for (int j = 0; j < n-pass-1; j++) {
				//Elementos desordenados, es necesario intercambio
				if (arreglo[j] > arreglo[j+1]) {
					fl = true;
					int aux = arreglo[j];
					arreglo[j] = arreglo[j+1];
					arreglo[j+1] = aux;
				}
			}
		}
		
	}
	
	
	public static void insertionSort(int[] arreglo) {
		int i, j , aux;
		
		for (i = 1; i < arreglo.length; i++) {
			//El indice j explora sublista arreglo[a-1]..a[0]
			//Buscando posicion correcta del elemento destion, para asignarlo en a[j]
			j = i;
			aux = arreglo[i];
			//Se localiza el punto de insercion explorando hacia atras
			while (j > 0 && aux < arreglo[j-1]) {
				arreglo[j] = arreglo[j-1];
				j--;
			}
			arreglo[j] = aux;
		}
		
	}
	
	
	public static void selectionSort(int[] arreglo) {
		int min;
		for (int i = 0; i < arreglo.length - 1; i++) {
			min = i;
			for (int j = i+1; j < arreglo.length; j++) {
				if (arreglo[min] > arreglo[j]) {
					min = j;
				}
			}
			int aux = arreglo[min];
			arreglo[min] = arreglo[i];
			arreglo[i] = aux;
		}
	}

	
	public static void shellSort (int[] arreglo) {
		int interval = arreglo.length / 2;
		int i, j, aux;
		
		while (interval > 0) {
			for (i = interval; i < arreglo.length; i++) {
				j = i;
				aux = arreglo[i];
				while ((j >= interval) && (arreglo[j-interval] > aux)) {
					arreglo[j] = arreglo[j-interval];
					j = j - interval;
				}
				arreglo[j] = aux;
			}
			interval = interval / 2;
		}
	}
	
	
	public static void quickSort (int[] arreglo, int l, int r) {
		int i = l;
		int j = r;
		int pivot = arreglo[(l+r)/2];
		do {
			while (arreglo[i] < pivot) {
				i++;
			}
			while (pivot < arreglo[j]) {
				j--;
			}
			if (i <= j) {
				if (i != j) {
					int aux = arreglo[i];
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
	
    public static void bricksort(int[] arreglo) {
        int n = arreglo.length;
        boolean fl = true;

        while (fl) {
        	fl = false;
            for (int i = 1; i < n - 1; i += 2) {
                if (arreglo[i] > arreglo[i + 1]) {
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[i + 1];
                    arreglo[i + 1] = temp;
                    fl = true;
                }
            }

            for (int i = 0; i < n - 1; i += 2) {
                if (arreglo[i] > arreglo[i + 1]) {
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[i + 1];
                    arreglo[i + 1] = temp;
                    fl = true;
                }
            }
        }
    }
	
    
    public static void shakesort(int[] arreglo) {
        int izquierda = 0;
        int derecha = arreglo.length - 1;
        boolean swapped = true;

        while (swapped) {
            swapped = false;
            for (int i = izquierda; i < derecha; i++) {
                if (arreglo[i] > arreglo[i + 1]) {
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[i + 1];
                    arreglo[i + 1] = temp;
                    swapped = true;
                }
            }
            derecha--;

            for (int i = derecha; i > izquierda; i--) {
                if (arreglo[i] < arreglo[i - 1]) {
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[i - 1];
                    arreglo[i - 1] = temp;
                    swapped = true;
                }
            }
            izquierda++;
        }
    }
    
    
}
