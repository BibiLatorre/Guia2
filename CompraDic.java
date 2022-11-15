import java.util.Scanner;

public class CompraDic {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite su ingreso de diciembre");
        int ingreso= entrada.nextInt();
        if (ingreso >=50){
            System.out.println("Puede comprar el paquete A que contiene: una televisión, un modular, tres pares de zapatos, cinco camisas y cinco pantalones");
        } else if (ingreso <50 & ingreso>=20) {
            System.out.println("Puede comprar el paquete B que contiene: una grabadora, tres pares de zapatos, cinco camisas y cinco pantalones.");
        } else if (ingreso <20 & ingreso >=10) {
            System.out.println("Puede comprar el paquete C que contiene: dos pares de zapatos, tres camisas y tres pantalones");
        } else if (ingreso<10) {
            System.out.println("Puede comprar el paquete D que contiene: un par de zapatos, dos camisas y dos pantalones.");

        }
    }
}
