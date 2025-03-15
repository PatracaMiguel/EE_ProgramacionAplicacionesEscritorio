public class App {
    /** Main method */
    public static void main(String[] args) {
        // Check number of strings passed
        if (args.length != 3) {
            System.out.println("Usage: java App operando1 operador operando2");
            System.exit(1);
        }

        // The result of the operation
        int result = 0;

        try {
            // Parse the operands and perform the operation
            int operando1 = Integer.parseInt(args[0]);
            int operando2 = Integer.parseInt(args[2]);

            // Determine the operation
            switch (args[1].charAt(0)) {
                case '+':
                    result = operando1 + operando2;
                    break;
                case '-':
                    result = operando1 - operando2;
                    break;
                case '*':
                    result = operando1 * operando2;
                    break;
                case '/':
                    result = operando1 / operando2;
                    break;
                default:
                    System.out.println("Error: Operador no válido.");
                    System.exit(1);
            }

            // Print the result
            System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + result);

        } catch (NumberFormatException e) {
            // Handle non-numeric operands
            System.out.println("Error: Uno de los operandos no es numérico.");
            System.exit(1);
        } 
    }

    public static boolean esNumerico(String s) {
        return s != null && s.matches("[0-9]+");
    }
}
