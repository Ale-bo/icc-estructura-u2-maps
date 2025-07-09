package controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import models.Empleado;

public class Mapa {
    public Mapa() {
        System.out.println("Mapa Class");
    }

    public void runHashMap() {
        Map<String, String> mapa = new HashMap();
        mapa.put("001", "Celular");
        mapa.put("002", "Laptop");       
        mapa.put("003", "Celular");
        mapa.put("003", "PC");

        System.out.println(mapa);
        System.out.println(mapa.keySet());
        
        for (String codigo : mapa.keySet()) {
            System.out.println(mapa.get(codigo));
        }

        System.out.println(mapa.get("001"));
        System.out.println(mapa.get("005"));
    }   

    public void runLinkedHashMap() {
        Map<Integer, String> linkedMap = new HashMap();
        linkedMap.put(1, "Ana");
        linkedMap.put(2, "Maria");        
        linkedMap.put(3, "Juan");
        linkedMap.put(4, "Israel");
        linkedMap.put(5, "Alexandra");

        for(String nombre : linkedMap.values()) {
            System.out.println(nombre);
        }
        System.out.println(linkedMap.get(3));
        System.out.println(linkedMap.get(6)); // null, no existe la clave
    }

    public void runTreeMap() {
        Map<Integer, String> treeMap = new HashMap();
        treeMap.put(3, "carro");
        treeMap.put(6, "bicicleta");        
        treeMap.put(1, "moto");

        System.out.println(treeMap);
        System.out.println(treeMap.keySet());
    }

    public void runHashMapObj(){
        Map<Empleado, Integer> empleados = new HashMap();

        empleados.put(new Empleado("1", "Juan", "Dev"), 1200);
        empleados.put(new Empleado("2", "Juan", "Dev"), 1500);
        empleados.put(new Empleado("3", "Pedro", "Dev"), 2000);
        empleados.put(new Empleado("1", "Juan", "Dev"), 2500);
        empleados.put(new Empleado("1", "Diego", "Dev"), 3000);
        
        for (Empleado empleado : empleados.keySet()) {
            System.out.println(empleado + " - Salario: " + empleados.get(empleado));
        }
    }

    public void runtreeMapObj(){
        Map<Empleado, Integer> empleados = new TreeMap();

        empleados.put(new Empleado("1", "Juan", "Dev"), 1200);
        empleados.put(new Empleado("2", "Juan", "Dev"), 1500);
        empleados.put(new Empleado("3", "Pedro", "Dev"), 2000);
        empleados.put(new Empleado("1", "Diego", "Dev"), 1200);
        empleados.put(new Empleado("1", "Juan", "Dev"), 1200);

        for (Empleado empleado : empleados.keySet()) {
            System.out.println(empleado + " - Salario: " + empleados.get(empleado));
        }
    }
}
