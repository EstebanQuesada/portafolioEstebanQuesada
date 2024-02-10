/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaprogramada;

/**
 *
 * @author EsteP
 */
public class Ejercicio2 {
   public static void Impr(String p, int n) {
        if (n < p.length()) {
            System.out.print(p.substring(n, n + 1));
            Impr(p, n + 1);
        }
    }
    
}
