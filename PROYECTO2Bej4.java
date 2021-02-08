package proyecto2b;
import java.util.Scanner;
/**
 *
 * @author 0zzda
 */
/**
 *
 * Cuarto Ejercicio del proyecto final 
 */
public class PROYECTO2Bej4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Inicializacion y declaracion de variables
        int n, x, nn=0;
        boolean band= false;
        System.out.println("Programa para buscar un numero dentro de un arreglo");
        System.out.println("--------------------------------------------------- \n");
        System.out.println("Ingrese el limite de numeros a ingresar");
        n = leer.nextInt();
        System.out.println("---------------------------------------\n");
        int []A = new int [n];
        //Se ingresan los datos del vector
        for (int i=0; i<n; i++){
            A[i] = (int) ((Math.random()*10)+1);
        }
        //Se imprime el vector
        for (int i=0; i<n; i++){
            System.out.println(A[i]+" ");
        }
        System.out.println("\n---------------------------------------\n");
        System.out.println("Ingrese el elemento a buscar");
        x= leer.nextInt();
        //Busqueda del elemento
        while ((band==false)&&(nn<n)){
            if (A[nn]==x){
                band=true;
                System.out.println("El numero "+x+" si se encuentra en el vector");
            }
            nn=nn+1;
        }
        if (band==false){
            System.out.println("El numero "+x+" no ha sido encontrado");
        }
    }
    
}
