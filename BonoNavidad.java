import java.util.Scanner;

public class BonoNavidad {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        double bono=0;
        System.out.println("Indique su antigüedad en la empresa en años");
        int tiempo= entrada.nextInt();
        System.out.println("Digite el monto de su salario mensual");
        int salario= entrada.nextInt();
        if (tiempo>=4 || salario<=2000){
            bono=salario*0.25;
        }else {
            bono=salario*0.2;
            }
        System.out.println("Le corresponde un bono de navidad por $"+bono);
        }

}
