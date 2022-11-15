import java.util.Scanner;

public class Pantalones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int VrMetro = 500, n = 0, talla;
        double ganancia, costo = 0, mo = 0, incremento = 0, suma, Valor, tipo1 = 0, tipo2 = 0;
        System.out.println("Digite cantidad de pantalones vendidos");
        int cantidad = entrada.nextInt();
        int tipo;

        while (n < cantidad) {
            System.out.println("Especifique tipo de diseño (1 o 2)");
            tipo = entrada.nextInt();
            System.out.println("Ingrese la talla");
            talla = entrada.nextInt();
            if (tipo == 1) {
                costo = VrMetro * 1.5;
                mo = costo * 0.8;
                if (talla == 32 || talla == 36) {
                    incremento = costo * 0.04;
                } else if (talla<32) {

                }
                tipo1 = costo + mo + incremento;
            } else if (tipo == 2) {
                costo = VrMetro * 1.8;
                mo = costo * 0.95;
                if (talla == 32 || talla == 36) {
                    incremento = costo * 0.04;
                }
                tipo2 = costo + mo + incremento;

            } n = n + 1;
            System.out.println("Cantidad de pantalones vendidos: " + n);
            System.out.println("Precio de venta Tipo 1: $"+tipo1*1.3);
            System.out.println("Precio de venta Tipo 2: $"+tipo2*1.3);
        }
                suma = costo + mo + incremento;
                Valor = suma * 1.3;
                ganancia = Valor - suma;

               // System.out.println("El precio final de venta para los pantalones tipo 1 vendidos es: $" + tipo1*1.3);
               // System.out.println("El precio final de venta para los patanlones tipo 2 vendidos es: $" + tipo2*1.3);
        System.out.println("Valor total de ventas: $" + n * Valor);
        System.out.println("La ganancia total es de: $" + n * ganancia);
            }
        }

