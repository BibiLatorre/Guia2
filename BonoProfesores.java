import java.util.Scanner;

public class BonoProfesores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int salariomin = 1000;
        int bono = 0;
        System.out.println("Digita tu puntaje");
        int puntaje = entrada.nextInt();
        System.out.println("Digita el monto de tu salario");
        int salario = entrada.nextInt();
        if (puntaje <= 100) {
            bono = salariomin;
        } else if (puntaje > 101 & puntaje <= 150) {
            bono = salariomin * 2;
        } else if (puntaje > 151) {
            bono = salariomin * 3;
        }
        System.out.printf("Por el puntaje de %d puntos, tienes un bono de: $%d \n",
                puntaje, bono);

        int pago = bono + salario;
        System.out.println("El pago este mes es de: $" + pago);
    }
}
