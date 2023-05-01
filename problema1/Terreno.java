/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package terreno;

/**
 *
 * @author Usuario
 */
public class Terreno {
    private double largo;
    private double ancho;
    private double area;
    private double valorMetroCuadrado;
    private double costoTerreno;
    
    public void establecerLargo(double t){
        largo = t;
    }
    
    public void establecerAncho(double t){
        ancho = t;
    }
    
    public void establecerValorMetroCuadrado(double t){
        valorMetroCuadrado = t;
    }
    
    public void establecerCostoTerreno(double t){
        costoTerreno = t;
    }
    
    //Función para calcular el área del terreno:
    public void calcularArea(){   
        area = largo*ancho;           
    }                                   
    
    public double obtenerLargo(){
       return largo; 
    }
    
    public double obtenerAncho(){
       return ancho; 
    }
     
    public double obtenerValorMetroCuadrado(){
       return valorMetroCuadrado;
     }
    
    public double obtenerCostoTerreno(){
       return costoTerreno;
     }
     
    public double obtenerArea(){
         return area;
     }
    
}