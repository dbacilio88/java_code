package bacsystem.com.archivos.poo.abstraccion;

import bacsystem.com.archivos.poo.models.Persona;
import bacsystem.com.archivos.poo.models.Empleado;
import bacsystem.com.archivos.poo.models.Estudiante;
import bacsystem.com.archivos.poo.models.Jefe;

/**
 * @apiNote Volviendo a la figura anterior de la relación de herencia entre
 *          clases, se puede pensar en una jerarquía de clase como la definición
 *          de conceptos demasiado abstractos en lo alto de la jerarquía y esas
 *          ideas se convierten en algo más concreto conforme se desciende por
 *          la cadena de la superclase
 * @apiNote Sin embargo, las clases hijas no están limitadas al estado y
 *          conducta provistos por sus superclases; pueden agregar variables y
 *          métodos además de los que ya heredan de sus clases padres. Las
 *          clases hijas pueden, también, sobreescribir los métodos que heredan
 *          por implementaciones especializadas para esos métodos. De igual
 *          manera, no hay limitación a un sólo nivel de herencia por lo que se
 *          tiene un árbol de herencia en el que se puede heredar varios niveles
 *          hacia abajo y mientras más niveles descienda una clase, más
 *          especializada será su conducta.
 * 
 * @apiNote a herencia presenta los siguientes beneficios:
 * 
 * @apiNote Las subclases proveen conductas especializadas sobre la base de
 *          elementos comunes provistos por la superclase. A través del uso de
 *          herencia, los programadores pueden reutilizar el código de la
 *          superclase muchas veces.
 * 
 * @apiNote Los programadores pueden implementar superclases llamadas clases
 *          abstractas que definen conductas "genéricas". Las superclases
 *          abstractas definen, y pueden implementar parcialmente, la conducta
 *          pero gran parte de la clase no está definida ni implementada. Otros
 *          programadores concluirán esos detalles con subclases especializadas.
 * 
 * @apiNote Mientras se va subiendo desde la subclase a las superclases, estas
 *          se van volviendo mas genericas o mas abstractas
 * 
 * @apiNote Un metodo abstracto no lleva cuerpo. (llaves de apertura y cierre)
 *          si el metodo es abstracto, obligatoriamente se tiene que declarar la
 *          clase como abstracta. seguir un patron en la jerarquia de la
 *          herencia, estan obligadas a sobrescribir el metodo abstracto
 * 
 */
public class Abstraccion {

    public static void main(String[] args) {

        Persona[] personas = new Persona[3];

        personas[0] = new Empleado("Christian", 3000);
        personas[1] = new Estudiante("Carlos", "Ing. Informática");
        personas[2] = new Jefe("Jose", 2000);

        Jefe jefe = (Jefe) personas[2];
        jefe.setIncentivo(1000);

        for (Persona persona : personas) {
            System.out.println(persona.getDescripcion());
        }

    }
}
