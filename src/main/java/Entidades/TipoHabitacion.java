package Entidades;

public class TipoHabitacion {
    
    int idTipoHabitacion;
    String codigo;
    String nombre;
    int capacidadMaxima;
    int cantidadCamas;
    String tipoCama;
    double precioPorNoche;

    public TipoHabitacion() {
    }

    public TipoHabitacion(String codigo, String nombre, int capacidadMaxima, int cantidadCamas, String tipoCama, double precioPorNoche) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadCamas = cantidadCamas;
        this.tipoCama = tipoCama;
        this.precioPorNoche = precioPorNoche;
    }

    public TipoHabitacion(int idTipoHabitacion, String codigo, String nombre, int capacidadMaxima, int cantidadCamas, String tipoCama, double precioPorNoche) {
        this.idTipoHabitacion = idTipoHabitacion;
        this.codigo = codigo;
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadCamas = cantidadCamas;
        this.tipoCama = tipoCama;
        this.precioPorNoche = precioPorNoche;
    }

    public int getIdTipoHabitacion() {
        return idTipoHabitacion;
    }

    public void setIdTipoHabitacion(int idTipoHabitacion) {
        this.idTipoHabitacion = idTipoHabitacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadCamas() {
        return cantidadCamas;
    }

    public void setCantidadCamas(int cantidadCamas) {
        this.cantidadCamas = cantidadCamas;
    }

    public String getTipoCama() {
        return tipoCama;
    }

    public void setTipoCama(String tipoCama) {
        this.tipoCama = tipoCama;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    @Override
    public String toString() {
        return "TipoHabitacion{" + "idTipoHabitacion=" + idTipoHabitacion + 
                ", codigo=" + codigo + ", nombre=" + nombre + 
                ", capacidadMaxima=" + capacidadMaxima + 
                ", cantidadCamas=" + cantidadCamas + 
                ", tipoCama=" + tipoCama + ", precioPorNoche=" 
                + precioPorNoche + '}';
    }
    
    
    
    
}
