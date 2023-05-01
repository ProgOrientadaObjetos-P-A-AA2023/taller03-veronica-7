/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package equivalentehoras;

/**
 *
 * @author Usuario
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear dos objetos.
        EquivalenteHoras tiempo = new EquivalenteHoras();
        EquivalenteHoras tiempo2 = new EquivalenteHoras();
        
        //Establecer los valores de los atributos del primer objeto.
        tiempo.establecerHoras(48.20);
        
        //Se llama a los metodos.
        tiempo.sacarMinutos();
        tiempo.sacarSegundos();
        tiempo.sacarDias();
        
        //Se presenta.
        System.out.printf("Encontrar la equivalencia de las horas en "
                + "minutos, segundos y días.\n\n"
                + "-> %.2f horas tienen un equivalente de %.2f minutos, "
                + "%.2f segundos y %.2f días\n",tiempo.obtenerHoras(), 
                tiempo.obtenerMinutos(), tiempo.obtenerSegundos(), 
                tiempo.obtenerDias());
        
        System.out.println("-----------------------------------------------");
        
        tiempo2.establecerHoras(15.50);
        
        //Se llama a los metodos.
        tiempo2.sacarMinutos();
        tiempo2.sacarSegundos();
        tiempo2.sacarDias();
        
        //Se presenta.
        System.out.printf("Encontrar la equivalencia de las horas en "
                + "minutos, segundos y días.\n\n"
                + "-> %.2f horas tienen un equivalente de %.2f minutos, "
                + "%.2f segundos y %.2f días\n",tiempo2.obtenerHoras(), 
                tiempo2.obtenerMinutos(), tiempo2.obtenerSegundos(), 
                tiempo2.obtenerDias());
    }
    
}
