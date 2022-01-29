package bacsystem.com.archivos.poo.polimorfismo;

import bacsystem.com.archivos.poo.models.Empleado;
import bacsystem.com.archivos.poo.models.Jefe;

/**
 * @apiNote Otro concepto de la OOP es el polimorfismo. Un objeto solamente
 *          tiene una forma (la que se le asigna cuando se construye ese objeto)
 *          pero la referencia a objeto es polimórfica porque puede referirse a
 *          objetos de diferentes clases (es decir, la referencia toma múltiples
 *          formas). Para que esto sea posible debe haber una relación de
 *          herencia entre esas clases.
 * @apiNote Principio de sustitución: se puede utilizar el objeto de la subclase
 *          siempre que el programa espere un objeto de la superclase.
 * @apiNote diferentes formas y diferentes comportamientos.
 * @apiNote Relacionado con herencia
 * 
 * @apiNote clase Object= clase cosmica
 */
public class Polimorfismo {

    public static void main(String[] args) {

        Empleado[] empleados = new Empleado[3];
        Jefe jefe = new Jefe("Christian", 3000);
        jefe.setIncentivo(1000);
        empleados[0] = new Empleado("Jose", 5000);
        empleados[1] = jefe; // Polimorfismo, principio de sustitucion
        empleados[2] = new Jefe("Carlos", 6000); // refundicion o casteo de objetos

        Jefe logistica = (Jefe) empleados[2];
        logistica.setIncentivo(1000);

        // No se puede castear un empleado.
        // Jefe contablidad = (Jefe) empleados[0];
        // contablidad.setIncentivo(1000);

        for (Empleado empl : empleados) {
            empl.subirSueldo(5);
        }

        for (Empleado empl : empleados) {
            System.out.println(empl.getDescripcion()); // Enlazado dinamico, la maquina virtual lo hace
                                                               // automaticamente. tiempo de ejecución.
        }
    }

}
