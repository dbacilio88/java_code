package bacsystem.com.archivos.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import bacsystem.com.archivos.Constantes;

public class Files {

    private static final Logger LOGGER = Logger.getLogger(Files.class.getName());

    public static void main(String[] args) {

        File file = new File("/home/christian/Documents/repositories/cursos/java/java_code/data/application.properties");

        Properties properties = new Properties();
        InputStream inStream = null;
        String encontrado = null;

        if (file.isFile()) {

            try {
                inStream = new FileInputStream(file);
                properties.load(inStream);
            } catch (Exception e) {
                LOGGER.log(Level.SEVERE, "files is {0}", e.getMessage());
            }

            encontrado = encontrarValor(properties.getProperty("values"), "2");

            LOGGER.log(Level.INFO, "el valor es {0}", encontrado);
        }

    }

    public static String encontrarValor(String values, String encontrar) {

        String result = null;

        List<String> lista = Arrays.asList(values.split(Constantes.PARAMETRO_PALOTE));

        for (String object : lista) {

            List<String> value = Arrays.asList(object.split(Constantes.PARAMETRO_COMA));

            if (value.get(0).equalsIgnoreCase(encontrar)) {
                result = value.get(1);
            }
        }

        return result;
    }
}
