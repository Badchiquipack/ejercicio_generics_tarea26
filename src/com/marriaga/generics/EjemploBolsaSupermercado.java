package com.marriaga.generics;

import com.marriaga.generics.model.*;

public class EjemploBolsaSupermercado {
    public static void main(String[] args) {

        BolsaSupermercado<Lacteo> bolsaLacteos = new BolsaSupermercado<>();
        BolsaSupermercado<Fruta> bolsaFrutas = new BolsaSupermercado<>();
        BolsaSupermercado<Limpieza> bolsaLimpieza = new BolsaSupermercado<>();
        BolsaSupermercado<NoPerecible> bolsaNoPerecibles = new BolsaSupermercado<>();

        bolsaLacteos.addProductos(new Lacteo("Leche", 25.5, 1, 700));
        bolsaLacteos.addProductos(new Lacteo("Yogurt", 47.0, 1, 1300));
        bolsaLacteos.addProductos(new Lacteo("Crema", 17.5, 4, 600));
        bolsaLacteos.addProductos(new Lacteo("Queso", 25.5, 2, 800));
        bolsaLacteos.addProductos(new Lacteo("Mantequilla", 19.5, 2, 650));

        bolsaFrutas.addProductos(new Fruta("Mango", 21.99, .7, "Amarillo"));
        bolsaFrutas.addProductos(new Fruta("Manzana", 17.6, 1.0, "Rojo"));
        bolsaFrutas.addProductos(new Fruta("Naranaja", 33.0, 2.0, "Naranja"));
        bolsaFrutas.addProductos(new Fruta("Fresa", 31.90, 1.5, "Rojo"));
        bolsaFrutas.addProductos(new Fruta("Sandía", 33.9, 3.0, "Verde"));

        bolsaLimpieza.addProductos(new Limpieza("Windex", 37.5, "Jabón", 1.0));
        bolsaLimpieza.addProductos(new Limpieza("Cloralex", 15.5, "Cloro", 1.0));
        bolsaLimpieza.addProductos(new Limpieza("Foca", 23.9, "Jabón en polvo", .5));
        bolsaLimpieza.addProductos(new Limpieza("Brasso", 41.3, "Ácido", .7));
        bolsaLimpieza.addProductos(new Limpieza("Fabuloso", 25.7, "Agua", .800));

        bolsaNoPerecibles.addProductos(new NoPerecible("Azúcar", 23.5, 1, 1500));
        bolsaNoPerecibles.addProductos(new NoPerecible("Café", 77.5, 1, 800));
        bolsaNoPerecibles.addProductos(new NoPerecible("Sal", 33.8, 1, 1790));
        bolsaNoPerecibles.addProductos(new NoPerecible("Pimienta", 89.4, 2, 490));
        bolsaNoPerecibles.addProductos(new NoPerecible("Clavo", 15.8, 1, 480));
        //bolsaNoPerecibles.addProductos(new NoPerecible("Clavo", 15.8, 1, 480));

        System.out.println("====== Frutas ======");
        for (Fruta fruta : bolsaFrutas.getBolsaSuper()) {
            System.out.println("Nombre: " + fruta.getNombre());
            System.out.println("Precio: " + fruta.getPrecio());
            System.out.println("Peso: " + fruta.getPeso());
            System.out.println("Color: " + fruta.getColor() + "\n");
        }
        System.out.println();

        System.out.println("====== Lácteos ======");
        for (Lacteo lacteo : bolsaLacteos.getBolsaSuper()) {
            System.out.println("Nombre: " + lacteo.getNombre());
            System.out.println("Precio: " + lacteo.getPrecio());
            System.out.println("Cantidad: " + lacteo.getCantidad());
            System.out.println("Proteínas: " + lacteo.getProteinas() + "\n");
        }
        System.out.println();

        System.out.println("====== Limpieza ======");
        for (Limpieza limpieza : bolsaLimpieza.getBolsaSuper()) {
            System.out.println("Nombre: " + limpieza.getNombre());
            System.out.println("Precio: " + limpieza.getPrecio());
            System.out.println("Componentes: " + limpieza.getComponentes());
            System.out.println("Litros: " + limpieza.getLitros() + "\n");
        }
        System.out.println();
        System.out.println("====== No Perecibles ======");
        for (NoPerecible noPerecible : bolsaNoPerecibles.getBolsaSuper()) {
            System.out.println("Nombre: " + noPerecible.getNombre());
            System.out.println("Precio: " + noPerecible.getPrecio());
            System.out.println("Contenido: " + noPerecible.getContenido());
            System.out.println("Calorías: " + noPerecible.getContenido() + "\n");
        }
    }
}
