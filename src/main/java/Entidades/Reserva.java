package Entidades;

import java.time.LocalDate;

public class Reserva {

    private int idReserva;
    private Huesped huesped;
    private int numeroHabitacion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double monto;
    private boolean estado;

    public Reserva(Huesped huesped, int numeroHabitacion,
            LocalDate fechaInicio, LocalDate fechaFin, double monto, boolean estado) {
        this.huesped = huesped;
        this.numeroHabitacion = numeroHabitacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.monto = monto;
        this.estado = estado;
    }

    public Reserva(int idHuesped, int numeroHabitacion, LocalDate fechaInicio,
            LocalDate fechaFin, double monto, boolean estado) {
        this.huesped = new Huesped(idHuesped); // Creamos el objeto Huesped con el ID proporcionado
        this.numeroHabitacion = numeroHabitacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.monto = monto;
        this.estado = estado;
    }

    public Reserva(int idReserva, Huesped huesped, int numeroHabitacion,
            LocalDate fechaInicio, LocalDate fechaFin, double monto, boolean estado) {
        this.idReserva = idReserva;
        this.huesped = huesped;
        this.numeroHabitacion = numeroHabitacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.monto = monto;
        this.estado = estado;
    }

    public Reserva() {
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public int getDniHuesped() {
        return huesped.getDni();
    }

    public void setDniHuesped(int dni) {
        // Nos aseguramos de que el objeto Huesped no sea nulo
        if (huesped == null) {
            huesped = new Huesped(); // Si es nulo lo inicializamos
        }
        huesped.setDni(dni);
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", huesped=" + huesped
                + ", numeroHabitacion=" + numeroHabitacion + ", fechaInicio="
                + fechaInicio + ", fechaFin=" + fechaFin + ", monto=" + monto
                + ", estado=" + estado + '}';
    }

}
