import java.util.Scanner;

public class BonoAños {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa antigüedad en años ");
        int años = entrada.nextInt();
        if (años>=5){
            System.out.printf("El bono asignado para %d años es $1000",
                    años);
        }else {
            System.out.printf("El bono asignado para %d años es $"+años*100,
                    años);
        }

    }
}
