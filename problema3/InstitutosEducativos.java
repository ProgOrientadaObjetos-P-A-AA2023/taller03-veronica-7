/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intitutoseducativos;

/**
 *
 * @author Usuario
 */
public class InstitutosEducativos {
    private String nombre;
    private String tipoInstituto;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    private double gastosAlumnos;
    private double presupuesto;
    
    public void establecerNombre(String i){
        nombre = i;
    }
    
    public void establecerTipoInstituto(String i){
        tipoInstituto = i;
    }
    
    public void establecerNumeroAlumnos(int i){
        numeroAlumnos = i;
    }
    
    public void establecerNumeroDocentes(int i){
        numeroDocentes = i;
    }
    
    public void establecerNumeroSedes(int i){
        numeroSedes = i;
    }
    
    public void establecerGastosAlumnos(double i){
        gastosAlumnos = i;
    }
    
    //Función para sacar el presupuesto.
    public void presupuestos(){
        presupuesto = numeroAlumnos*gastosAlumnos;
    }
    
    public String obtenerNombre(){
       return nombre;
     }
    
    public String obtenerTipoInstituto(){
       return tipoInstituto;
     }
    
    public int obtenerNumeroAlumnos(){
       return numeroAlumnos;
     }
    
    public int obtenerNumeroDocentes(){
       return numeroDocentes;
     }
    
    public int obtenerNumeroSedes(){
       return numeroSedes;
     }
    
    public double obtenerGastosAlumnos(){
       return gastosAlumnos;
     }
    
    public double obtenerPresupuesto(){
       return presupuesto;
     }
}
