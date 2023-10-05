package com.pulpcorporation.proyecto_final;

import Datas.HabitacionData;
import Entidades.Habitacion;
import java.sql.SQLException;

public class Main_Dani {

    public static void main(String[] args) throws SQLException {
        
        Habitacion habita = new Habitacion (1, 1, true, "SP1");
        Habitacion habita2 = new Habitacion (20, 3, false, "SP1");
        HabitacionData nueva = new HabitacionData();
        //nueva.guardarHabitacion(habita);
        
        //nueva.buscarHabitacionPorNro(1);
        
        //nueva.buscarHabitacionPorEstado(true);
        
        //nueva.eliminarHabitacion(1);
        
        nueva.modificarHabitacion(habita2);
        
        
        System.out.println(habita);
        
        
    }
    
}
