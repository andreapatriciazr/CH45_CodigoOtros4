import java.util.Scanner; // importar el scanner y quitar paquetes que no hay

public class piedraPapelTijera { // definir un nombre relevante a la clase
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = scanner.nextLine().toLowerCase(); 
    
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String j2 = scanner.nextLine().toLowerCase(); 
    
    if (j1.equals(j2))) {
      System.out.println("Empate");
    } else {
      int ganador = 2; // definir variable ganador para mayor entendimiento
      switch(j1) {
        case "piedra":
          if (j2.equals("tijeras")) { 
          ganador = 1;
          }
          break; 

        case "papel":
          if (j2.equals("piedra")) {
          ganador = 1;
          }
          break; 

          case "tijeras":
          if (j2.equals("papel")) {
          ganador = 1;
          }
        break; 

        default:
        System.out.println("Entrada no válida. Por favor, introduzca 'piedra', 'papel' o 'tijeras'.");
        scanner.close(); // cerrar scanner
        return; 
      }

      System.out.println("Gana el jugador " + ganador); // mostrar ganador
    }
  
     scanner.close(); // Cerrar el scanner
    } // main
} // class piedraPapelTijera