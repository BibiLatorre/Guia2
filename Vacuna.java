import java.util.Scanner;

public class Vacuna {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int sexo;
        System.out.println("Indica tu edad");
        int edad = entrada.nextInt();
        if (edad > 70) {
            System.out.println("Te corresponde la vacuna C");
        } else if (edad < 16) {
            System.out.println("Te corresponde la vacuna A");
        } else {
            System.out.println("Especifica tu sexo digitando 1 para mujer y 2 para hombre");
            sexo = entrada.nextInt();
            if (edad > 16 & edad < 69) {
                if (sexo == 1) {
                    System.out.println("Te corresponde la vacuna B");
                } else if (sexo==2) {
                    System.out.println("Te corresponde la vacuna A");
                }
            }

        }
    }
}
