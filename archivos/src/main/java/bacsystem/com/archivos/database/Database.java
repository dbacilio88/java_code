package bacsystem.com.archivos.database;

import java.util.Iterator;
import java.util.List;

public class Database {
    public static void main(String[] args) {

        ConsultaDao consultaDao = new ConsultaDaoImpl();

        List<PersonaDB> response = consultaDao.listarPersonas();

        for (PersonaDB personaDB : response) {
            System.out.println(personaDB.toString());
        }

        Iterator<PersonaDB> iterator = response.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }

        response.forEach(personaDB -> System.out.println(personaDB.toString()));

        response.forEach(System.out::println);

        for (int i = 0; i < response.size(); i++) {
            System.out.println(response.get(i).toString());
        }

        PersonaDB personaDB = new PersonaDB();
        personaDB.setCodigo("002");
        personaDB.setNombres("Jose");
        personaDB.setApellidos("Bacilio");
        personaDB.setDireccion("Lurin");
        String message = consultaDao.insertarPersona(personaDB);
        System.out.println(message);
    }
}
