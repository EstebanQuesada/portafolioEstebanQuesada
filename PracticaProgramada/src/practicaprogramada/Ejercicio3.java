/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaprogramada;

import javax.swing.JOptionPane;

/**
 *
 * @author EsteP
 */
public class Ejercicio3 {
    public void llenar(int arr[], int posicion){
        if (posicion < arr.length) {
            arr[posicion]=Integer.parseInt(JOptionPane.showInputDialog("Cual es el numero para la posicion? " + posicion + ": "));
            llenar(arr,posicion+1);
        }
    }
    
    public void mostrar(int arr[], int posicion){
        if (posicion < arr.length) {
            JOptionPane.showMessageDialog(null, "El numero que esta en " + posicion + " es:" + arr[posicion]);
            mostrar(arr,posicion+1);
        }
    }
    
    public int EnMayor(int arr[], int posicion, int mayor){
        if (posicion < arr.length) {
            if (arr[posicion] > mayor) {
                mayor = arr[posicion];
            }
            return EnMayor(arr, posicion+1, mayor);
        }
        return mayor;
    }
}