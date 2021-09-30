package bacsystem.com.archivos;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

//Ctrl + Alt  + l = format code
public class Principal {

    private final Logger log = Logger.getLogger(Principal.class.getName());

    public static void main(String[] args) {

        Principal principal = new Principal();
        principal.getListFiles();
    }

    private void getListFiles() {

        File file = new File("C:\\Users\\cbacilio\\Documents\\everis\\desarrollo\\java\\data\\");

        File[] files = file.listFiles();

        for (String f : file.list()) {
            log.log(Level.INFO, "Name: {0} Size: {1}", new String[]{f, f.length() + ""});

        }
        //System.out.println(files.length);
    }

    private String getSizeFile(File file) {

        String size = null;
        //if (file.length() > 50000) {
        int k = 1024;
        String[] format = {"Bytes", "KB", "MB", "GB", "TB", "PB", "EB", "ZB", "YB"};
        int s = (int) Math.floor(Math.log(file.length() / Math.log(k)));
        System.out.println("file: " + Float.parseFloat(file.length() / Math.pow(k, s) + "") + " " + format[s]);
        //log.log(Level.INFO, "float {0}", file.length() / Math.pow(k, s));

        //let cantidad = parseFloat((file.size / Math.pow(k, i)).toFixed(dm)) + ' ' + sizes[i];
        //log.log(Level.INFO, "result {0}", s);
        //}


        return size;
    }

}

/**
 * validarSize(file: File) {
 * if (file.size > 500000) {
 * const k = 1024;
 * const sizes = ['Bytes', 'KB', 'MB', 'GB', 'TB', 'PB', 'EB', 'ZB', 'YB'];
 * const i = Math.floor(Math.log(file.size) / Math.log(k));
 * const dm = 1;
 * let cantidad = parseFloat((file.size / Math.pow(k, i)).toFixed(dm)) + ' ' + sizes[i];
 * this.messageService.add({ severity: 'error', summary: `El archivo no debe superar los 500 KB`, detail: `El archivo tiene: ${cantidad}`, life: 4000 });
 * this.formato_1.controls['vertimientoAguaResidualDocumento'].setValue('')
 * return;
 * }
 * }
 * <p>
 * validarExtension(file: File) {
 * let ext = file.name.split('.').pop();
 * <p>
 * console.log(ext);
 * switch (ext) {
 * case 'jpg':
 * case 'jpeg':
 * case 'png':
 * case 'pdf': break;
 * default:
 * this.messageService.add({ severity: 'error', summary: `El archivo no tiene la extensión adecuada`, detail: `Solo: .jpg, .jpeg, .pdf y .png`, life: 4000 });
 * this.formato_1.controls['vertimientoAguaResidualDocumento'].setValue('')
 * }
 * }
 */