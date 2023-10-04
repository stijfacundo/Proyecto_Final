package Entidades;

public class Habitaciones {
    int idHabitacion;
    int nroHabitacion;
    int piso;
    boolean ocupada;
    String codigoTipoHabitacion;

    public Habitaciones() {
    }

    public Habitaciones(int nroHabitacion, int piso, boolean ocupada, String codigoTipoHabitacion) {
        this.nroHabitacion = nroHabitacion;
        this.piso = piso;
        this.ocupada = ocupada;
        this.codigoTipoHabitacion = codigoTipoHabitacion;
    }

    public Habitaciones(int idHabitacion, int nroHabitacion, int piso, boolean ocupada, String codigoTipoHabitacion) {
        this.idHabitacion = idHabitacion;
        this.nroHabitacion = nroHabitacion;
        this.piso = piso;
        this.ocupada = ocupada;
        this.codigoTipoHabitacion = codigoTipoHabitacion;
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

    public String getcodigoTipoHabitacion() {
        return codigoTipoHabitacion;
    }

    public void setcodigoTipoHabitacion(String codigoTipoHabitacion) {
        this.codigoTipoHabitacion = codigoTipoHabitacion;
    }

    @Override
    public String toString() {
        return "Habitaciones{" + "idHabitacion=" + idHabitacion + 
                ", nroHabitacion=" + nroHabitacion + ", piso=" + piso + 
                ", ocupada=" + ocupada + ", codigoTipoHabitacion=" + 
                codigoTipoHabitacion + '}';
    }
    
    

}
