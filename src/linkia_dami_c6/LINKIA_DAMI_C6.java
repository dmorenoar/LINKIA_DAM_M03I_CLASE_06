/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkia_dami_c6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLDataException;
import java.util.Scanner;

/**
 *
 * @author dmorenoar
 */
public class LINKIA_DAMI_C6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] array = new int[6];

        //[2,2,3,5,6,7]
        //System.out.println("Muestrame el numero de la posicion: " + array[22]);
        int valor = pideValor("Introduce un numero", 3);
        
        System.out.println("Tu numero de la suerte es: " + valor);
        
        
        System.out.println("Tu palabra tiene " + sumLetras("Amapola", 'v') + "vocales");
        
        
        System.out.println("Tu palabra tiene " + sumLetras("Amapola", 'c') + "consonantes");
    }

    public static int pideValor(String question, int numero) {
        int numMod = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println(question);
            String lectura = br.readLine();
            //numMod = Integer.parseInt(lectura);
           
            if(lectura.matches("[0-9]+")){
                System.out.println("Ha introducido un numero");
                numMod = Integer.parseInt(lectura) * numero;
            }else{
                System.out.println("Ha introducido una letra");
            }
            
        } catch (IOException e) {
            System.out.println("ERROR durante la conversión" + e);
            e.getMessage();
        } finally {
            System.out.println("Operación denegada");
        }

        /*
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("pon valor");
            String v = sc.next();
            
        } catch (Exception e) {
            System.out.println("Error");
        }
         */
        return numMod;
    }
    
    /*Haz un programa que pida al usuario una palabra y nos diga el número de vocales y el número de consonantes 
    que tiene. Para ello se debe llamar a una función de nombre contar (...). Esta función debe recibir la palabra y 
    un carácter que puede ser 'v' o 'c' que indica vocal o consonante. Debe devolver el número de vocales o el número 
    de consonates, según el carácter.*/

    public static int sumLetras(String palabra,char digitoControl){
        int total = 0, totalVocales = 0, totalConsonantes = 0;
        //Amapola
        
        System.out.println(palabra.matches("[A]"));
       
        for(int i=0;i<palabra.length();i++){
            if(palabra.charAt(i) == 'a' || palabra.charAt(i) == 'e' || palabra.charAt(i) == 'i' 
                    || palabra.charAt(i) == 'o' || palabra.charAt(i) == 'u'){
                totalVocales++;
            }else{
                totalConsonantes++;
            }
        }
        System.out.println("La letra en la posicion 0 es "  + palabra.charAt(1));
        System.out.println("Tu palaba tiene un tamano de:" + palabra.length());
        
        if(digitoControl == 'v'){
            total = totalVocales;
        }else{
            total = totalConsonantes;
        }
        
        return total;
    }
    
}
