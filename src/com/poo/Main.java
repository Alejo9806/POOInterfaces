package com.poo;

public class Main {
    static CocheCRUD cocheCRUD = new CocheCRUDImpl();
    public static void main(String[] args) {
        Coche coche = new Coche("mazda","r400","31pwasd",2022);
        cocheCRUD.save(coche);
        cocheCRUD.findAll();
        cocheCRUD.delete();
    }
}
