import java.io.PrintStream;
import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double valor, descuento;
        int costo;
        System.out.println("Digita el valor del artículo");
        costo= entrada.nextInt();
        if (costo>200) {
            valor =costo*0.85;
        }else if (costo>100 & costo<=200){
            valor=costo*0.88;
        }else {
            valor=costo*0.9;
        }
        descuento=costo-valor;
        System.out.println("El descuento para esta compra es: $" +descuento + " El valor a pagar es: $"+valor);


    }
}
