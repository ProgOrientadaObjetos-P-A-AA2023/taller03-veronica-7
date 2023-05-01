/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package intitutoseducativos;

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
        InstitutosEducativos instituto = new InstitutosEducativos();
        InstitutosEducativos instituto2 = new InstitutosEducativos();
        
        //Establecer los valores de los atributos del primer objeto.
        instituto.establecerNombre("La Dolorosa");
        instituto.establecerTipoInstituto("Fiscomisional");
        instituto.establecerNumeroAlumnos(2509);
        instituto.establecerNumeroDocentes(55);
        instituto.establecerNumeroSedes(1);
        instituto.establecerGastosAlumnos(225.10);
        
        //Hacemos el llamado de la funcion para
        //calcular el valor del presupuesto.
        instituto.presupuestos();
        
        //Presentamos los valores declarados al primer objeto.
        System.out.printf("Administración de Instituciones Educativas\n\n"
                + "Nombre del Intituto Educativo: %s\n"
                + "Tipo de Institutción: %s\n"
                + "Cantidad de Alumnos de la Institución: %d\n"
                + "Docentes de la Institución: %d\n"
                + "Cantidad de Sedes de la Institución: %d\n"
                + "Los gastos de los alumnos son de $%.2f\n"
                + "El presupuesto de la Institución es de $%.2f\n", 
                instituto.obtenerNombre(), instituto.obtenerTipoInstituto(), 
                instituto.obtenerNumeroAlumnos(), 
                instituto.obtenerNumeroDocentes(), 
                instituto.obtenerNumeroSedes(), 
                instituto.obtenerGastosAlumnos(), 
                instituto.obtenerPresupuesto());
        
         System.out.println("-----------------------------------------------");
        
         //Establecer los valores de los atributos del primer objeto.
        instituto2.establecerNombre("Daniel Álvarez");
        instituto2.establecerTipoInstituto("Fiscomisional");
        instituto2.establecerNumeroAlumnos(1890);
        instituto2.establecerNumeroDocentes(85);
        instituto2.establecerNumeroSedes(1);
        instituto2.establecerGastosAlumnos(160.52);
        
        //Hacemos el llamado del metodo para calcular el valor del presupuesto.
        instituto2.presupuestos();
        
        //Presentamos los valores declarados al primer objeto.
        System.out.printf("Nombre del Intituto Educativo: %s\n"
                + "Tipo de Institutción: %s\n"
                + "Cantidad de Alumnos de la Institución: %d\n"
                + "Docentes de la Institución: %d\n"
                + "Cantidad de Sedes de la Institución: %d\n"
                + "Los gastos de los alumnos son de $%.2f\n"
                + "El presupuesto de la Institución es de $%.2f\n", 
                instituto2.obtenerNombre(), instituto.obtenerTipoInstituto(), 
                instituto2.obtenerNumeroAlumnos(), 
                instituto2.obtenerNumeroDocentes(), 
                instituto2.obtenerNumeroSedes(), 
                instituto2.obtenerGastosAlumnos(), 
                instituto2.obtenerPresupuesto());
    }
    
}
