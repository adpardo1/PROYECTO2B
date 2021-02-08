/*
 *Segundo ejercico del proyecto final del segundo bimestre 
 */
package proyecto2b;
import java.util.Scanner;
/**
 *
 * @author GHOST
 */
public class PROYECTO2Bej2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Leer una matriz 4x6 entera y determinar en qué posiciones están los menores pares por fila.
        //Inicializacion y declaracion de variables
        int aux=100, j;
        int [][] A = new int[4][6];        
        System.out.println("Programa que determine en que posiciones estan los numeros menores por filas en una matriz de 4x6");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Se generan valores aleatorios en la matriz A");
        for (int i = 0; i<4; i++){
            for (j= 0; j<6; j++){
                A[i][j] = (int) ((Math.random()*20)+1);
            }
        }
        //Se presenta la matriz
        for (int i = 0; i<4; i++){
            for (j= 0; j<6; j++){
                System.out.print(A[i][j]+"    ");           
            }
            System.out.println();
        }
        //Se realizan los procesos para encontrar los menores pares 
        for (int i = 0; i<4; i++){
            for (j= 0; j<6; j++){
                if ((A[i][j]%2==0)&&(A[i][j]<aux)){
                    aux= A[i][j];
                }
            }
            //Se presentan los menores pares por fila
            System.out.println("Fila: "+i);
            for (j= 0; j<6; j++){
                if(A[i][j]==aux){
                    System.out.println("Se ha encontrado el menor par = "+aux+" en A["+i+"]["+j+"]");
                }  
            }
            aux=100;                       
        }
    }    
}
