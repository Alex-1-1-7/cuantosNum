/*
• Ejercicio 4: Pedir números hasta
que se teclee uno negativo, y
mostrar cuántos números se han
introducido.
*/
package cuantosnum;

import java.util.Scanner;
//import javax.swing.JOptionPane;


public class CuantosNum {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    int num;
    int i;
    //num = Interger.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        System.out.println("Digite un numero");
        num = entrada.nextInt();
    
    for ( i = 0; num>=0; i++){
    //num = Interger.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
    System.out.println("Ingrse otro numero: ");
    num = entrada.nextInt();
    } 
        System.out.println("la cantidad de numeros ingresados es: "+i);
    }
      
}
