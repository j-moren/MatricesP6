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
                matriz [i][j] = rand.nextInt(101);//Generar Números de 0 al 100
            }
            
        }
        
    }
    public int[] sumaFilas(int[][] matriz){
        int[] sumaFilas = new int[matriz.length]; // Crear arreglo para almacenar la suma de cada fila

        for (int i = 0; i < matriz.length; i++) {//Reocrre las Filas
            int suma = 0;// Variable para almacenar la suma de la fila actual
            for (int j = 0; j < matriz[i].length; j++) {// Recorr las columnas
                suma += suma;// sumar los Valores de la Fila                
            }
            sumaFilas[i] = suma;//Almacenar las Suma de la Fila en el Arreglo
        }
        return sumaFilas; // Retornar el arreglo con la suma de las filas
    }
    public int[] sumaColumnas(int[][] matriz){
        int[] sumaColumnas = new int [matriz[0].length];// Crear arreglo para almacenar la suma de cada 
        
        for (int j = 0; j < matriz[0].length; j++) {
            int suma = 0;// Variable para almacenar la suma de cada Columna Actual
            for (int i = 0; i < matriz.length; i++) {//Recorrer las filas
                suma += matriz[i][j]; //Sumar los Valores de la columna                
            }
            sumaColumnas[j] = suma;// Almacenar la suma de la Columna en el Arreglo
        }
        return sumaColumnas; // Retornar el arreglo con las sumas de las Columnas
    }
}