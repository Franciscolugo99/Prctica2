
package pp2;

import java.util.Scanner;


public class Pp2 {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        double pulgadas;
        double cm;
        
        System.out.println("Escriba un numero ");
        cm = Leer.nextInt();
        pulgadas = cm * 0.393701;
        System.out.println("El numero: "+ cm + "en pulgadas es:"+pulgadas);
        
        
        

    }
    
}
