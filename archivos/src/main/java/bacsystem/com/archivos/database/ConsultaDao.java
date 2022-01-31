package bacsystem.com.archivos.database;

import java.util.List;

public interface ConsultaDao {

    public List<PersonaDB> listarPersonas();

    public String insertarPersona(PersonaDB personaDB);
}
