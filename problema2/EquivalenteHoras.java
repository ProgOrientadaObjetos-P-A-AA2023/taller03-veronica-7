/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equivalentehoras;

/**
 *
 * @author Usuario
 */
public class EquivalenteHoras {
    private double horas;
    private double minutos;
    private double segundos;
    private double dias;
    
    public void establecerHoras(double e){
        horas = e;
    }    
    
    //Función para sacar la equivalencia de los minutos, segundos y días,
    public void sacarMinutos(){
        minutos = horas*60;
    }
    
    public void sacarSegundos(){
        segundos = horas*3600;
    }
    
    public void sacarDias(){
        dias = horas/24;
    }
    
    public double obtenerHoras(){
       return horas;
     }
    
    public double obtenerMinutos(){
       return minutos;
     }
    
    public double obtenerSegundos(){
       return segundos;
     }
    
    public double obtenerDias(){
       return dias;
     }
}
