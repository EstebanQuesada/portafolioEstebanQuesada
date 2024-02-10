/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo.pkg1;

/**
 *
 * @author EsteP
 */
public class Ejemplo {
    //1 2 3 4 5
    
    
public void serie (int n){
    //N es el valor que se le da
    
    //Instrucciones
    
    //El numero que se imprime es menor al numero que ponga es el limite
    if (n < 5) {
        System.out.print(n + " ");
        serie (n + 1);
    }
}
public int factorial (int n){
    int resp = 1;

    if (n>0){
        resp= n * factorial(n -1);
    }
    return resp;
            }    
            public int suma(int n){
                int resp;
                if(n==1){
                    return 1;
                } else {
                    resp = n + suma (n -1);
                }
                return resp;
            }
            //buscar un elemento de un vector recursivo
            public int posElemento(int vec[], int elementoBuscar, int i){
                if(vec[i]==elementoBuscar){
                    return i;
                } else{
                    return posElemento(vec, elementoBuscar, i + 1);
                }
           
            }
}
