package bacsystem.com.archivos.poo.herencia;

import bacsystem.com.archivos.poo.models.Jefe;

/**
 * @apiNote La herencia es un mecanismo que permite la definición de una clase a
 *          partir de la definición de otra ya existente. La herencia permite
 *          compartir automáticamente métodos y datos entre clases, subclases y
 *          objetos.
 * @apiNote La herencia está fuertemente ligada a la reutilización del código en
 *          la OOP. Esto es, el código de cualquiera de las clases puede ser
 *          utilizado sin más que crear una clase derivada de ella, o bien una
 *          subclase.
 * @apiNote Hay dos tipos de herencia: Herencia Simple y Herencia Múltiple. La
 *          primera indica que se pueden definir nuevas clases solamente a
 *          partir de una clase inicial mientras que la segunda indica que se
 *          pueden definir nuevas clases a partir de dos o más clases iniciales.
 *          Java sólo permite herencia simple.
 * 
 * @category Superclase y Subclases
 * 
 * @apiNote El concepto de herencia conduce a una estructura jerárquica de
 *          clases o estructura de árbol, lo cual significa que en la OOP todas
 *          las relaciones entre clases deben ajustarse a dicha estructura.
 * 
 *          En esta estructura jerárquica, cada clase tiene sólo una clase
 *          padre. La clase padre de cualquier clase es conocida como su
 *          superclase. La clase hija de una superclase es llamada una subclase.
 * 
 *          Una superclase puede tener cualquier número de subclases.
 * 
 *          Una subclase puede tener sólo una superclase.
 */
public class Herencia {

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {

        Jefe jefe = new Jefe("Christian", 500);
        jefe.setIncentivo(100);
        System.out.println(" nombre: " + jefe.getNombre() + " su sueldo es: " + jefe.getSueldo());
    }
}
