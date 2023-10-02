package Entidades;

public class Habitaciones {
    int idHabitacion;
    int nroHabitacion;
    int piso;
    boolean ocupada;
    int idTipoHabitacion;

    public Habitaciones() {
    }

    public Habitaciones(int nroHabitacion, int piso, boolean ocupada, int idTipoHabitacion) {
        this.nroHabitacion = nroHabitacion;
        this.piso = piso;
        this.ocupada = ocupada;
        this.idTipoHabitacion = idTipoHabitacion;
    }

    public Habitaciones(int idHabitacion, int nroHabitacion, int piso, boolean ocupada, int idTipoHabitacion) {
        this.idHabitacion = idHabitacion;
        this.nroHabitacion = nroHabitacion;
        this.piso = piso;
        this.ocupada = ocupada;
        this.idTipoHabitacion = idTipoHabitacion;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public int getNroHabitacion() {
        return nroHabitacion;
    }

    public void setNroHabitacion(int nroHabitacion) {
        this.nroHabitacion = nroHabitacion;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public int getIdTipoHabitacion() {
        return idTipoHabitacion;
    }

    public void setIdTipoHabitacion(int idTipoHabitacion) {
        this.idTipoHabitacion = idTipoHabitacion;
    }

    @Override
    public String toString() {
        return "Habitaciones{" + "idHabitacion=" + idHabitacion + 
                ", nroHabitacion=" + nroHabitacion + ", piso=" + piso + 
                ", ocupada=" + ocupada + ", idTipoHabitacion=" + 
                idTipoHabitacion + '}';
    }
    
    

}
