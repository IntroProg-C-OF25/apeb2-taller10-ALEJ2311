/***
 * El primer ciclo paralelo C, cuenta con 28 estudiantes, de los cuáles al finalizar el periodo, 
 * la Dirección de la carrera de Computación a solicitado las siguientes estadísticas de la materia INTRODUCCIÓN A LA PROGRAMACIÓN 
 * en función a los promedios por estudiante, dichos promedios se deben calcular (ponderar, ya que el docente ingresa todo sobre 10pts.) 
 * de 3 calificaciones (ACD que representa el 35% de la nota, APE del 35% y la nota del AA con un peso del 30%). 
 * En resumen, los requerimientos son los siguientes:

 * Registre los nombres de cada estudiante de dicho paralelo.
 * Genere aleatoriamente las notas ACD, APE, AA, para cada uno de los 28 estudiantes de 0-10 pts.
 * Calcule el promedio de cada uno de los estudiantes del paralelo dada la siguiente ponderación: ACD->35%, APE->35%, y el AA->30%.
 * Obtenga el promedio del curso, del paralelo C.
 * Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio por encima del promedio del curso.
 * Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio por debajo del promedio del curso.
 * Muestre el estudiante con su calificación, si es el del mayor promedio (el más alto de la clase).
 * Muestre el estudiante con su calificación, si es el del menor promedio (el más bajo de la clase).
 */
import java.util.Scanner;

public class Ejercicio3_PromediosC {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double promedios[][] = new double[28][3];
        String[] estudiantes = {"Juan", "Maria", "Jose", "Ana", "Carlos", "Rosa", "Luis", "Carmen", "Pedro", "Lucia", "Jorge",
            "Sofia", "Andres", "Gabriela", "Diego", "Daniela", "Miguel", "Elena", "David", "Valeria", "Sebastian", "Fernanda", "Ricardo", "Adriana", "Angel", "Paola", "Kevin", "Natalia"};
        double sumNotas = 0;
        double notas[] = new double[28];
        double promCurso;
        for (int i = 0; i < promedios.length; i++) {
            promedios[i][0] = Math.random() * 10; //ACD
            promedios[i][1] = Math.random() * 10; //APE
            promedios[i][2] = Math.random() * 10; //AA

            notas[i] = (promedios[i][0] * 0.35) + (promedios[i][1] * 0.35) + (promedios[i][2] * 0.30);
            sumNotas += notas[i];
        }
        double promAlto = notas[0], promBajo = notas[0];
        String bestProm = null, badProm = null;
        promCurso = sumNotas / 28;
        System.out.println("Promedio del curso C: " + promCurso + "\n");

        System.out.println("ESTUDIANTES CON PROMEDIO POR ENCIMA DEL CURSO:");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > promCurso) {
                System.out.println("Estudiante: " + estudiantes[i] + " promedio: " + notas[i]);
            }
        }
        System.out.println("");
        System.out.println("ESTUDIANTES CON PROMEDIO DEBAJO DEL CURSO");
        for (int i = 0; i < 10; i++) {
            if (notas[i] < promCurso) {
                System.out.println("Estudiante: " + estudiantes[i] + " promedio: " + notas[i]);
            }
        }
        for (int i = 0; i < 10; i++) {
            if (promAlto < notas[i]) {
                promAlto = notas[i];
                bestProm = estudiantes[i];
            }
            if (promBajo > notas[i]) {
                promBajo = notas[i];
                badProm = estudiantes[i];
            }
        }
        System.out.println("");
        System.out.println("MEJOR ESTUDIANTE: ");
        System.out.println(bestProm + " promedio: " + promAlto);
        System.out.println("PEOR ESTUDIANTES: ");
        System.out.println(badProm + " promedio: " + promBajo);

    }

}
/***
 * Promedio del curso C: 5.551313195908729

 * ESTUDIANTES CON PROMEDIO POR ENCIMA DEL CURSO:
 * Estudiante: Juan promedio: 7.5394435716157595
 * Estudiante: Jose promedio: 6.496510013520317
 * Estudiante: Carlos promedio: 7.97369014780813
 * Estudiante: Jorge promedio: 7.992395427633289
 * Estudiante: Andres promedio: 6.290970497898753
 * Estudiante: Daniela promedio: 7.0548781865628625
 *Estudiante: Miguel promedio: 6.335740165021934
 * Estudiante: Elena promedio: 9.450370324587954
 * Estudiante: Valeria promedio: 7.044294220424089
 * Estudiante: Sebastian promedio: 6.105890545367979
 * Estudiante: Fernanda promedio: 5.679831480666081
 * Estudiante: Ricardo promedio: 8.303884724004847
 * Estudiante: Angel promedio: 6.5727156233235
 * Estudiante: Natalia promedio: 6.936008305998408

 * ESTUDIANTES CON PROMEDIO DEBAJO DEL CURSO
 * Estudiante: Maria promedio: 5.548396238767942
 * Estudiante: Ana promedio: 2.8175241892253924
 * Estudiante: Rosa promedio: 4.165466655788969
 * Estudiante: Luis promedio: 5.280085364825613
 * Estudiante: Carmen promedio: 2.9237655497206276
 * Estudiante: Pedro promedio: 1.88086147071685
 * Estudiante: Lucia promedio: 4.878033240403291

 * MEJOR ESTUDIANTE: 
 * Carlos promedio: 7.97369014780813
 * PEOR ESTUDIANTES: 
 * Pedro promedio: 1.88086147071685
 */