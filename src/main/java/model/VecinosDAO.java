package model;

import config.ConnectionSQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VecinosDAO {

    Connection connection;

    public VecinosDAO() {
        ConnectionSQL con = new ConnectionSQL();
        connection = con.getConnection();
    }

    public List<Vecinos> listar(){
        PreparedStatement ps;
        ResultSet rs;
        List<Vecinos> lista = new ArrayList<>();

        try{
            ps = connection.prepareStatement("SELECT * FROM vecinos");
            rs = ps.executeQuery();

            while (rs.next()){
                String dni = rs.getString("DNI");
                String apellido_paterno = rs.getString("Apellido_Paterno_Vecinos");
                String apellido_materno = rs.getString("Apellido_Materno_Vecinos");
                String nombres = rs.getString("Nombre_Vecinos");

                Vecinos objeto = new Vecinos(dni, apellido_paterno, apellido_materno, nombres);
                lista.add(objeto);
            }
            return lista;
        } catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }
    public Vecinos mostrar(String _dni){
        PreparedStatement ps;
        ResultSet rs;
        Vecinos objeto = null;

        try{
            ps = connection.prepareStatement("SELECT * FROM vecinos WHERE DNI=?");
            ps.setString(1,_dni);
            rs = ps.executeQuery();

            while (rs.next()){
                String dni = rs.getString("DNI");
                String apellido_paterno = rs.getString("Apellido_Paterno_Vecino");
                String apellido_materno = rs.getString("Apelllido_Materno_Vecino");
                String nombres = rs.getString("Nombre_Vecinos");

                objeto = new Vecinos(dni, apellido_paterno, apellido_materno, nombres);
            }
            return objeto;
        } catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }
}
