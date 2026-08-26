package controller;

import java.util.ArrayList;
import model.Gamer;

public class GamerController {

    private ArrayList<Gamer> gamerList;

    public GamerController() {
        this.gamerList = new ArrayList<>();
        this.loadData();
    }

    /
    public void agregarGamer(Gamer gamer) {
        this.gamerList.add(gamer);
    }

    /
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

    
    public void modificarGamer(Gamer gamer) {
        int index = this.gamerList.indexOf(gamer);
        if (index != -1) {
            this.gamerList.set(index, gamer);
        }
    }

    
    public void borrarGamer(Gamer gamer) {
        this.gamerList.remove(gamer);
    }

    /
    private void loadData() {
        this.gamerList.add(new Gamer(1, "lopez", "lopez", "123", 99));
        this.gamerList.add(new Gamer(2, "harry potter", "potter", "123", 45));
        this.gamerList.add(new Gamer(3, "bruce wayne", "batman", "potter32", 80));
    }

    public ArrayList<Gamer> getGamerList() {
        return gamerList;
    }
}
