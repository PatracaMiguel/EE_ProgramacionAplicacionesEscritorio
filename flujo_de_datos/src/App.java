import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner archivo = new Scanner(System.in);
        System.out.println("Ingrese el nombre del archivo: ");
        String nombreDelArchivo = archivo.nextLine();

        File file = new File(nombreDelArchivo); 

        try {

            int numeroDeLineas = 0;
            int numeroDePalabras = 0;
            int numeroDeCaracteres = 0;

            ArrayList<Character> listaDeLetras= new ArrayList<>();

            Scanner lectorDelTexto = new Scanner(file);

            while (lectorDelTexto.hasNextLine()) {

                String data = lectorDelTexto.nextLine();

                for (int i = 0; i < data.length(); i++) {
                    char caracter = data.charAt(i);
                    listaDeLetras.add(caracter);
                }

                numeroDeLineas++;
            }

            for (int i = 0; i < listaDeLetras.size(); i++) {
                numeroDeCaracteres++;

                if (listaDeLetras.get(i) == ' ' || listaDeLetras.get(i) == '\n') {
                    numeroDePalabras++;
                }
            }
            numeroDePalabras++;

            System.out.println("El archivo tiene : ");
            System.out.println("Numero de caracteres: " + numeroDeCaracteres);
            System.out.println("Numero de palabras: " + numeroDePalabras);
            System.out.println("Numero de lineas: " + numeroDeLineas);

            lectorDelTexto.close();
            archivo.close();

        } catch (FileNotFoundException e) {

            System.out.println(e.getMessage());

        }
    }
}
