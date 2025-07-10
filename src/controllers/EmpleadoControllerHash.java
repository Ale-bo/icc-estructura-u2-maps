package controllers;

import DAO.EmpleadoDAOHashMap;
import models.Empleado;

public class EmpleadoControllerHash {

    private EmpleadoDAOHashMap empleadoDAO = new EmpleadoDAOHashMap();

    public void agregarEmpleado(Empleado empleado) {
        empleadoDAO.add(empleado);
    }

    public void eliminarEmpleado(int id) {
        empleadoDAO.remove(id);
    }

    public void listarEmpleados() {
        empleadoDAO.getAll().forEach(System.out::println);
    }

}
