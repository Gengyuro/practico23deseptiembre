package cl.ubiobio.poo;

import java.util.Date;

/**
 * Created by SAMSUNG on 23-09-2014.
 */
public class Matricula {
    private Postulantes est;
    private Carrera car;
    private Float puntajePonderado;
    private Date fechaMatricula;

    public Matricula() {

    }

    public Matricula(Postulantes est, Carrera car, Float puntajePonderado, Date fechaMatricula) {
        this.est = est;
        this.car = car;
        this.puntajePonderado = puntajePonderado;
        this.fechaMatricula = fechaMatricula;
    }

    public Postulantes getEst() {
        return est;
    }

    public void setEst(Postulantes est) {
        this.est = est;
    }

    public Carrera getCar() {
        return car;
    }

    public void setCar(Carrera car) {
        this.car = car;
    }

    public Float getPuntajePonderado() {
        return puntajePonderado;
    }

    public void setPuntajePonderado(Float puntajePonderado) {
        this.puntajePonderado = puntajePonderado;
    }

    public Date getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(Date fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }
}
