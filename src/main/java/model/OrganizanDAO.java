package model;

import config.ConnectionSQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrganizanDAO {

    Connection connection;

    public OrganizanDAO() {
        ConnectionSQL con = new ConnectionSQL();
        connection = con.getConnection();
    }

    public List<Organizan> listar(){
        PreparedStatement ps;
        ResultSet rs;
        List<Organizan> lista = new ArrayList<>();

        try{
            ps = connection.prepareStatement("SELECT * FROM organizan");
            rs = ps.executeQuery();

            while (rs.next()){
                int clave_grupo_de_vecinos = rs.getInt("Clave_Grupo_de_Vecinos");
                String dni = rs.getString("DNI");
                int clave_eventos = rs.getInt("Clave_Eventos");

                Organizan objeto = new Organizan(clave_grupo_de_vecinos, clave_eventos, dni);
                lista.add(objeto);
            }
            return lista;
        } catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }
}
