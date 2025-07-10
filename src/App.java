import DAO.EmpleadoDAOHashMap;
import DAO.EmpleadoDAOHashMap;
import DAO.EmpleadoDAOTreeMap;
import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;
import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("----Practica Maps----");
        System.out.println("Nombre: Ivanna Nievecela ");
        runMapExamlpe();
        runEmpleadoExample();

    }

    private static void runMapExamlpe() {
        // Mapa mapa = new Mapa();
        // System.out.println("HashMap Example");
        // mapa.runHashMap();
        // System.out.println("LinkedHashMap Example");
        // mapa.runLinkedHashMap();
        // System.out.println("TreeMap Example");
        // mapa.runTreeMap();
        // System.out.println("HashMap with Objects Example");
        // mapa.runHashMapObj();
        // System.out.println("TreeMap with Objects Example");
        // mapa.runTreeMapObj();
    }

    private static void runEmpleadoExample() {
        EmpleadoContoller hashCtrl = 
            new EmpleadoContoller(new EmpleadoDAOHashMap());
        EmpleadoContoller treeCtrl = 
            new EmpleadoContoller(new EmpleadoDAOTreeMap());

        Empleado e1 = new Empleado(1, "Juan",  "DEV");
        Empleado e2 = new Empleado(2, "Pedro", "DEV");
        Empleado e3 = new Empleado(3, "Maria", "DEV");
        Empleado e4 = new Empleado(4, "Pedro", "DEV");
        Empleado e5 = new Empleado(5, "Juan",  "DEV");

        hashCtrl.agregarEmpleado(e1);
        hashCtrl.agregarEmpleado(e2);
        hashCtrl.agregarEmpleado(e3);
        hashCtrl.agregarEmpleado(e4);
        hashCtrl.agregarEmpleado(e5);

        treeCtrl.agregarEmpleado(e1);
        treeCtrl.agregarEmpleado(e2);
        treeCtrl.agregarEmpleado(e3);
        treeCtrl.agregarEmpleado(e4);
        treeCtrl.agregarEmpleado(e5);

        hashCtrl.listarEmpleados("Lista de empleados HASH :");
        hashCtrl.eliminarEmpleado(2);
        hashCtrl.listarEmpleados("Lista de empleados HASH :");

        treeCtrl.listarEmpleados("Lista de empleados TREE:");
        treeCtrl.eliminarEmpleado(2);
        treeCtrl.listarEmpleados("Lista de empleados TREE:");
    }


    private static void runEjerccios() {
        throw new UnsupportedOperationException("Not implemented yet");

    }
}

