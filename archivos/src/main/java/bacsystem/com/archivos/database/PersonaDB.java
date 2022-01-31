package bacsystem.com.archivos.database;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PersonaDB {

    private int id;
    private String codigo;
    private String nombres;
    private String apellidos;
    private String direccion;

}
