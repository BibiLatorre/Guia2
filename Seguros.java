import java.util.Scanner;

public class Seguros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double incremento = 0, total = 0;
        int cuota, condicion = 0;

        System.out.println("¿En cuál tipo de póliza está interesado?");
        System.out.println("1: Póliza de cobertura amplia");
        System.out.println("2: Póliza con cobertura a terceros");
        int tipo = entrada.nextInt();

        if (tipo == 1) {
            cuota = 1200;
        } else
            cuota = 950;

        System.out.println("Indica si cumples alguna de estas condiciones");
        System.out.println("1.¿Tienes el hábito de consumir alcohol?");
        System.out.println("2. ¿Usas lentes?");
        System.out.println("3.¿Padeces alguna enfermedad como deficiencia cardiaca o diabetes?");
        System.out.println("4.¿Tienes más de 40 años?");
        condicion= entrada.nextInt();

        switch (condicion) {
            case 1: {
                incremento = cuota * 0.10;
                total=cuota+incremento;
                break;
            }
            case 2: {
                incremento = cuota * 0.05;
                total=total+incremento;
                break;
            }
            case 3:
            case 4: {
                incremento = cuota * 0.1;
                total=total+incremento;
                break;
            }
        }
        total=total+cuota;
        System.out.println("El valor de su póliza es: $" + total);
    }
}