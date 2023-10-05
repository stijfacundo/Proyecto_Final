package com.pulpcorporation.proyecto_final;

import Datas.HabitacionData;
import Entidades.Habitacion;
import java.sql.SQLException;

public class Main_Dani {

    public static void main(String[] args) throws SQLException {
        
        Habitacion habita = new Habitacion (1, 1, true, "1");
        HabitacionData nueva = new HabitacionData();
        nueva.guardarHabitacion(habita);
        System.out.println(habita);
        
    }
    
}
