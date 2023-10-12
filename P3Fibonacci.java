package P3Fibonacci;
import java.util.Scanner;

public class P3Fibonacci {

  
    public static void main(String[] args) {
        Scanner c =new Scanner (System.in);
        System.out.println("Hasta que cantidad requires");
        int cantidad = c.nextInt();
                
        int cantidad2=0, cantidad1=1;
        
        int cantidadN=0;
                
        System.out.println(cantidad2);
        System.out.println(cantidad1);
        
        for(int i =2; i < cantidad; i++) {
           
        cantidadN= cantidad2+cantidad1; System.out.println(cantidadN);
        cantidad2=cantidad1;
        cantidad1=cantidadN;
        
        
            
            
        }
    }
    
}
