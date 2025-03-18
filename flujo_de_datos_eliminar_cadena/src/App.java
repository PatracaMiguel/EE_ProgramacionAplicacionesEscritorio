import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner archivo = new Scanner(System.in);

        System.out.println("Ingrese la cadena a eliminar: ");
        String cadena = archivo.nextLine();

        System.out.println("Ingrese el nombre del archivo: ");
        String nombreDelArchivo = archivo.nextLine();

        File file = new File(nombreDelArchivo); 

        try {

            Scanner lectorDelTexto = new Scanner(file);
            String remplazarTexto = "";

            while (lectorDelTexto.hasNextLine()) {

                String data = lectorDelTexto.nextLine();
                remplazarTexto += data.replace(cadena, "");
            }

            FileWriter escritorDelArchivo = new FileWriter(file, false);
            escritorDelArchivo.write(remplazarTexto);
            escritorDelArchivo.close();

            lectorDelTexto.close();
            archivo.close();
            
        } catch (FileNotFoundException e) {

            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
