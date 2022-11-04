import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner scn = new Scanner(System.in);
        int mes_grans = 0;
        int mes_petits = 0;
        int igual = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introdueix un número: ");
            Scanner declaració_Números = new Scanner(System.in);
            numeros[i] = declaració_Números.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                System.out.println("El número "+numeros[i]+" és més gran que 0. ");
                mes_grans++;
            } else if (numeros[i] < 0) {
                System.out.println("El número "+numeros[i]+" és més petit que 0. ");
                mes_petits++;
            } else  if (numeros[i] == 0) {
                System.out.println("El número " + numeros[i] + " és igual que 0. ");
                igual++;


            }
                System.out.println();
                System.out.println("RECOMPTE DE NÚMEROS");
                System.out.println();
                System.out.println("Hi ha "+mes_grans+ " números més grans que 0.");
                System.out.println("Hi ha "+mes_petits+ " números més petits que 0.");
                System.out.println("Hi ha "+igual+ " números iguals que 0.");

        }
    }
}