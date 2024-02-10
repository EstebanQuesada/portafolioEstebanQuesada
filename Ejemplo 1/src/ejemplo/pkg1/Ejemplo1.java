/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author EsteP
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ejemplo e = new Ejemplo();
        e.serie(1);
        
        int num=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor"));
        JOptionPane.showMessageDialog(null, "El factorial de" + num + "es:" + e.factorial(num));
        System.out.println("El factorial es " + e.factorial(num));
        JOptionPane.showMessageDialog(null, "La sumatoria es" + e.suma(num));
        int vec[]={1,2,3,4,5};
        int elementoBuscar=Integer.parseInt(JOptionPane.showInputDialog("Digite el dato a buscar: "));
        int posElementoEncontrado=e.posElemento(vec, elementoBuscar, 0);
        System.out.println("ssdsd: " + posElementoEncontrado);
    }
    
}
