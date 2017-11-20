/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petro;

/**
 *
 * @author Abi
 */
public class output {
    
     public static void main(String args[]) {
    
         int result = 0;
    for (int i=0; i <5; i++){
    
    if (i==3){
    result +=3;
    break;
    }else {
    result = result +i;
    }
}
    System.out.println(result);
     }
    
}
