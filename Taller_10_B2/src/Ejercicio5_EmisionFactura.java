/***
 * Crea un programa que gestione el inventario de una tienda, así como la emisión de facturas. 
 * Utiliza una matriz bidimensional para almacenar los productos disponibles en la tienda, 
 * con información como nombre, precio y cantidad. El programa debe permitir facturar un producto 
 * dado su código, y unidades deseadas. Adicional se debe agregar a la factura al 15% del IVA, y 
 * si la compra superar los $100, se debe aplicar un descuento.
 * Nota: Considere la alternativa de inexistencias en Stop, para el caso, muestre la alerta respectiva.
 * @author Jesus Rivas
 */

import java.util.Scanner;

public class Ejercicio5_EmisionFactura {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String stocks[][] = {
            {"345", "Vaso", "20.45", "20"},
            {"876", "Radio", "15.50", "15"},
            {"123", "Mouse", "6.50", "10"},
            {"093", "Laptop", "55.75", "8"},
            {"402", "Toalla", "7.75", "12"}
        };
        int numero, cantidadS, cantidadD;
        String codeProduct;
        boolean findCode = false;
        double price, subtotal, iva, total, descuento;
  
        do {
            System.out.println("-----TIENDA DE CONVENIENCIA-----");
            System.out.println("1. FACTURAR");
            System.out.println("2. MOSTRAR INVENTARIO");
            System.out.println("3. SALIR");
            System.out.print("SELECCIONE UNA OPCION: ");
            numero = tcl.nextInt();
            switch (numero) {
                case 1:
                    System.out.print("INGRESE EL CODIGO DEL PRODUCTO: ");
                    codeProduct = tcl.next();
                    for (int i = 0; i < stocks.length; i++) {
                        if (codeProduct.equalsIgnoreCase(stocks[i][0])) {
                            System.out.println("----DESCRIPCION DE PRODUCTO----");
                            System.out.println("Nombre: " + stocks[i][1]);
                            System.out.println("Precio: $" + stocks[i][2]);
                            System.out.println("Cantidad: " + stocks[i][3]);
                            System.out.print("INGRESE LA CANTIDAD QUE DESA ADQUIRIR: ");
                            cantidadS = tcl.nextInt();
                            findCode = true;
                            cantidadD = Integer.parseInt(stocks[i][3]);
                            if (cantidadS > cantidadD) {
                                System.out.println("UNIDADES INSUFICIENTES");
                            } else {
                                price = Double.parseDouble(stocks[i][2]);
                                subtotal = price * cantidadS;
                                iva = subtotal * 0.15;
                                total = subtotal + iva;
                                if (total > 100) {
                                    descuento = total * 0.10;
                                    total -= descuento;
                                    System.out.println("POR SU COMPRA SUPERIOR A $100 RECIBE 10% DE DESCUENTO: " + descuento);
                                }
                                System.out.println("----FACTURA----");
                                System.out.println("PRODUCTO: " + stocks[i][1]);
                                System.out.println("CANTIDAD: " + cantidadS);
                                System.out.println("SUBTOTAL: " + subtotal);
                                System.out.println("IVA: " + iva);
                                System.out.println("TOTAL: " + total);

                                stocks[i][3] = String.valueOf(cantidadD - cantidadS);
                            }
                        }
                        
                    }
                    if (findCode == false) {
                        System.out.println("ERROR!! PRODUCTO NO ENCONTRADO");
                    }
                    break;
                case 2:
                    System.out.println("----STOCK----");
                    for (int i = 0; i < stocks.length; i++) {
                        System.out.println("Codigo: " + stocks[i][0] + " Nombre: " + stocks[i][1] + " Precio: " + stocks[i][2] + " Cantidad: " + stocks[i][3]);
                    }
                    break;
                case 3:
                    System.out.println("----SALIENDO DEL SISTEMA----");
                    break;
                default:
                    System.out.println("ERROR!! OPCION INEXISTENTE");
            }

        } while (numero != 3);
    }

}
/***
 * run:
 * -----TIENDA DE CONVENIENCIA-----
 * 1. FACTURAR
 * 2. MOSTRAR INVENTARIO
 * 3. SALIR
 * SELECCIONE UNA OPCION: 2
 * ----STOCK----
 * Codigo: 345 Nombre: Vaso Precio: 20.45 Cantidad: 20
 * Codigo: 876 Nombre: Radio Precio: 15.50 Cantidad: 15
 * Codigo: 123 Nombre: Mouse Precio: 6.50 Cantidad: 10
 * Codigo: 093 Nombre: Laptop Precio: 55.75 Cantidad: 8
 * Codigo: 402 Nombre: Toalla Precio: 7.75 Cantidad: 12
 * -----TIENDA DE CONVENIENCIA-----
 * 1. FACTURAR
 * 2. MOSTRAR INVENTARIO
 * 3. SALIR
 * SELECCIONE UNA OPCION: 1
 * INGRESE EL CODIGO DEL PRODUCTO: 876
 * ----DESCRIPCION DE PRODUCTO----
 * Nombre: Radio
 * Precio: $15.50
 * Cantidad: 15
 * INGRESE LA CANTIDAD QUE DESA ADQUIRIR: 10
 * POR SU COMPRA SUPERIOR A $100 RECIBE 10% DE DESCUENTO: 17.825
 * ----FACTURA----
 * PRODUCTO: Radio
 * CANTIDAD: 10
 * SUBTOTAL: 155.0
 * IVA: 23.25
 * TOTAL: 160.425
 * -----TIENDA DE CONVENIENCIA-----
 * 1. FACTURAR
 * 2. MOSTRAR INVENTARIO
 * 3. SALIR
 * SELECCIONE UNA OPCION: 2
 * ----STOCK----
 * Codigo: 345 Nombre: Vaso Precio: 20.45 Cantidad: 20
 * Codigo: 876 Nombre: Radio Precio: 15.50 Cantidad: 5
 * Codigo: 123 Nombre: Mouse Precio: 6.50 Cantidad: 10
 * Codigo: 093 Nombre: Laptop Precio: 55.75 Cantidad: 8
 * Codigo: 402 Nombre: Toalla Precio: 7.75 Cantidad: 12
 * -----TIENDA DE CONVENIENCIA-----
 * 1. FACTURAR
 * 2. MOSTRAR INVENTARIO
 * 3. SALIR
 * SELECCIONE UNA OPCION: 3
 * ----SALIENDO DEL SISTEMA----
 */
