package com.poo;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save(Coche coche) {
        System.out.println("Coche guardado" +" " + coche);
    }

    @Override
    public List<Coche> findAll() {
        System.out.println("Lista de coches");
        return null;
    }

    @Override
    public void delete() {
        System.out.println("Coche eliminado");
    }
}
