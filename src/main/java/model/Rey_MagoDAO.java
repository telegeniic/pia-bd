package model;

import config.ConnectionSQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Rey_MagoDAO {

    Connection connection;

    public Rey_MagoDAO() {
        ConnectionSQL con = new ConnectionSQL();
        connection = con.getConnection();
    }

    public List<Rey_Mago> listar(){
        PreparedStatement ps;
        ResultSet rs;
        List<Rey_Mago> lista = new ArrayList<>();

        try{
            ps = connection.prepareStatement("SELECT * FROM rey_mago");
            rs = ps.executeQuery();

            while (rs.next()){
                int clave_rey_mago = rs.getInt("Clave_Rey_Mago");
                String nombre = rs.getString("Nombre_Rey_Mago");
                String dni = rs.getString("DNI");

                Rey_Mago objeto = new Rey_Mago(clave_rey_mago,nombre,dni);
                lista.add(objeto);
            }
            return lista;
        } catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }
    public Rey_Mago mostrar(int _cve){
        PreparedStatement ps;
        ResultSet rs;
        Rey_Mago objeto = null;

        try{
            ps = connection.prepareStatement("SELECT * FROM rey_mago WHERE Clave_Rey_Mago=?");
            ps.setInt(1,_cve);
            rs = ps.executeQuery();

            while (rs.next()){
                int clave_rey_mago = rs.getInt("Clave_Rey_Mago");
                String nombre = rs.getString("Nombre_Rey_Mago");
                String dni = rs.getString("DNI");

                objeto = new Rey_Mago(clave_rey_mago,nombre,dni);
            }
            return objeto;
        } catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }
}
