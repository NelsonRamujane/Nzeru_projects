/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class Vetores03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String []nomes= new String[]{"nelsn","maneira","ramujane","Ana Maria","Manjor"};
        
        for(int i=0;i<nomes.length;i++){
          System.out.println(nomes[i]);
          System.out.println("boa sorte ramuja");
        }
        
        //ou de forma mais facil
        for (String i:nomes){
        System.out.println(i);
        }
            
            
    }
    
}
