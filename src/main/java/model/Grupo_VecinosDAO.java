package model;

import config.ConnectionSQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Grupo_VecinosDAO {

    Connection connection;

    public Grupo_VecinosDAO() {
        ConnectionSQL con = new ConnectionSQL();
        connection = con.getConnection();
    }

    public List<Grupo_Vecinos> listar(){
        PreparedStatement ps;
        ResultSet rs;
        List<Grupo_Vecinos> lista = new ArrayList<>();

        try{
            ps = connection.prepareStatement("SELECT * FROM grupo_de_vecinos");
            rs = ps.executeQuery();

            while (rs.next()){
                int clave_grupo_de_vecinos = rs.getInt("Clave_Grupo_de_Vecinos");
                String colonia_grupo_de_vecinos = rs.getString("Colonia_Grupo_de_Vecinos");
                String dni = rs.getString("DNI");

                Grupo_Vecinos objeto = new Grupo_Vecinos(clave_grupo_de_vecinos, colonia_grupo_de_vecinos, dni);
                lista.add(objeto);
            }
            return lista;
        } catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }
    public Grupo_Vecinos mostrar(int _cve_vecinos, String _dni){
        PreparedStatement ps;
        ResultSet rs;
        Grupo_Vecinos objeto = null;

        try{
            ps = connection.prepareStatement("SELECT * FROM grupo_de_vecinos WHERE Clave_Grupo_de_Vecinos=? AND DNI=?");
            ps.setInt(1,_cve_vecinos);
            ps.setString(2,_dni);
            rs = ps.executeQuery();

            while (rs.next()){
                int clave_grupo_de_vecinos = rs.getInt("Clave_Grupo_de_Vecinos");
                String colonia_grupo_de_vecinos = rs.getString("Colonia_Grupo_de_Vecinos");
                String dni = rs.getString("DNI");

                objeto = new Grupo_Vecinos(clave_grupo_de_vecinos, colonia_grupo_de_vecinos, dni);
            }
            return objeto;
        } catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }
}
