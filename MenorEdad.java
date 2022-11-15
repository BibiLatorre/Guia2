import java.util.Scanner;

public class MenorEdad {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        String nombre1, nombre2, nombre3;
        int edad1, edad2, edad3;
        System.out.println("Escribe el primer nombre");
        nombre1 = entrada.nextLine();
        System.out.println("Digita la edad");
        edad1 = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Escribe el segundo nombre");
        nombre2 = entrada.nextLine();
        System.out.println("Digita la edad");
        edad2 = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Escribe el tercer nombre");
        nombre3 = entrada.nextLine();
        System.out.println("Digita la edad");
        edad3 = entrada.nextInt();
        if (edad1<edad2) {
            if (edad1<edad3) {
                System.out.println("La persona de menor edad es "+nombre1+ " con "+edad1+" años");
            }
        }else if (edad2<edad3) {
            System.out.println("La persona de menor edad es "+nombre2+ " con " +edad2+ " años");
        }else {
            System.out.println("La persona de menor edad es "+nombre3+ " con " +edad3+ " años");
        }
    }
}
