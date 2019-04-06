
package pp2;

import java.util.Scanner;


public class NewClass {
    
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        double cm;
        double aux = 0;
        double digito = 0;
        int ip= 0;
        System.out.println("Escriba un numero ");
        cm = Leer.nextInt();
        while(cm < 0 )
            digito = cm % 2;
            aux = aux + digito+ Math.pow(10, ip);
            ip++;

            cm =cm%2;
            System.out.println("binario:      "+cm);
        

    }
   
         
}
    

