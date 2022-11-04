import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numero;
        int resto;
        System.out.print("Introdueïx el DNI: ");
        numero = scn.nextInt();
        resto = numero%23;
        System.out.print(resto);


        char [] letra_DNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
                'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        System.out.println(letra_DNI[resto]);
    }
}
