import java.util.Scanner;

public class ViajeEstudio {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        System.out.println("Ingresa cantidad de estudiantes");
        int estudiantes = entrada.nextInt();
        if (estudiantes>=100){
            System.out.println("El costo del pasaje es de $20 por cada estudiante");
        }else if (estudiantes>50 & estudiantes<100){
            System.out.println("El costo del pasaje es de $35 por cada estudiante");
        }else if (estudiantes>20 & estudiantes<49){
            System.out.println("El costo del pasaje es de $40 por cada estudiante");
        }else if (estudiantes<20) {
            System.out.println("El costo del pasaje es de $70 por cada estudiante");

        }
    }
}
