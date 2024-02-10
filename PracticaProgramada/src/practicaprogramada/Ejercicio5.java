/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaprogramada;

/**
 *
 * @author EsteP
 */
public class Ejercicio5 {
    public void tablas(int i, int n){
        if(i<=10){
            System.out.print(i+"*"+ n + "=" + i*n + "\n" );
            tablas(i+1, n);
        }
    }
}
    