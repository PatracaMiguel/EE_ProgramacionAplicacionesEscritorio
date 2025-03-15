import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos candidatos hay?");
        int totalCandidatos = scanner.nextInt();

        int[] candidatos = new int[totalCandidatos];
        int[] porcentaje = new int[totalCandidatos];

        for (int i = 0; i < totalCandidatos; i++) {
            System.out.println("ID del candidato:");
            candidatos[i] = scanner.nextInt();
            porcentaje[i] = 0;
        }
        int totalVotos = 0;
        int votos;
        System.out.println("Recuento de votos");
        System.out.println("escrib e 0 para terminar los votos ");
        do {
            votos = scanner.nextInt();
            if (votos > 0) {
                int i = 0;
                for(i = 0; i < candidatos.length; i++) {
                    if (votos == candidatos[i]) {
                        porcentaje[i]++;
                        totalVotos++;
                        break; 
                    }
                }
                if (i == candidatos.length) {
                    System.out.println("el candidato ni existe");
                }
            }
        } while (votos > 0);
        
        int Ganador = porcentaje[0];
        int idGanador = candidatos[0];

        for (int i = 0; i < totalCandidatos; i++) {
            if ( porcentaje[i] > Ganador) {
                Ganador = porcentaje[i];
                idGanador = candidatos[i];
            }
        }
            double porcentajeGanador = (Ganador * 100.0) / totalVotos;
            System.out.println("\nCandidato Ganador:");
            System.out.println("Candidato " + idGanador + " tuvo " + Ganador + " votos (" + porcentajeGanador + "%)");
        }
    }

