import java.util.Scanner;

public class Becas {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        int edad;
        float nota;
        System.out.println("Digita tu edad");
        edad= entrada.nextInt();
        System.out.println("Ingresa la nota de tu promedio");
        nota= entrada.nextFloat();
        if (edad > 18){
            if (nota>=9){
                System.out.println("Tienes una beca asignada de $2.000");
            } else if (nota<9 & nota>=7.5) {
                System.out.println("Tienes una beca asignada de $1.000");

            } else if (nota<7.5 & nota>=6) {
                System.out.println("Tienes una beca asignada de $500");
                
            } else if (nota<6) {
                System.out.println("Te invitamos a mejorar tu promedio para acceder a una de las becas disponibles");

            }
        }else {
            if (nota>=9) {
                System.out.println("Tienes una beca asignada de $3.000");
            } else if (nota<9 & nota>=8) {
                System.out.println("Tienes una beca asignada de $2.000");

            } else if (nota<8 & nota>=6) {
                System.out.println("Tienes una beca asignada de $1.000");

            } else if (nota<6) {
                System.out.println("Te invitamos a mejorar tu promedio para acceder a una de las becas disponibles");

            }
        }
    }
}
