package model;

import config.ConnectionSQL;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EventosDAO {

    Connection connection;

    public EventosDAO() {
        ConnectionSQL con = new ConnectionSQL();
        connection = con.getConnection();
    }
    public List<Eventos> listar(){
        PreparedStatement ps;
        ResultSet rs;
        List<Eventos> lista = new ArrayList<>();

        try{
            ps = connection.prepareStatement("SELECT * FROM eventos");
            rs = ps.executeQuery();

            while (rs.next()){
                int clave_eventos = rs.getInt("Clave_Eventos");
                int dia_eventos = rs.getInt("Dia_Eventos");
                int mes_eventos = rs.getInt("Mes_Eventos");
                String colonia_eventos = rs.getString("Colonia_Eventos");
                String calle_eventos = rs.getString("Calle_Eventos");
                Time hora_de_inicio_Eventos = rs.getTime("Hora_de_Inicio_Eventos");
                Time hora_de_final_eventos = rs.getTime("Hora_de_Final_Eventos");

                Eventos objeto = new Eventos(clave_eventos,dia_eventos, mes_eventos, colonia_eventos, calle_eventos, hora_de_inicio_Eventos, hora_de_final_eventos);
                lista.add(objeto);
            }
            return lista;
        } catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }
    public Eventos mostrar(int _cve_eventos){
        PreparedStatement ps;
        ResultSet rs;
        Eventos objeto = null;

        try{
            ps = connection.prepareStatement("SELECT * FROM eventos WHERE Clave_Eventos=?");
            ps.setInt(1, _cve_eventos);
            rs = ps.executeQuery();

            while (rs.next()){
                int clave_eventos = rs.getInt("Clave_Eventos");
                int dia_eventos = rs.getInt("Dia_Eventos");
                int mes_eventos = rs.getInt("Mes_Eventos");
                String colonia_eventos = rs.getString("Colonia_Eventos");
                String calle_eventos = rs.getString("Calle_Eventos");
                Time hora_de_inicio_Eventos = rs.getTime("Hora_de_Inicio_Eventos");
                Time hora_de_final_eventos = rs.getTime("Hora_de_Final_Eventos");

                objeto = new Eventos(clave_eventos,dia_eventos, mes_eventos, colonia_eventos, calle_eventos, hora_de_inicio_Eventos, hora_de_final_eventos);
            }
            return objeto;
        } catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }
}
