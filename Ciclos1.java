
import java.util.Scanner;
public class Ciclos1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el valor de la tabla que desea conocer:  ");
        int ntabla= sc.nextInt();
        int resul=0;
        for (int i = 1; i <= 10; i++) {
            resul= ntabla * i;
            System.out.println(ntabla+ " X "+ i + " = "+resul);
        }//fin del for
    }//fin del método main
}//fin de la class
