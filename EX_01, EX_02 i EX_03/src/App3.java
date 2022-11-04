import java.util.Random;

public class App3 {
    public static void main(String[] args) {
        Random rnd= new Random();
        int [][]matriz_numeros=new int[4][5]; //dimensiones tabla numeros random
        int [][]matriz_numeros_resultados=new int[5][6]; //dimensiones tabla numeros resultado

        for(int fila=0;fila< matriz_numeros.length;fila++){ //for para la fila (numeros random)(fila)
            for(int columna=0;columna<matriz_numeros[fila].length;columna++){ //for para la columna (numeros random)(columna)
                matriz_numeros[fila][columna]=rnd.nextInt(10); //numeros random del 1-10
                matriz_numeros_resultados[fila][columna]=matriz_numeros[fila][columna]; //los resultados vendran a partir de los numeros random(dse suman en filas y columnas)
            }
        }
        int valor_p = 0; //inicializamos valor_p
        for(int fila=0;fila< matriz_numeros_resultados.length-1;fila++){ //for resultados (fila)
            int columna = 0;
            for (columna=0; columna < matriz_numeros_resultados[fila].length-1; columna++){ //for resultados (columna)
                valor_p+=matriz_numeros_resultados[fila][columna]; //valor_p = resultados
            }
            matriz_numeros_resultados[fila][columna]=valor_p;
            valor_p=0;
        }
        valor_p=0;

        for(int columna=0;columna< matriz_numeros_resultados[0].length-1;columna++){ //
            int fila = 0;
            for (fila=0; fila < matriz_numeros_resultados.length-1; fila++){
                valor_p+=matriz_numeros_resultados[fila][columna];
            }
            matriz_numeros_resultados[fila][columna]=valor_p;
            valor_p=0;
        }

        for(int i=0;i< matriz_numeros_resultados.length;i++){
            matriz_numeros_resultados[matriz_numeros_resultados.length-1][matriz_numeros_resultados[0].length-1]+=matriz_numeros_resultados[i][matriz_numeros_resultados[0].length-1];
        }


        for (int i=0; i < matriz_numeros_resultados.length; i++) {
            for (int j=0; j < matriz_numeros_resultados[i].length; j++) {
                System.out.print(" | ");System.out.print (matriz_numeros_resultados[i][j]); System.out.print(" |\t");
            }
            System.out.println(); //creamos tabla
        }

    }
}

