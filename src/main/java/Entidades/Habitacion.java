package Entidades;

public class Habitacion {
    int idHabitacion;
    int nroHabitacion;
    int piso;
    boolean ocupada;
    String codigoTipoHabitacion;
    double precioPorNoche;
    boolean estado;

    public Habitacion() {
    }

    public Habitacion(int nroHabitacion, int piso, boolean ocupada, String codigoTipoHabitacion) {
        this.nroHabitacion = nroHabitacion;
        this.piso = piso;
        this.ocupada = ocupada;
        this.codigoTipoHabitacion = codigoTipoHabitacion;
        this.estado = estado;
        
    }

    public Habitacion(int idHabitacion, int nroHabitacion, int piso, boolean ocupada, String codigoTipoHabitacion) {
        this.idHabitacion = idHabitacion;
        this.nroHabitacion = nroHabitacion;
        this.piso = piso;
        this.ocupada = ocupada;
        this.codigoTipoHabitacion = codigoTipoHabitacion;
        this. estado = estado;
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

        public String getCodigoTipoHabitacion() {
        return codigoTipoHabitacion;
    }

    public void setCodigoTipoHabitacion(String codigoTipoHabitacion) {
        this.codigoTipoHabitacion = codigoTipoHabitacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }
       
    @Override
    public String toString() {
        return "Habitaciones{" + "idHabitacion=" + idHabitacion + 
                ", nroHabitacion=" + nroHabitacion + ", piso=" + piso + 
                ", ocupada=" + ocupada + ", codigoTipoHabitacion=" + 
                codigoTipoHabitacion + '}';
    }
    
    

}
