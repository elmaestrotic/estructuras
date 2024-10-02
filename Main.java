//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        int[] vector = {5, 8, 2, 9, 7, 6};
        int aux = -0;

        for (int i = 0; i < vector.length-i-1; i++) {
            if (vector[i + 1] <= vector.length) {
                if (vector[i + 1] < vector[i]) {
                    aux = vector[i];
                        vector[i] = vector[i + 1];
                        vector[i + 1] = aux;
                    }

                }
            }

        
        //bubbleSort2(vector);
        printArray(vector);

            }
static void printArray(int[] v){
    for (int i = 0; i < v.length; i++) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        System.out.print("|" + v[i]);
    }
}
static void bubbleSort(int[] array) {
    int n = array.length;
    int i=0;
    for (; i < n-1; i++) {
        for (int j = 0; j < n-i-1; j++) {
            if (array[j] > array[j+1]) {
                // intercambiar array[j+1] y array[i]
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
    }
    System.out.println("Total pasadas "+i);
}

static void bubbleSort2(int[] array) {
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
}//fin

  static void bubbleSortOptimized(int[] array) {
    int n = array.length;
    boolean swapped;

    for (int i = 0; i < n - 1; i++) {
        swapped = false;
        for (int j = 0; j < n - i - 1; j++) {
            if (array[j] > array[j + 1]) {
                // intercambiar array[j+1] y array[j]
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                swapped = true;
            }
        }
        // Si no se realizó ningún intercambio en la última iteración, el arreglo ya está ordenado
        if (!swapped) {
            break;
        }
    }
}
}

