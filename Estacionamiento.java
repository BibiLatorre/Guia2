import java.util.Scanner;

public class Estacionamiento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int pago=0;
        int horas=0;
        System.out.println("Ingresa horas de parqueo");
        horas= entrada.nextInt();
        if (horas <= 2){
            pago=horas*5;
        }else if (horas>=3 & horas<5) {
            pago=horas*4;
        } else if (horas>=5 & horas<10) {
            pago=horas*3;
            
        }else {
            pago=horas*2;
        }
        System.out.printf("El valor a pagar por %d horas de estacionamiento, es de:$%d",
                horas, pago);

    }

}
