import java.util.Scanner; // importar el scanner y quitar paquetes que no hay

public class piedraPapelTijera { // definir un nombre relevante a la clase
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = scanner.nextLine().toLowerCase(); 
    
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String j2 = scanner.nextLine().toLowerCase(); 
    
    if (j1 == j2)) {
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2 == "tijeras") {
            g = 1;
          }

        case "papel":
          if (j2 == "piedra") {
            g = 1;
          
        case "tijeras":
          if (j2.equals("papel")) {
            g = 1;
          }
          break;

        default:
        System.out.println("Entrada no válida. Por favor, introduzca 'piedra', 'papel' o 'tijeras'.");
        scanner.close(); // cerrar scanner
        return; 
      }

      System.out.println("Gana el jugador " + g); // mostrar ganador
    }
  
     scanner.close(); // Cerrar el scanner
    } // main
} // class piedraPapelTijera