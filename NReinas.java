public class NReinas {
    static int soluciones = 0;

    // Comprobar si la reina puede ser colocada en la columna k
    static boolean comprobar(int[] reinas, int k) {
        for (int i = 0; i < k; i++) {
            // Verificar si están en la misma fila o en la misma diagonal
            if (reinas[i] == reinas[k] || Math.abs(k - i) == Math.abs(reinas[k] - reinas[i])) {
                return false;
            }
        }
        return true;
    }

    // Resolver el problema de las N reinas
    static void nReinas(int[] reinas, int n, int k) {
        // Caso base: si hemos colocado n reinas (k == n), hemos encontrado una solución.
        int i = 0;
        if (k == n) {
            soluciones++;  // Incrementa el contador de soluciones encontradas.
            printMatriz(reinas);
            System.out.print("Solucion " + soluciones + ": ");
            // Imprime la solución actual.

            for (; i < n; i++) {
                System.out.print(reinas[i] + " ");
            }
            System.out.println();



        } else {
            /*mostrar las eeradas también
            for (; i < n; i++) {
                System.out.print(reinas[i] + " ");
            }
            System.out.println(); System.out.println();*/

            //ahora buscamos las buenas
            // Si no hemos colocado todas las reinas, intentamos colocar la reina en la columna k.
            // Probar todas las filas para la columna k.
            for (reinas[k] = 0; reinas[k] < n; reinas[k]++) {
                // Si la reina puede ser colocada en la fila actual de la columna k,
                if (comprobar(reinas, k)) {  // Verificar si es seguro colocar la reina en reinas[k]
                    nReinas(reinas, n, k + 1); // se llama recursivamente para colocar la siguiente reina en la columna k+1.
                }//fin condicional
            }//finfor
        }//fin condicional
    }


    static void printMatriz(int[] reinas) {
        int n = reinas.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == reinas[j]) {
                    System.out.print(" " + reinas[j] + " |");
                } else {
                    System.out.print("-- |");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 8; // Número de reinas
        int[] reinas = new int[n];
        nReinas(reinas, n, 0);
    }
}
