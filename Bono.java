import java.util.Scanner;

public class Bono {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int años,salario;
        double bono=0;
        System.out.println("Indica antigüedad en la empresa (en años)");
        años = entrada.nextInt();
        System.out.println("Digita tu salario mensual");
        salario = entrada.nextInt();
        if (años>=5){
            bono= (salario*0.30);
        } else if (salario<1000) {
            bono= (salario*0.25);
        } else if (años<5 & años>2) {
            bono= (salario*0.20);
        }else if (salario>100 & salario <=3500) {
            bono= (salario*0.15);
        } else if (salario>3500) {
            bono= (salario*0.10);

        }
        System.out.print("Tu bono es de:$"+bono);
    }
}
