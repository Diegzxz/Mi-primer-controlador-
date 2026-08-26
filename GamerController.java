package controller;

import java.util.ArrayList;
import model.Gamer; // Importa el modelo correspondiente

public class GamerController {

    // Atributo: Lista que funciona como base de datos en memoria
    private ArrayList<Gamer> gamerList;

    // Constructor sin parámetros
    public GamerController() {
        this.gamerList = new ArrayList<>();
        this.loadData(); // Carga la base de datos temporal
    }

    // --- MÉTODOS CRUD ---

    // 1. CREATE: Agregar
    public void agregarGamer(Gamer gamer) {
        this.gamerList.add(gamer);
    }

    // 2. READ: Buscar por ID
    public Gamer buscarGamer(int id) {
        Gamer gamerEncontrado = new Gamer();
        for (Gamer g : this.gamerList) {
            if (g.getIdGamer() == id) {
                gamerEncontrado = g;
                break;
            }
        }
        return gamerEncontrado;
    }

    // 3. UPDATE: Modificar
    public void modificarGamer(Gamer gamer) {
        int index = this.gamerList.indexOf(gamer);
        if (index != -1) {
            this.gamerList.set(index, gamer);
        }
    }

    // 4. DELETE: Borrar
    public void borrarGamer(Gamer gamer) {
        this.gamerList.remove(gamer);
    }

    // --- BASE DE DATOS TEMPORAL ---
    private void loadData() {
        this.gamerList.add(new Gamer(1, "lopez", "lopez", "123", 99));
        this.gamerList.add(new Gamer(2, "harry potter", "potter", "123", 45));
        this.gamerList.add(new Gamer(3, "bruce wayne", "batman", "potter32", 80));
    }

    // Getter para la lista
    public ArrayList<Gamer> getGamerList() {
        return gamerList;
    }
}
