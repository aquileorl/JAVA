package Models;

import DataBase.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//DAO = Data Object Access -> Objeto de Acceso a Datos
//Será el conector entre la base de datos y el modelo, donde meteremos las consultas
public class HouseDAO {

    private Connection conn;


    public HouseDAO(){
        conn = DBConnection.getConnection();
    }

    public void create(House house) throws SQLException{
        String sql = "INSERT INTO house (name, founder) VALUES (?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, house.getName());
        ps.setString(2, house.getFounder());
        ps.executeUpdate();
        ps.close(); //cerrar la ejecución de la query, en este caso actualizacion, sino seguiria ejecutando
    }

    public List<House> getAll() throws SQLException{
        List<House> list = new ArrayList<>();

        String sql = "SELECT * FROM house";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()){
            list.add(new House((rs.getInt("id")),(rs.getString("name")),(rs.getString("founder"))));
        }
        rs.close(); //cierra la ejecución de la query, sino seguiria ejecutando la query una tras otra

        return list;
    }


}
