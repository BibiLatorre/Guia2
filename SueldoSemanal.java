import java.util.Scanner;

public class SueldoSemanal {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int VrHora=30000;
        System.out.println("Digita cantidad de horas semanales trabajadas");
        int HoraT = entrada.nextInt();
        int pago=VrHora*HoraT;
        int pagoT=0;
        if (HoraT>41 &HoraT<45){
            pagoT=pago*2;
        } else if (HoraT>46 &HoraT<50) {
            pagoT=pago*3;
        }else if (HoraT>=50) {
            System.out.println("Excede el máximo de horas semanales permitidas");
        }else if (HoraT<41){
            pagoT=pago;
        }
        System.out.printf("El valor a pagar por %d horas es:$"+pagoT,
                HoraT);
    }
}
