package controller;

import java.util.ArrayList;

public class SalesGroupController {

    private ArrayList<Object> salesGroupList;

    public SalesGroupController() {
        this.salesGroupList = new ArrayList<>();
    }

    public void agregarGrupo(Object grupo) {
        this.salesGroupList.add(grupo);
    }

    public ArrayList<Object> getSalesGroupList() {
        return salesGroupList;
    }
}
