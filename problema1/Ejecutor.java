/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package terreno;

/**
 *
 * @author Usuario
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear dos objetos de tipo Terreno.
        Terreno tierra = new Terreno();
        Terreno tierra2 = new Terreno();
        
        double metroCuadrado = 130.00;
        double costoTerreno;
        
        //Establecer los valores de los tributos del primero objeto.
        tierra.establecerLargo(62.50);
        tierra.establecerAncho(30.15);
        tierra.establecerValorMetroCuadrado(metroCuadrado);
        
        //Se hace la llamada de los metodos.
        tierra.calcularArea();
        
        //Se presenta.
        System.out.printf("Costo de un Terreno Rectangular.\n\n"
                + "El terreno tiene un largo de: %.2f metros\n"
                + "El terreno tiene un ancho de: %.2f metros\n"
                + "El Ã¡rea del terreno es de: %.2f\n"
                + "El precio del metro cuadrado es de: $%.2f\n"
                ,tierra.obtenerLargo(), tierra.obtenerAncho(), 
                tierra.obtenerArea(), tierra.obtenerValorMetroCuadrado());
        
        //Se multiplica el Área por el precio del metro cuadrado y se presenta.
        costoTerreno = 
                tierra.obtenerArea()*tierra.obtenerValorMetroCuadrado();
        System.out.printf("-> El costo total por el terreno es de: $%.2f\n", 
                costoTerreno);
        
        System.out.println("-----------------------------------------------");
        
        //Establecer los valores de los tributos del segundo objeto.
        tierra2.establecerLargo(25.6);
        tierra2.establecerAncho(40.8);
        tierra2.establecerValorMetroCuadrado(metroCuadrado);
        
        //Se hace la llamada de los metodos.
        tierra2.calcularArea();
        
        //Se presenta.
        System.out.printf("El terreno tiene un largo de: %.2f metros\n"
                + "El terreno tiene un ancho de: %.2f metros\n"
                + "El Ã¡rea del terreno es de: %.2f\n"
                + "El precio del metro cuadrado es de: $%.2f\n"
                ,tierra2.obtenerLargo(), tierra2.obtenerAncho(), 
                tierra2.obtenerArea(), tierra2.obtenerValorMetroCuadrado());
        
        //Se multiplica el Área por el precio del metro cuadrado y se presenta.
        costoTerreno = 
                tierra2.obtenerArea()*tierra2.obtenerValorMetroCuadrado();
        System.out.printf("-> El costo total por el terreno es de: $%.2f\n", 
                costoTerreno);
    }
    
}