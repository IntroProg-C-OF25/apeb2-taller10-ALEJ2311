/***
 * Crea un juego de tres en raya utilizando una matriz bidimensional de 3x3. 
 * Permita a dos jugadores marcar sus movimientos alternativamente. El juego debe 
 * verificar si alguno de los jugadores ha ganado o si hay un empate.
 * @author Jesus Rivas
 */

import java.util.Scanner;

public class Ejercicio6_TresEnRaya {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int cont = 1, fila = 3, columna = 3;
        String tresRaya[][] = new String[fila][columna];
        String juego, player = "[X]";
        boolean start = false, game = true, empate = true;
        System.out.println("BEINVENIDO AL JUEGO DE TRES EN RAYA");
        do {
            System.out.println("Put R to start: ");
            juego = tcl.next();
            if (juego.equalsIgnoreCase("R")) {
                start = true;
            }

        } while (start == false);
        System.out.println("EMPECEMOS!!");
        System.out.println("PLAYER 1 = X");
        System.out.println("PLAYER 2 = O");
        for (int i = 0; i < tresRaya.length; i++) {
            for (int j = 0; j < tresRaya[0].length; j++) {
                tresRaya[i][j] = "[ ]";
            }
        }
        while (game) {
            for (int i = 0; i < tresRaya.length; i++) {
                for (int j = 0; j < tresRaya[0].length; j++) {
                    System.out.print(tresRaya[i][j] + "\t");
                }
                System.out.println("");
            }
            player = (cont == 1) ? "[X]" : "[O]";
            System.out.println("TURNO DE PLAYER " + cont + " (" + player + ")");
            System.out.print("Ingrese la fila [0-2]: ");
            fila = tcl.nextInt();
            System.out.print("Ingrese la columna [0-2]: ");
            columna = tcl.nextInt();
            if (fila >= 0 && columna >= 0 & fila < 3 && columna < 3 && tresRaya[fila][columna].equals("[ ]")) {
                tresRaya[fila][columna] = player;
                if ((tresRaya[fila][0].equals(player) && tresRaya[fila][1].equals(player) && tresRaya[fila][2].equals(player))
                        || (tresRaya[0][columna].equals(player) && tresRaya[1][columna].equals(player) && tresRaya[2][columna].equals(player))
                        || (tresRaya[0][0].equals(player) && tresRaya[1][1].equals(player) && tresRaya[2][2].equals(player))
                        || (tresRaya[0][2].equals(player) && tresRaya[1][1].equals(player) && tresRaya[2][0].equals(player))) {
                    System.out.println("FELCIDADES JUGADOR " + cont + " GANASTE!!!");
                    game = false;
                } else {
                    for (int i = 0; i < tresRaya.length; i++) {
                        for (int j = 0; j < tresRaya[0].length; j++) {
                            if (tresRaya[i][j].equals("[ ]")) {
                                empate = false;
                                break;
                            }
                        }
                    }
                }
                if (empate) {
                    System.out.println("EMPATE!!");
                    game = false;
                } else {
                    cont = (cont == 1) ? 2 : 1;
                }
            } else {
                System.out.println("Movimiento Ilegal");
            }
           
        }
        for (int i = 0; i < tresRaya.length; i++) {
                for (int j = 0; j < tresRaya[0].length; j++) {
                    System.out.print(tresRaya[i][j] + "\t");
                }
                System.out.println("");
            }
        System.out.println("¡¡GAME OVER!!");
    }

}
/***
 * BEINVENIDO AL JUEGO DE TRES EN RAYA
 * Put R to start: 
 * r
 * EMPECEMOS!!
 * PLAYER 1 = X
 * PLAYER 2 = O
 * [ ]	[ ]	[ ]	
 * [ ]	[ ]	[ ]	
 * [ ]	[ ]	[ ]	
 * TURNO DE PLAYER 1 ([X])
 * Ingrese la fila [0-2]: 0
 * Ingrese la columna [0-2]: 1
 * [ ]	[X]	[ ]	
 * [ ]	[ ]	[ ]	
 * [ ]	[ ]	[ ]	
 * TURNO DE PLAYER 2 ([O])
 * Ingrese la fila [0-2]: 0
 * Ingrese la columna [0-2]: 0
 * [O]	[X]	[ ]	
 * [ ]	[ ]	[ ]	
 * [ ]	[ ]	[ ]	
 * TURNO DE PLAYER 1 ([X])
 * Ingrese la fila [0-2]: 1
 * Ingrese la columna [0-2]: 1
 * [O]	[X]	[ ]	
 * [ ]	[X]	[ ]	
 * [ ]	[ ]	[ ]	
 * TURNO DE PLAYER 2 ([O])
 * Ingrese la fila [0-2]: 1
 * Ingrese la columna [0-2]: 0
 * [O]	[X]	[ ]	
 * [O]	[X]	[ ]	
 * [ ]	[ ]	[ ]	
 * TURNO DE PLAYER 1 ([X])
 * Ingrese la fila [0-2]: 2
 * Ingrese la columna [0-2]: 2
 * [O]	[X]	[ ]	
 * [O]	[X]	[ ]	
 * [ ]	[ ]	[X]	
 * TURNO DE PLAYER 2 ([O])
 * Ingrese la fila [0-2]: 3
 * Ingrese la columna [0-2]: 3
 * Movimiento Incorrecto
 * [O]	[X]	[ ]	
 * [O]	[X]	[ ]	
 * [ ]	[ ]	[X]	
 * TURNO DE PLAYER 2 ([O])
 * Ingrese la fila [0-2]: 2
 * Ingrese la columna [0-2]: 2
 * Movimiento Incorrecto
 * [O]	[X]	[ ]	
 * [O]	[X]	[ ]	
 * [ ]	[ ]	[X]	
 * TURNO DE PLAYER 2 ([O])
 * Ingrese la fila [0-2]: 1
 * Ingrese la columna [0-2]: 1
 * Movimiento Incorrecto
 * [O]	[X]	[ ]	
 * [O]	[X]	[ ]	
 * [ ]	[ ]	[X]	
 * TURNO DE PLAYER 2 ([O])
 * Ingrese la fila [0-2]: 0
 * Ingrese la columna [0-2]: 2
 * [O]	[X]	[O]	
 * [O]	[X]	[ ]	
 * [ ]	[ ]	[X]	
 * TURNO DE PLAYER 1 ([X])
 * Ingrese la fila [0-2]: 2
 * Ingrese la columna [0-2]: 1
 * FELCIDADES JUGADOR 1 GANASTE!!!
 * [O]	[X]	[O]	
 * [O]	[X]	[ ]	
 * [ ]	[X]	[X]	
 * ��GAME OVER!!
 */
