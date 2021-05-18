package model;

import config.ConnectionSQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ConvencidosDAO {

    Connection connection;
    public ConvencidosDAO() {
        ConnectionSQL con = new ConnectionSQL();
        connection = con.getConnection();
    }

    public List<Convencidos> listar(){
        PreparedStatement ps;
        ResultSet rs;
        List<Convencidos> lista = new ArrayList<>();

        try{
            ps = connection.prepareStatement("SELECT * FROM convencidos");
            rs = ps.executeQuery();

            while (rs.next()){
                String dni_Convencedor = rs.getString("DNI_Convencedor");
                String dni_Convencido = rs.getString("DNI_Convencido");

                Convencidos objeto = new Convencidos(dni_Convencedor, dni_Convencido);
                lista.add(objeto);
            }
            return lista;
        } catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }
    public Convencidos mostrar(String _dni_convencedor, String _dni_convencido){
        PreparedStatement ps;
        ResultSet rs;
        Convencidos objeto = null;

        try{
            ps = connection.prepareStatement("SELECT * FROM asisten WHERE Clave_Eventos=? AND Clave_Ninnos=?");
            ps.setString(1, _dni_convencedor);
            ps.setString(2, _dni_convencido);
            rs = ps.executeQuery();

            while (rs.next()){
                String dni_Convencedor = rs.getString("DNI_Convencedor");
                String dni_Convencido = rs.getString("DNI_Convencido");

                objeto = new Convencidos(dni_Convencedor, dni_Convencido);

            }
            return objeto;
        } catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }
}
