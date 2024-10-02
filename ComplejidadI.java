import java.util.Random;

public class ComplejidadI {


    public static void main(String[] args) {
        int[] array = generateRandomArray(1000000);  // Genera un array de 1 millón de elementos

        long startTime = System.nanoTime();
        bubbleSort(array);
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);  // Calcula la duración en nanosegundos
        System.out.println("Tiempo de ejecución de bubbleSort: " + duration + " nanosegundos");
    }

    static int[] generateRandomArray(int n) {
        int[] array = new int[n];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);  // Genera números aleatorios entre 0 y 99
        }
        return array;
    }

    static void bubbleSort(int[] array) {
        // Implementación del algoritmo de ordenamiento de burbuja
        int i = 0;
        while (i < array.length) {
            if (i == 0 || array[i - 1] <= array[i]) {
                i++;
            } else {
                int temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
                i--;
            }
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

