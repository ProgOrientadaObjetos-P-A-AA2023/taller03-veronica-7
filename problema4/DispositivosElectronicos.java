/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dispositivoselectronicos;

/**
 *
 * @author Usuario
 */
public class DispositivosElectronicos {
    private String sistemaOperativo;
    private double tamanioPantalla;
    private double costoInicial;
    private double porcentajeIva;
    private double ivaCostoInicial;
    private double costoFinal;
    private String direccionMac;
    private String direccionImei;
    
    //Metodos establecer y obtener para las variables.
    public void establecerSistemaOperativo(String s){
        sistemaOperativo = s;
    }
    
    public void establecerTamanioPantalla(double s){
        tamanioPantalla = s;
    }
    
    public void establecerCostoInicial(double s){
        costoInicial = s;
    }
    
    public void establecerPorcentajeIva(double s){
        porcentajeIva = s;
    }
    
    public void establecerDireccionMac(String s){
        direccionMac = s;
    }
    
    public void establecerDireccionImei(String s){
        direccionImei = s;
    }
    
    //Funciones para realizar el calculo del agregado del iva y costo final.
    public void calcularIvaCostoInicial(){
        ivaCostoInicial = costoInicial*porcentajeIva;
    }
    
    public void calcularCostoFinal(){
        costoFinal = costoInicial+ivaCostoInicial;
    }
    
    //Metodos obtener.
    public String obtenerSistemaOperativo(){
         return sistemaOperativo;
     }
    
    public double obtenerTamanioPantalla(){
         return tamanioPantalla;
     }
    
    public double obtenerCostoInicial(){
         return costoInicial;
     }
    
    public double obtenerPorcentajeIva(){
         return porcentajeIva;
     }
    
    public double obtenerIvaCostoInicial(){
         return ivaCostoInicial;
     }
    
    public double obtenerIvaCostoFinal(){
         return costoFinal;
     }
    
    public String obtenerDireccionMac(){
         return direccionMac;
     }
    
    public String obtenerDireccionImei(){
         return direccionImei;
     }
}
