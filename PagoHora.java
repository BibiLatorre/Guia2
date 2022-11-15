import java.util.Scanner;

public class PagoHora {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int VrHora=30;
        int pago=0;
        System.out.println("Ingresa el nombre del trabajador");
        String nombre = entrada.nextLine();
        System.out.println("Ingresa la cantidad de horas semanales trabajadas");
        int horas = entrada.nextInt();
        if (horas<40 ) {
            pago=horas*VrHora;
        } else {
            pago=horas*(VrHora*2);
        }
        System.out.printf("El sueldo semanal de %s es: $%d ",
                nombre, pago);

    }
}
