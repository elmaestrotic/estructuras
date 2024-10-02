public class Ordenamiento {
          public static void main(String[] args) {
            int[] arr = {6, 4, 8, 15, 7, 5, 2};
           insertionSort(arr);
            //selectionSort(arr);
            // Imprimir el array ordenado
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }

        public static void insertionSort(int[] arr) {
            // Bucle para recorrer el array desde el segundo elemento hasta el final
            for (int i = 1; i < arr.length; ++i) {
                int key = arr[i]; // Elemento actual a ser insertado
                int j = i - 1; // Índice del último elemento del subarray ordenado
                // Bucle para desplazar elementos del subarray ordenado
                // Mover los elementos de arr[0..i-1] (subrango) que son mayores que key a una posición adelante de su posición actual
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j]; // Desplazar el elemento hacia adelante
                    j = j - 1; // Moverse hacia el inicio del subarray
                }
                arr[j + 1] = key; // Insertar el elemento en la posición correcta del subarray
            }
        }

    public static void selectionSort(int[] array) {
        int n = array.length;
        // Mover el límite del subarray no ordenado
        for (int i = 0; i < n-1; i++) {
            // Encontrar el elemento mínimo en el subarray no ordenado
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }

            /* Intercambiar el elemento mínimo encontrado con el primer elemento
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;*/

            array[i] = array[min] + (array[min] = array[i]) * 0;
        }
    }

    }




