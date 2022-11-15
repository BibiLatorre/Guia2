import java.util.Scanner;

public class Regalo {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("¿Cuál es tu presupuesto para comprar el regalo?");
        int presupuesto = entrada.nextInt();
        if (presupuesto <=10) {
            System.out.println("El regalo disponible para tu presupuesto es una tarjeta");
        }else if (presupuesto >10 & presupuesto <=100) {
            System.out.println("El regalo disponible para tu presupuesto es una caja de chocolates");

        } else if (presupuesto>100 & presupuesto<=250) {
            System.out.println("El regalo disponible para tu presupuesto es un arreglo de flores");
        } else if (presupuesto>250) {
            System.out.println("El regalo disponible para tu presupuesto es un anillo");

        }

    }
}
