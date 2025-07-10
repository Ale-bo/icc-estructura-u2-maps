package controllers;
import DAO.EmpleadoDAOTreeMap;
import models.Empleado;

public class EmpleadoControllerTree {
    private EmpleadoDAOTreeMap empleadoDAO;

    public EmpleadoControllerTree() {
        this.empleadoDAO = new EmpleadoDAOTreeMap();
    }

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
