import java.util.Scanner;

public class Calificación {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        System.out.println("Digita la nota en números");
        int Nota = entrada.nextInt();
        char N=0;
        if (Nota == 10){
            N='A';
        } else if (Nota==9) {
            N='B';
        } else if (Nota==8) {
            N= 'C';
        } else if (Nota==7 & Nota== 6) {
            N= 'D';
        } else if (Nota<=5) {
            N= 'F';

        }
        System.out.printf("%d = %c",
                Nota, N);

    }
}
