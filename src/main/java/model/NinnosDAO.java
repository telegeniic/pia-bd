package model;

import config.ConnectionSQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NinnosDAO {

    Connection connection;

    public NinnosDAO(){
        ConnectionSQL con = new ConnectionSQL();
        connection = con.getConnection();
    }

    public List<Ninnos> listar(){
        PreparedStatement ps;
        ResultSet rs;
        List<Ninnos> lista = new ArrayList<>();

        try{
            ps = connection.prepareStatement("SELECT * FROM ninnos");
            rs = ps.executeQuery();

            while (rs.next()){
                int clave_ninnos = rs.getInt("Clave_Ninnos");
                String regalo_ninnos = rs.getString("Regalo_Ninnos");
                String colonia_ninnos = rs.getString("Colonia_Ninnos");
                String calle_ninnos = rs.getString("Calle_Ninnos");
                int numero_residencia = rs.getInt("Numero_Residencia");
                String apellido_paterno_ninnos = rs.getString("Apellido_Paterno_Ninnos");
                String apellido_materno_ninnos = rs.getString("Apellido_Materno_Ninnos");
                String nombres_ninnos = rs.getString("Nombres_Ninnos");

                Ninnos ninnos = new Ninnos(clave_ninnos, numero_residencia, regalo_ninnos, colonia_ninnos, calle_ninnos, apellido_paterno_ninnos, apellido_materno_ninnos, nombres_ninnos);
                lista.add(ninnos);
            }
            return lista;
        } catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }

    public Ninnos mostrar(int _clave_ninnos){
        PreparedStatement ps;
        ResultSet rs;
        Ninnos ninno = null;

        try{
            ps = connection.prepareStatement("SELECT * FROM ninnos WHERE Clave_Ninnos=?");
            ps.setInt(1, _clave_ninnos);
            rs = ps.executeQuery();

            while (rs.next()){
                int clave_ninnos = rs.getInt("Clave_Ninnos");
                String regalo_ninnos = rs.getString("Regalo_Ninnos");
                String colonia_ninnos = rs.getString("Colonia_Ninnos");
                String calle_ninnos = rs.getString("Calle_Ninnos");
                int numero_residencia = rs.getInt("Numero_Residencia");
                String apellido_paterno_ninnos = rs.getString("Apellido_Paterno_Ninnos");
                String apellido_materno_ninnos = rs.getString("Apellido_Materno_Ninnos");
                String nombres_ninnos = rs.getString("Nombres_Ninnos");

                ninno = new Ninnos(clave_ninnos, numero_residencia, regalo_ninnos, colonia_ninnos, calle_ninnos, apellido_paterno_ninnos, apellido_materno_ninnos, nombres_ninnos);
            }
            return ninno;
        } catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }

    public boolean insertar(Ninnos ninno){
        PreparedStatement ps;

        try{
            ps = connection.prepareStatement("INSERT INTO ninnos VALUES (?,?,?,?,?,?,?,?)");
            ps.setInt(1, ninno.getClave_ninno());
            ps.setString(2, ninno.getRegalo_Ninnos());
            ps.setString(3, ninno.getColonia_Ninnos());
            ps.setString(4, ninno.getCalle_Ninnos());
            ps.setInt(5, ninno.getNumero_Residencia());
            ps.setString(6, ninno.getApellido_Paterno_Ninnos());
            ps.setString(7, ninno.getApellido_Materno_Ninnos());
            ps.setString(8, ninno.getNombres_Ninnos());

            ps.execute();


            return true;
        } catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }
    }

    public boolean actualizar(Ninnos ninno){
        PreparedStatement ps;
        String query = "UPDATE ninnos SET Clave_Ninnos=?, Regalo_Ninnos=?, Colonia_Ninnos=?, Calle_Ninnos=?, Numero_Residencia=?, Apellido_Paterno_Ninnos=?, Apellido_Materno_Ninnos=?, Nombres_Ninnos=? WHERE Clave_Ninnos=?";

        try{
            ps = connection.prepareStatement(query);
            ps.setInt(1, ninno.getClave_ninno());
            ps.setString(2, ninno.getRegalo_Ninnos());
            ps.setString(3, ninno.getColonia_Ninnos());
            ps.setString(4, ninno.getCalle_Ninnos());
            ps.setInt(5, ninno.getNumero_Residencia());
            ps.setString(6, ninno.getApellido_Paterno_Ninnos());
            ps.setString(7, ninno.getApellido_Materno_Ninnos());
            ps.setString(8, ninno.getNombres_Ninnos());
            ps.setInt(9, ninno.getClave_ninno());

            ps.execute();


            return true;
        } catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }
    }

    public boolean eliminar(int _clave_ninnos){
        PreparedStatement ps;
        String query = "DELETE FROM ninnos WHERE Clave_ninnos=? ";

        try{
            ps = connection.prepareStatement(query);
            ps.setInt(1, _clave_ninnos);

            ps.execute();


            return true;
        } catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }
    }
}
