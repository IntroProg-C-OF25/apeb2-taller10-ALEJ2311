/***
 * Crea un programa que gestione el inventario de una tienda. 
 * Utiliza una matriz bidimensional para almacenar los productos disponibles en la tienda, con información como 
 * nombre, precio y cantidad. 
 * El programa debe permitir agregar nuevos productos, actualizar existencias, buscar productos y eliminarlos.
 * @author Jesus Rivas
 */

import java.util.Scanner;

public class Ejercicio4_InventarioTienda {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int filas = 5, numero, cont = 0;
        String tienda[][] = new String [filas][3];
        String  nombre, precio, cantidad, productActua, productBuscar, productDelet;
        boolean actualizar = false, buscar = false, eliminar = false;
        
        do{
            System.out.println("----- INVENTARIO :D -----");
            System.out.println("1. MOSTRAR PRODUCTOS");
            System.out.println("2. AGREGAR PRODUCTO");
            System.out.println("3. ACTUALIZAR PRODUCTO");
            System.out.println("4. BUSCAR PRODUCTO");
            System.out.println("5. ELIMINAR PRODUCTO");
            System.out.println("6. SALIR");
            System.out.print("ESCOJA UNA OPCION: ");
            numero = tcl.nextInt();
            switch(numero){
                case 1: 
                    for (int i = 0; i < tienda.length; i++) {
                        if(tienda[i][0] == null){
                            System.out.println("ESPACIO RESTANTE: " + (filas - i) + "\n");
                            break;
                        }else{
                            System.out.println("Nombre: " + tienda[i][0] + ", Precio: " + tienda[i][1] + ", Cantidad: " + tienda[i][2]);
                        }                         
                    }
                    break;
                case 2:
                    if(cont < filas){
                        System.out.print("Nombre del producto: ");
                        nombre = tcl.next();
                        System.out.print("Precio: ");
                        precio = tcl.next();
                        System.out.print("Cantidad: ");
                        cantidad = tcl.next();
                        
                        tienda[cont][0] = nombre;
                        tienda[cont][1] = precio;
                        tienda[cont][2] = cantidad;
                        System.out.println("PRODUCTO AGREGADO");
                        cont++;
                    }else{
                        System.out.println("ERROR!! INVENTARIO LLENO");
                    }
                    System.out.println("");
                    break;
                case 3:
                    System.out.print("NOMBRE DE PRODUCTO QUE DESEA ACTUALIZAR: ");
                    productActua = tcl.next();
                    for (int i = 0; i < tienda.length; i++) {
                        if(productActua.equalsIgnoreCase(tienda[i][0])){
                            System.out.print("INGRESE LA NUEVA CANTIDAD: ");
                            cantidad = tcl.next();
                            tienda[i][2] = cantidad;
                            System.out.println("PRODUCTO ACTUALIZADO CON EXITO");
                            actualizar = true;
                            break;
                        }
                                                    
                    }
                    if(actualizar == false){
                        System.out.println("PRODUCTO NO ENCONTRADO");
                    }
                    System.out.println("");
                    break;
                case 4: 
                    System.out.print("NOMBRE DE PRODUCTO QUE DESA BUSCAR: ");
                    productBuscar = tcl.next();
                    for (int i = 0; i < tienda.length; i++) {
                        if(productBuscar.equalsIgnoreCase(tienda[i][0])){
                            System.out.println("Nombre: " + tienda[i][0] + ", Precio: " + tienda[i][1] + ", Cantidad: " + tienda[i][2]);
                            buscar = true;
                            break;
                        }
                    }
                    if(buscar == false){
                        System.out.println("PRODUCTO NO ENCONTRADO");
                    }
                    System.out.println("");
                    break;
                case 5:
                    System.out.print("NOMBRE DEL PRODUCTO QUE DESEA ELIMINAR: ");
                    productDelet = tcl.next();
                    for (int i = 0; i < tienda.length; i++) {
                        if(productDelet.equalsIgnoreCase(tienda[i][0])){
                            tienda[i][0] = null;
                            tienda[i][1] = null;
                            tienda[i][2] = null;
                            System.out.println("PRODUCTO ELIMINADO");
                            eliminar = true;
                        }
                    }
                    if(eliminar == false){
                        System.out.println("PRODCUTO NO ENCONTRADO");
                    }
                    break;
                case 6:
                    System.out.println("SALIENDO DEL SISTEMA");
                    break;
                default:
                    System.out.println("ERROR!!");
            }
        }while(numero != 6);
    }
    
}
/***
 * run:
 * ----- INVENTARIO :D -----
 * 1. MOSTRAR PRODUCTOS
 * 2. AGREGAR PRODUCTO
 * 3. ACTUALIZAR PRODUCTO
 * 4. BUSCAR PRODUCTO
 * 5. ELIMINAR PRODUCTO
 * 6. SALIR
 * ESCOJA UNA OPCION: 1
 * ESPACIO RESTANTE: 5

 * ----- INVENTARIO :D -----
 * 1. MOSTRAR PRODUCTOS
 * 2. AGREGAR PRODUCTO
 * 3. ACTUALIZAR PRODUCTO
 * 4. BUSCAR PRODUCTO
 * 5. ELIMINAR PRODUCTO
 * 6. SALIR
 * ESCOJA UNA OPCION: 2
 * Nombre del producto: Pera
 * Precio: 12
 * Cantidad: 5
 * PRODUCTO AGREGADO

 * ----- INVENTARIO :D -----
 * 1. MOSTRAR PRODUCTOS
 * 2. AGREGAR PRODUCTO
 * 3. ACTUALIZAR PRODUCTO
 * 4. BUSCAR PRODUCTO
 * 5. ELIMINAR PRODUCTO
 * 6. SALIR
 * ESCOJA UNA OPCION: 3
 * NOMBRE DE PRODUCTO QUE DESEA ACTUALIZAR: pera
 * INGRESE LA NUEVA CANTIDAD: 7
 * PRODUCTO ACTUALIZADO CON EXITO

 * ----- INVENTARIO :D -----
 * 1. MOSTRAR PRODUCTOS
 * 2. AGREGAR PRODUCTO
 * 3. ACTUALIZAR PRODUCTO
 * 4. BUSCAR PRODUCTO
 * 5. ELIMINAR PRODUCTO
 * 6. SALIR
 * ESCOJA UNA OPCION: 1
 * Nombre: Pera, Precio: 12, Cantidad: 7
 * ESPACIO RESTANTE: 4

 * ----- INVENTARIO :D -----
 * 1. MOSTRAR PRODUCTOS
 * 2. AGREGAR PRODUCTO
 * 3. ACTUALIZAR PRODUCTO
 * 4. BUSCAR PRODUCTO
 * 5. ELIMINAR PRODUCTO
 * 6. SALIR
 * ESCOJA UNA OPCION: 4
 * NOMBRE DE PRODUCTO QUE DESA BUSCAR: pera
 * Nombre: Pera, Precio: 12, Cantidad: 7

 * ----- INVENTARIO :D -----
 * 1. MOSTRAR PRODUCTOS
 * 2. AGREGAR PRODUCTO
 * 3. ACTUALIZAR PRODUCTO
 * 4. BUSCAR PRODUCTO
 * 5. ELIMINAR PRODUCTO
 * 6. SALIR
 * ESCOJA UNA OPCION: 5
 * NOMBRE DEL PRODUCTO QUE DESEA ELIMINAR: pera
 * PRODUCTO ELIMINADO
 * ----- INVENTARIO :D -----
 * 1. MOSTRAR PRODUCTOS
 * 2. AGREGAR PRODUCTO
 * 3. ACTUALIZAR PRODUCTO
 * 4. BUSCAR PRODUCTO
 * 5. ELIMINAR PRODUCTO
 * 6. SALIR
 * ESCOJA UNA OPCION: 1
 * ESPACIO RESTANTE: 5

 * ----- INVENTARIO :D -----
 * 1. MOSTRAR PRODUCTOS
 * 2. AGREGAR PRODUCTO
 * 3. ACTUALIZAR PRODUCTO
 * 4. BUSCAR PRODUCTO
 * 5. ELIMINAR PRODUCTO
 * 6. SALIR
 * ESCOJA UNA OPCION: 6
 * SALIENDO DEL SISTEMA
 */