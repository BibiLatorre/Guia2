
import java.util.Scanner;

public class seguros2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double incremento = 0, total = 0, contador=0, C1, C2, C3, C4, Vtotal;
        int cuota;
        System.out.println("¿Cuál tipo de póliza te interesa?");
        System.out.println("1: Póliza de cobertura amplia");
        System.out.println("2: Póliza con cobertura a terceros");
        int tipo = entrada.nextInt();
        if (tipo == 1) {
            cuota = 1200;
        } else
            cuota = 950;
        System.out.println("Indica si cumples alguna de estas condiciones, marcando 1 para si y 2 para no");
        System.out.println("1.¿Tienes el hábito de consumir alcohol?");
        C1 = entrada.nextInt();
        if (C1==1){
            incremento=cuota*0.10;
        } else if (C1==2) {
            incremento=0;
        }
        total=total+incremento;
        System.out.println("2. ¿Usas lentes?");
        C2 = entrada.nextInt();
        if (C2==1){
            incremento=cuota*0.05;
        } else if (C2==2){
            incremento=0;
        }
        total=total+incremento;
        System.out.println("3.¿Padeces alguna enfermedad como deficiencia cardiaca o diabetes?");
        C3 = entrada.nextInt();
        if (C3==1) {
            incremento = cuota * 0.1;
        } else if (C3==2) {
            incremento =0;
        }
        total=total+incremento;
        System.out.println("4.¿Tienes más de 40 años?");
        C4 = entrada.nextInt();
        if (C4==1){
            incremento=cuota*0.1;
        }else if (C4==2){
            incremento=0;
        }
        total=total+incremento;
        Vtotal=total+cuota;
        System.out.println("El valor total de la póliza es: $"+Vtotal);
}
}