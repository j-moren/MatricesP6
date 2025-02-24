import java.util.Scanner;

public class Metodos {

    public int[][] solicitarDimension(){

        Scanner sc = new Scanner (System.in);// Crear objeto Scanner para Leer la Entrada

        System.out.println("Ingrese el Número de Filas de la Matriz: ");//Solicitar el Número de filas
        int i = sc.nextInt();//Lee el Número de filas

        System.out.println("Ingrese el Número de Columnas de la Matriz: ");//Solicitar el Número de Columnas
        int j = sc.nextInt();

        int[][] matriz = new int [i][j];

        return matriz;

    }
}