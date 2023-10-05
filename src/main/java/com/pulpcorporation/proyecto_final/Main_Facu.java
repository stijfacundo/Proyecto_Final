package com.pulpcorporation.proyecto_final;

import Datas.HabitacionData;
import Datas.HuespedData;
import Datas.TipoHabitacionData;
import Entidades.Habitacion;
import Entidades.Huesped;
import Entidades.TipoHabitacion;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Main_Facu {

    public static void main(String[] args) {
        try {
            // Creamos un TipoHabitacion y TipoHabitacionData
//            TipoHabitacion tipoHabitacion1 = new TipoHabitacion("SE", 
//                    "Suite Ejecutiva", 4, 2, 
//                    "x2 2 plazas", 1000000);
//            TipoHabitacionData tipoHabitacionData = new TipoHabitacionData();
            
            // Cargamos el TipoHabitacion a la base de datos
//            tipoHabitacionData.altaTipoHabitacion(tipoHabitacion1);
            
            // Modificamos un tipo de habitación
//            TipoHabitacion tipoHabitacion2 = new TipoHabitacion("SE", 
//                    "Suite Ejecutiva", 4, 2, 
//                    "x2 2 plazas", 500000);
//            tipoHabitacionData.modificarTipoHabitacion(tipoHabitacion2, "SE");

            
            // Creamos una Habitacion y HabitacionData
//            Habitacion habitacion1 = new Habitacion(10, 2, false, "SE");
//            HabitacionData habitacionData = new HabitacionData();
            
            // Cargamos la Habitacion a la base de datos
//            habitacionData.guardarHabitacion(habitacion1);
            
            // Modificamos una habitación
//            Habitacion habitacion2 = new Habitacion(10, 3, false, "SE");
//            habitacionData.modificarHabitacion(habitacion2, 10);
            
            
            // Creamos un Huesped y un HuespedData
//            Huesped huesped1 = new Huesped("Facundo", "Stij",
//                    40952310, "Av. Alberdi", "facundostij@correo.com",
//                    "3764928124", true);
//            HuespedData huespedData = new HuespedData();
            
            // Cargamos el Huesped a la base de datos
//            huespedData.altaHuesped(huesped1);

            // Modificamos un huesped
//            Huesped huesped2 = new Huesped("Facundo", "Stij",
//                    40952310, "Av. Alberdi", "stijfacundo@correo.com",
//                    "3764928124", true);
//            huespedData.modificarHuesped(huesped2, 40952310);
            
            // Damos de baja un huesped
//            huespedData.bajaHuesped(40952310);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error SQL: " + ex.getMessage());
        }
    }
}
