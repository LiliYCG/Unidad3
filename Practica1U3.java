
package practica1u3;
import java.util.Scanner;
import java.util.Scanner;

public class Practica1U3 {

    
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Ingrese numero");
        int num= s.nextInt();
        if (num%2==0){
            System.out.println("El numero es par");
        }
        else{
            System.out.println("El numero no es par");
        }
    }
    
}
