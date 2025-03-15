import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("datos1.txt");
        if (file.exists()) {
            System.out.println("The file exists");         
            System.out.println("Existe? " + file.exists());
            System.out.println("Longitud? " + file.length());
            System.out.println("Ruta? " + file.getAbsolutePath());
            System.exit(1);
        }

        PrintWriter output = new PrintWriter(file);
        output.println("Miguel A. Patraca");
        output.println(10);
        output.println("Patricia M. Moreno");
        output.print(20);

        output.close();

        Scanner input = new Scanner(file);
        while (input.hasNext()) {
                String firstName = input.next();
                String lastName = input.next();
                int score = input.nextInt();
                System.out.println(firstName + " " + lastName + "" + " " + score) ; 
            }
        input.close();


        }
}
