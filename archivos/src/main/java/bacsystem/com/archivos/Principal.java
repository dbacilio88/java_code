package bacsystem.com.archivos;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {

    private static final Logger log = Logger.getLogger(Principal.class.getName());

    public static void main(String[] args) {

        Principal principal = new Principal();
        principal.getListFiles();
    }

    private void getListFiles() {

        File file = new File("/home/christian/Documentos/repositories/java_code/data/");

        getSizeFile(file);

        File[] files = file.listFiles();

        for (String f : file.list()) {
            log.log(Level.INFO, "Name: {0} Size: {1}", new String[] { f, f.length() + "" });
        }

        System.out.println(files.length);
    }

    private String getSizeFile(File file) {
        String size = null;
        int k = 1024;
        String[] format = { "Bytes", "KB", "MB", "GB", "TB", "PB", "EB", "ZB", "YB" };
        int s = (int) Math.floor(Math.log(file.length() / Math.log(k)));
        System.out.println("file: " + Float.parseFloat(file.length() / Math.pow(k, s) + "") + " " + format[s]);
        log.log(Level.INFO, "float {0}", file.length() / Math.pow(k, s));
        log.log(Level.INFO, "result {0}", s);
        return size;
    }
}