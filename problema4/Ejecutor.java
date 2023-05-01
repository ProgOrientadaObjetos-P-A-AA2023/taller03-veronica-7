/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dispositivoselectronicos;

/**
 *
 * @author Usuario
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear dos objetos de tipo DispositivosElectronicos.
        DispositivosElectronicos celulares = new DispositivosElectronicos();
        DispositivosElectronicos celulares2 = new DispositivosElectronicos();
        
        //Inicializar variables del iva.
        double iva = 0.12;
        
        //Establecer los valores de los tributos del primero objeto.
        celulares.establecerSistemaOperativo("iOS");
        celulares.establecerTamanioPantalla(4.95);
        celulares.establecerCostoInicial(625.00);
        celulares.establecerPorcentajeIva(iva);
        celulares.establecerDireccionMac("A:5C:4D:6C:8E:7G:9");
        celulares.establecerDireccionImei("865110048651100/00");
        
        //Hacer el llamado de las funciones.
        celulares.calcularIvaCostoInicial();
        celulares.calcularCostoFinal();
        
        //Se presenta:
        System.out.printf("Caracteristicas de los Equipo Celulares.\n\n"
                + "Sistema operativo del dispositivo: %s\n"
                + "Pantalla de %.2f pulgadas.\n"
                + "Precio del celular: $%.2f\n"
                + "Iva de 12 porciento.\n"
                + "Costo adicional por iva de $%.2f\n"
                + "Costo final con iva adherido de $%.2f\n"
                + "Dirección Mac de dispositivo - %s\n"
                + "Dirección Imei del dispositivo - %s\n", 
                celulares.obtenerSistemaOperativo(), 
                celulares.obtenerTamanioPantalla(), 
                celulares.obtenerCostoInicial(), 
                celulares.obtenerIvaCostoInicial(), 
                celulares.obtenerIvaCostoFinal(), 
                celulares.obtenerDireccionMac(), 
                celulares.obtenerDireccionImei());
        
        System.out.println("-----------------------------------------------");
        
        celulares2.establecerSistemaOperativo("Android");
        celulares2.establecerTamanioPantalla(5.20);
        celulares2.establecerCostoInicial(399.99);
        celulares2.establecerPorcentajeIva(iva);
        celulares2.establecerDireccionMac("B:6C:3F:5H:2E:7D:4");
        celulares2.establecerDireccionImei("249333560004871/00");
        
        //Hacer el llamado de las funciones.
        celulares2.calcularIvaCostoInicial();
        celulares2.calcularCostoFinal();
        
        //Se presenta:
        System.out.printf("Sistema operativo del dispositivo: %s\n"
                + "Pantalla de %.2f pulgadas.\n"
                + "Precio del celular: $%.2f\n"
                + "Iva de 12 porciento.\n"
                + "Costo adicional por iva de $%.2f\n"
                + "Costo final con iva adherido de $%.2f\n"
                + "Dirección Mac de dispositivo - %s\n"
                + "Dirección Imei del dispositivo - %s\n", 
                celulares2.obtenerSistemaOperativo(), 
                celulares2.obtenerTamanioPantalla(), 
                celulares2.obtenerCostoInicial(), 
                celulares2.obtenerIvaCostoInicial(), 
                celulares2.obtenerIvaCostoFinal(), 
                celulares2.obtenerDireccionMac(), 
                celulares2.obtenerDireccionImei());
    }
    
}
