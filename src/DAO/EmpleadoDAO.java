package DAO;

import models.Empleado;
import java.util.List;

public interface EmpleadoDAO {
    void add(Empleado emp);
    boolean remove(int id);
    Empleado get(int id);
    List<Empleado> getAll();
}
