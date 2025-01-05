/***
 * Dadas dos matrices (cuadradas y/o rectangulares) de valores enteros aleatorios, desarrollar su procesamiento para calcular y presentar:
 * La suma de las dos matrices (considerar las restricciones matemáticas para ello).
 * La multiplicación de las dos matrices (considerar las reglas matemáticas para ello).
 * @author Jesus Rivas
 */

import java.util.Scanner;

public class Ejercicio2_SumaMultiplicacion {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int tamano = 0;

        System.out.print("Dame el tamano de las matrices: ");
        tamano = tcl.nextInt();
        int matriz1[][] = new int[tamano][tamano];
        int matriz2[][] = new int[tamano][tamano];
        int suma[][] = new int [tamano][tamano];
        int multi[][] = new int [tamano][tamano];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                matriz1[i][j] = (int) (Math.random() * 10);
                matriz2[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("Matriz1");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                System.out.print(matriz1[i][j] + "\t");             
            }
            System.out.println("");
        }
        System.out.println("Matriz2");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                System.out.print(matriz2[i][j] + "\t");             
            }
            System.out.println("");
        }
        System.out.println("Suma de Matriz1 + Matriz2");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }   
        }
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                System.out.print(suma[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("Multiplicacion de Matriz1 X Matriz2");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                multi[i][j] = matriz1[i][j] * matriz2[i][j];
            }   
        }
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                System.out.print(multi[i][j] + "\t");
            }
            System.out.println("");           
        }
        
        
        

    }
}
/***
 * run:
 * Dame el tamano de las matrices: 3 
 * Matriz1
 * 5	1	4	 
 * 4	1	1	
 * 8	0	8	
 * Matriz2
 * 2	6	1	
 * 0	3	1	
 * 1	0	4	
 * Suma de Matriz1 + Matriz2
 * 7	7	5	
 * 4	4	2	
 * 9	0	12	
 * Multiplicacion de Matriz1 X Matriz2
 * 10	6	4	
 * 0	3	1	
 * 8	0	32	
 */