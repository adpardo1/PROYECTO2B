/*
 *Tercer ejercicio del proyecto bimestral
 */
package proyecto2b;

/**
 *
 * @author 0zzda
 */
public class PROYECTOej3 {
    public static void main(String[] args) {
        //Construir una función que reciba como parámetro una matriz 4x4 entera y retorne el número de la columna en donde se encuentre por primera vez el número mayor de la matriz
        //Inicializacion y declaracion de variables
        int aux=100, men=0, r=-1, j;
        int [][] A = new int[4][4];        
        System.out.println("Programa que determine el número de la columna en donde se encuentre por primera vez el número mayor de la matriz de 4x4");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Se generan valores aleatorios en la matriz A");
        for (int i = 0; i<4; i++){
            for (j= 0; j<4; j++){
                A[i][j] = (int) ((Math.random()*5)+1);
            }
        }
        //Se presenta la matriz
        for (int i = 0; i<4; i++){
            for (j= 0; j<4; j++){
                System.out.print(A[i][j]+"    ");           
            }
            System.out.println();
        }
        MAYOR(A);
    }
    public static void MAYOR(int A[][]){
        int mayor=0, j;
        boolean bandera = false;
        for (int i = 0; i<4; i++){
            for (j= 0; j<4; j++){
                if (A[i][j]>mayor){
                    mayor= A[i][j];
                }
            }
        }
        for (int i = 0; i<4; i++){   
            for (j= 0; j<4; j++){
                if ((A[i][j]==mayor)&&(bandera==false)){
                    System.out.println("El numero mayor es el "+mayor+" y se encuentra por primera vez en la columna "+j+" fila "+i);
                    bandera=true;                    
                }
            }
        }
    }
    
}
