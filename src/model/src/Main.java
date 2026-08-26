import controller.GamerController;
import model.Gamer;

public class Main {
    public static void main(String[] args) {
        // Instancia del controlador
        GamerController controller = new GamerController();

        // Probar la búsqueda
        Gamer g = controller.buscarGamer(1);
        System.out.println("Jugador encontrado: " + g.getNombre());
    }
}
