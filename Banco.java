import java.util.Scanner;
import java.util.SortedMap;

public class Banco {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int saldo1=1000, compras=500, pagoCorte=200;
        double SaldoActual, PagoMin, PSI;
        SaldoActual=(saldo1+compras)-pagoCorte;
        PagoMin=SaldoActual*0.15;
        PSI=(SaldoActual*0.85)+200;
        System.out.println("El saldo actual es: $"+SaldoActual);
        System.out.println("El pago mínimo es: $"+PagoMin);
        System.out.println("El pago sin intereses es: $"+PSI);
    }
}
