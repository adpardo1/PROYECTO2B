/*
 *Primer ejercico del proyecto final del segundo bimestre 
 */
package proyecto2b;
import java.util.Scanner;
/**
 *
 * @author GHOST
 */
public class PROYECTO2B {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Leer n números enteros,almacenarlos en un vector y determinar si el promedio entero de dichos números es un número primo.
        // Inicializacion y declaracion de variables
        int n, div=0, cont=0, prom=0;
        
        System.out.println("Programa para determinar si el promedio de los datos ingresados en un vector es un numero primo");
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("Ingrese el limite del vector");
        n = leer.nextInt();
        //Ingreso de datos 
        int[] A = new int[n];
        System.out.println("Se generan valores aleatorios para el vector");
        for (int i=0;i<n;i++){
            A[i] = (int) ((Math.random()*10)+1);
            cont= cont + A[i];
            System.out.println("A["+i+"] = "+A[i]);
        }
        prom = (cont/n);
        System.out.println("El promedio es "+prom);
        for(int i=1; i <=prom; i++){
            if(prom%i == 0){
                div= div +1;
            }
        }
        if(div==2){
            System.out.println("El promedio es primo");
        }
        else{
            System.out.println("El peomedio no es primo ");
        }        
    }
    
}
