import java.util.Random;
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
    public void llenarMatriz(int[][] matriz){
        Random rand = new Random();//Crear Objeto Random para llenar Valores Aleaotrios

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz [i][j] = rand.nextInt();//Generar Números de 0 al 100
            }
            
        }
        
    }
}