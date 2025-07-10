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
        Map<String, String> mapa = new HashMap<>();
        mapa.put("001", "Celular");
        mapa.put("002", "Laptop");
        mapa.put("003", "Celular");
        mapa.put("003", "PC");


        System.out.println(mapa);
        System.out.println(mapa.keySet());

        for(String codigo : mapa.keySet()) {
        System.out.println(mapa.get(codigo));
        }
        System.out.println(mapa.get("001"));
        System.out.println(mapa.get("005"));
    
    }
    public void runLinkedHashMap() {
        // Crear un mapa con clave numeros y valor nombre de personas solo 
        // Integer - String
        // Agregen 5 elementos e imprimir todos los VALORES
        Map<Integer, String> linkedMap = new java.util.LinkedHashMap<>();
        linkedMap.put(001, "Ana");
        linkedMap.put(002, "Maria");
        linkedMap.put(003, "Jose");
        linkedMap.put(004, "Laura");
        linkedMap.put(005, "Pedro");

        for (String nombre : linkedMap.values()) {
            System.out.println(nombre);
        }
    }
    public void runTreeMap() {
        Map<Integer, String> items = new TreeMap<>();
        items.put(3, "carro");
        items.put(6, "bicicleta");
        items.put(1, "moto");
        
        for(String item : items.values()) {
            System.out.println(item);
        }

    }

    public void runHashMapObj(){
        Map<Empleado, Integer> empleados = new HashMap<>();
        empleados.put(new Empleado(1,"Juan", "Dev"), 1200);
        empleados.put(new Empleado(2, "Juan", "Dev"),1500);
        empleados.put(new Empleado(3, "Pedro", "Dev"),2000);
        empleados.put(new Empleado(1, "Juan", "Dev"),2500);
        empleados.put(new Empleado(1, "Diego", "Dev"),3000);

        for (Empleado empleado : empleados.keySet()) {
            System.out.println(empleado + " - Salario: " + empleados.get(empleado));
        }
    }
    public void runTreeMapObj() {
        Map<Empleado, Integer> empleados = new TreeMap<>();
        empleados.put(new Empleado(1,"Juan", "Dev"), 1200);
        empleados.put(new Empleado(2, "Maria", "Dev"),1500);
        empleados.put(new Empleado(3, "Pedro", "Dev"),2000);
        empleados.put(new Empleado(1, "Diego", "Dev"),1200);
        empleados.put(new Empleado(1, "Juan", "Senior"),3000);

        for (Empleado empleado : empleados.keySet()) {
            System.out.println(empleado + " - Salario: " + empleados.get(empleado));
        }
    }
}
