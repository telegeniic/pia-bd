package model;

import config.ConnectionSQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AsistenDAO {

    Connection connection;

    public AsistenDAO() {
        ConnectionSQL con = new ConnectionSQL();
        connection = con.getConnection();
    }

    public List<Asisten> listar(){
        PreparedStatement ps;
        ResultSet rs;
        List<Asisten> lista = new ArrayList<>();

        try{
            ps = connection.prepareStatement("SELECT * FROM asisten");
            rs = ps.executeQuery();

            while (rs.next()){
                int Clave_Ninnos = rs.getInt("Clave_Ninnos");
                int Clave_Eventos = rs.getInt("Clave_Eventos");

                Asisten asisten = new Asisten(Clave_Ninnos, Clave_Eventos);
                lista.add(asisten);
            }
            return lista;
        } catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }

    public Asisten mostrar(int _cve_ninnos, int _cve_eventos){
        PreparedStatement ps;
        ResultSet rs;
        Asisten asisten = null;

        try{
            ps = connection.prepareStatement("SELECT * FROM asisten WHERE Clave_Ninnos=? AND Clave_Eventos=?");
            ps.setInt(1, _cve_ninnos);
            ps.setInt(2, _cve_eventos);
            rs = ps.executeQuery();

            while (rs.next()){
                int Clave_Ninnos = rs.getInt("Clave_Ninnos");
                int Clave_Eventos = rs.getInt("Clave_Eventos");

                asisten = new Asisten(Clave_Ninnos, Clave_Eventos);
            }
            return asisten;
        } catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }


}
