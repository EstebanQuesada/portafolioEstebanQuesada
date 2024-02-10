/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaprogramada;

/**
 *
 * @author EsteP
 */
public class Ejercicio4 {
    public int sumasRecursivas(int num[],int i ){
        int resp;
        if(i==0){
         return num[i];
        }else{
            return num[i]+sumasRecursivas(num, i -1);
        }
    }
}