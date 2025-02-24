public class MatricesP6{

    public static void main(String[] args){
        Metodos metodos = new Metodos();

        int[][] matriz = metodos.solicitarDimension();// Solicitar Dimensiones de la Mariz

        metodos.llenarMatriz(matriz);// Llenar la Matriz con Valores Aleatorios

        System.out.println("Matriz Generada:"); //Imprimir Matriz para Verifica Valores
        metodos.imprimirMatriz(matriz);

        int[] sumaFilas = metodos.sumaFilas(matriz); // Calcular la suma de las filas
        int[] sumaColumnas = metodos.sumaColumnas(matriz);// Calcular la Suma de las Columnas

        System.out.println("Suma de las Filas:"); // Imprimir la suma de las filas
        metodos.imprimirVector(sumaFilas);

        System.out.println("Suma de las Columnas:");// Imprimir la suma de las columnas
        metodos.imprimirVector(sumaColumnas);
    }
}