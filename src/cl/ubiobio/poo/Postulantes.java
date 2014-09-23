package cl.ubiobio.poo;

/**
 * Created by SAMSUNG on 23-09-2014.
 */
public class Postulantes {

    private String Rut;
    private String Nombre;
    private String FechaNacimiento;

    public Postulantes() {

    }

    public Postulantes(String rut, String nombre) {
        Rut = rut;
        Nombre = nombre;
    }

    public String getRut() {
        return Rut;
    }

    public void setRut(String rut) {
        Rut = rut;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }
}
