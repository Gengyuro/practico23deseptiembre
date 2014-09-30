package cl.ubiobio.poo;

/**
 * Created by SAMSUNG on 23-09-2014.
 */
public class Carrera {
    private String Nombre;
    private int Cupos;
    private String Codigo;

    public String getNombre(){
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getCupos() {
        return Cupos;
    }

    public void setCupos(int cupos) {
        Cupos = cupos;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }
}
