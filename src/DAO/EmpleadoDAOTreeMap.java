package DAO;

import models.Empleado;
import java.util.*;

public class EmpleadoDAOTreeMap implements EmpleadoDAO {
    private final Map<Integer, Empleado> empleados = new TreeMap<>();

    @Override
    public void add(Empleado emp) {
        empleados.put(emp.getId(), emp);
    }

    @Override
    public boolean remove(int id) {
        return empleados.remove(id) != null;
    }

    @Override
    public Empleado get(int id) {
        return empleados.get(id);
    }

    @Override
    public List<Empleado> getAll() {
        return new ArrayList<>(empleados.values());
    }
}