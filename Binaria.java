public class Binaria {
    public static void main(String[] args) {
        int[] vector = { 4, 6, 8, 2, 4, 89, 78, 22 };

        System.out.println("Se encontró en la pos: " + busquedaBinaria(vector, vector.length, 2));
    }


    int busquedaLineal(int[] vector, int len, int v) {
        int i = 0; // Asignación: 1 unidad de tiempo
        while (i < len && vector[i] != v) { // Comparación y acceso al array: 4n unidades de tiempo
            i++; // Operación aritmética: 2n unidades de tiempo
        }
        return i < len ? i : -1; // Comparación y asignación: 2 unidades de tiempo
    }

static int busquedaBinaria(int[] vector, int len, int v) {
    int j = len - 1; // Asignación: 1 unidad de tiempo
    int i = 0; // Asignación: 1 unidad de tiempo
    int k = 0; // Asignación: 1 unidad de tiempo
    boolean enc = false; // Asignación: 1 unidad de tiempo

    while (i <= j && !enc) { // Comparación: 2 log(n) unidades de tiempo
        k = (i + j) / 2; // Operación aritmética: 1 log(n) unidad de tiempo
        if (vector[k] == v) { // Acceso al array y comparación: 2 log(n) unidades de tiempo
            enc = true; // Asignación: 1 unidad de tiempo
        } else {
            if (vector[k] < v) { // Acceso al array y comparación: 2 log(n) unidades de tiempo
                i = k + 1; // Operación aritmética y asignación: 2 log(n) unidades de tiempo
            } else {
                j = k - 1; // Operación aritmética y asignación: 2 log(n) unidades de tiempo
            }
        }
    }
    return enc ? k : -1; // Comparación y asignación: 2 unidades de tiempo
}
/*

 */

    public static int powerIterative(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static int powerRecursive(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent % 2 == 0) {
            int temp = powerRecursive(base, exponent / 2);
            return temp * temp;
        } else {
            return base * powerRecursive(base, exponent - 1);
        }
    }


}
