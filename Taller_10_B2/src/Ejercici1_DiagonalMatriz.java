
/** *
 * Dada una matriz cuadrada (m X m) de valores enteros aleatorios, desarrollar su procesamiento para presentar los elementos:
 * De la diagonal principal.
 * De la diagonal segundaria.
 * Ubicados bajo la diagonal principal.
 * Ubicados sobre la diagonal principal.
 * Ubicados bajo la diagonal secundaria.
 * Ubicados sobre la diagonal secundaria.
 */
import java.util.Scanner;

public class Ejercici1_DiagonalMatriz {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int tamanioMatriz = 0;
        System.out.print("Deme tamanio de la matriz: ");
        tamanioMatriz = tcl.nextInt();
        int matriz[][] = new int[tamanioMatriz][tamanioMatriz];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("DIAGONAL PRINCIPAL OBVIA");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == j) {
                    System.out.print(matriz[i][j] + "\t");
                }
            }
        }
        System.out.println("\nDIAGONAL PRINCIPAL EFICIENTE");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + "\t");
        }
        System.out.println("\nDIAGONAL SECUNDARIA OBVIA");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if ((i + j) == matriz.length - 1) {
                    System.out.print(matriz[i][j] + "\t");
                }
            }
        }
        System.out.println("\nDIAGONAL SECUNDARIA EFICIENTE");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][matriz.length - i - 1] + "\t");
        }
        System.out.println("\nBAJO DIAGONAL PRINCIPAL EFICIENTE");
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; i > j; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }
        System.out.println("\nBAJO DIAGONAL PRINCIPAL OBVIA");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; i > j; j++) {
                if (i > j) {
                    System.out.print(matriz[i][j] + "\t");
                }
            }
        }
        System.out.println("\nSOBRE DIAGONAL PRINCIPAL OBVIA");
        for (int i = 0; i < 10; i++) {
            
        }
    }
}
/***
 * run:
 * Deme tamanio de la matriz: 3
 * 6	1	4	
 * 7	8	3	
 * 9	6	8	
 * DIAGONAL PRINCIPAL OBVIA
 * 6	8	8	
 * DIAGONAL PRINCIPAL EFICIENTE
 * 6	8	8	
 * DIAGONAL SECUNDARIA OBVIA
 * 4	8	9	
 * DIAGONAL SECUNDARIA EFICIENTE
 * 4	8	9	
 * BAJO DIAGONAL PRINCIPAL EFICIENTE
 * 7	9	6	
 * BAJO DIAGONAL PRINCIPAL OBVIA
 * 7	9	6	
 * SOBRE DIAGONAL PRINCIPAL OBVIA
 */