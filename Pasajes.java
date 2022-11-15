import java.util.Scanner;

public class Pasajes {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digita el monto de tu presupuesto en pesos para los pasajes (ida y vuelta)");
        int presupuesto= entrada.nextInt();
        int VrKm =3000;
        int Mexico=750*VrKm;
        int PV=800*VrKm;
        int Acapulco=1200*VrKm;
        int Cancun=1800*VrKm;
        if (presupuesto>=Cancun){
            System.out.println("Presupuesto válido para pasajes ida y vuelta a Cancún");

        } else if (presupuesto>=Acapulco & presupuesto<Cancun) {
            System.out.println("Presupuesto válido para pasajes ida y vuelta a Acapulco");

        } else if (presupuesto>=PV & presupuesto<Acapulco) {
            System.out.println("Presupuesto válido para pasajes ida y vuelta a Puerto Vallarta");

        }else if (presupuesto>=Mexico & presupuesto<PV) {
            System.out.println("Presupuesto válido para pasajes ida y vuelta a México");
        }else {
            System.out.println("El presupuesto que ingresaste no alcanza a cubrir los trayectos que tenemos disponilbes");

        }

    }
}
