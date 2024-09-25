package com.marriaga.generics.model;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado<T> {

    private List<T> bolsaSuper;
    private int maxProductos = 5;

    public BolsaSupermercado() {
        this.bolsaSuper = new ArrayList<>();
    }

    public List<T> getBolsaSuper() {
        return bolsaSuper;
    }

    public void addProductos(T objeto) {
        if (bolsaSuper.size() < maxProductos) {
            bolsaSuper.add(objeto);
        } else {
            throw new RuntimeException("No hay más espacio");
        }
    }
}
