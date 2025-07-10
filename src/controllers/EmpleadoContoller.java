package controllers;

import DAO.EmpleadoDAO;
import models.Empleado;
import java.util.List;

public class EmpleadoContoller {
    private final EmpleadoDAO empleadoDAO;

    public EmpleadoContoller(EmpleadoDAO empleadoDAO) {
        this.empleadoDAO = empleadoDAO;
    }

    public void agregarEmpleado(Empleado emp) {
        empleadoDAO.add(emp);
    }

    public void eliminarEmpleado(int id) {
        empleadoDAO.remove(id);
    }

    public void listarEmpleados(String titulo) {
        System.out.println(titulo);
        List<Empleado> todos = empleadoDAO.getAll();
        for (Empleado e : todos) {
            System.out
              .println("ID: " + e.getId()
                       + ", Name: " + e.getName()
                       + ", Position: " + e.getPosition());
        }
    }
}
