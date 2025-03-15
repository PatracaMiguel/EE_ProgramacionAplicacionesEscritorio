import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //miPrimerExepcion();
        combinarExepciones();
    }

    public static void combinarExepciones() throws Exception {
        String datoLeido = "";
        String datoAux  = null;
        int datoConvertido;

        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa dato: ");
        datoLeido = in.nextLine();

        if (datoLeido.length() > 5 ) {
            datoAux = "UV";
        }

        try {
            int longitud = datoAux.length(); // generar un error : Null pointer
            datoConvertido = Integer.parseInt(datoAux); //genera error de converción 
        } catch (NullPointerException ex) {
            System.out.println("Error! valor nulo");
        }catch (NumberFormatException ex) {
            System.out.println("Error! no es posible realizar la conversión");
        }
    }


    public static void miPrimerExepcion() throws Exception {
        String dato = "";
        int convertido = 0;


        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese un numero (leer y convertir): ");
        dato = in.nextLine();

        
        try{
            convertido = Integer.parseInt(dato);
        } catch (Exception e){
            System.out.println( "El dato no es un numero , error!");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
           System.out.println("Ejecuta siempre este bloque - finally");
        }

        System.out.println("El dato convertido * 2 " + convertido);

        in.close();
    }
}
