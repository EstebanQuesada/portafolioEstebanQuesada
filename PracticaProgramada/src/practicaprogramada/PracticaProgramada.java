/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaprogramada;

import javax.swing.JOptionPane;
import static practicaprogramada.Ejercicio2.Impr;

/**
 *
 * @author EsteP
 */
public class PracticaProgramada {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
//Ejercicio 1
      Ejercicio1 y = new Ejercicio1();
       
        int numm = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número que desea invertir: "));
        
        int resultadoInvertido = y.invertir(numm,0);
        
        JOptionPane.showMessageDialog(null, "El resultado invertido de " + numm + " es: " + resultadoInvertido);
//Ejercicio 1      

    
//Ejercicio 2        
        String miString = "H o l a ";
        Impr(miString, 0);
//Ejercicio 2


//Ejercicio 3
        Ejercicio3 v = new Ejercicio3();

        int[] arr = new int[5];
        v.llenar(arr, 0);
        JOptionPane.showMessageDialog(null, "Contenido del vector:");
        v.mostrar(arr, 0);
        int mayor = v.EnMayor(arr, 0, arr[0]);
        JOptionPane.showMessageDialog(null, "El mayor valor almacenado en el vector es: " + mayor);   
//Ejercicio 3


//Ejerciocio 4
    String cantNumeros = JOptionPane.showInputDialog("Ingrese la cantidad de numeros que quiere sumar: ");
        int n = Integer.parseInt(cantNumeros);
        
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            String valores = JOptionPane.showInputDialog("Ingrese el valor del mumero: "+(i+1));
            num[i]= Integer.parseInt(valores);
        } 
        Ejercicio4 s = new Ejercicio4();
        int resp = s.sumasRecursivas(num, n-1);
        System.out.println("La suma de todos los numeros es: "+resp);   
//Ejerciocio 4


//Ejercicio 5        
        Ejercicio5 Res = new Ejercicio5();
        Res.tablas(1, 7);
//Ejercicio 5        
    }
}