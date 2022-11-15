import java.util.Scanner;

public class Votaciones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digita tu edad");
        int edad= entrada.nextInt();
        if (edad<18) {
            System.out.println("No estás habilitada para votar");
        } else {
            System.out.println("Documento habilitado para votar");
        }

    }
}
