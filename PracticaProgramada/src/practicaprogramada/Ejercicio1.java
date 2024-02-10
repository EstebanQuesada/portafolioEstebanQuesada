/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaprogramada;

/**
 *
 * @author EsteP
 */
public class Ejercicio1 {
    public int invertir(int numm,int inversa) {
        if (numm > 0) {
            return invertir(numm/10, numm%10+inversa*10);
        } else {
            
            return inversa;
        }  
    }    
}
    

