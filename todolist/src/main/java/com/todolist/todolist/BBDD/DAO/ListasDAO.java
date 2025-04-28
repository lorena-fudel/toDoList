package com.todolist.todolist.BBDD.DAO;

import com.todolist.todolist.BBDDConector;
import com.todolist.todolist.models.Listas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ListasDAO {

    public static ArrayList<Listas> GetAll() throws SQLException {
        ArrayList<Listas> aux = new ArrayList<>();

        String query = "SELECT * FROM todolist.lista";

        Connection conn = BBDDConector.GetInstance().GetConn();
        PreparedStatement ps = conn.prepareStatement(query);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Listas listas = new Listas();
            listas.setIdListas(rs.getString("idLista"));
            listas.setNombreLista(rs.getString("nombreLista"));
            listas.setProducto(rs.getString("producto"));
            listas.setCantidad(rs.getString("cantidad"));
            listas.setObservaciones(rs.getString("observaciones"));
            listas.setNombreUsuario(rs.getString("nombreUsuario"));

            aux.add(listas);
        }
        return aux;
    }

    public static boolean DeleteLista(int idLista) throws SQLException {
        String query = "delete from lista where idLista = ?";
        Connection conn = BBDDConector.GetInstance().GetConn();
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, idLista);            //id     o idLista

        int rows = ps.executeUpdate();

        return rows > 0;
    }

    public static boolean AddLista(Listas listas) throws SQLException {
        String query = "INSERT INTO LISTA (nombreLista, producto, cantidad, observaciones, nombreUsuario) VALUES (?, ?, ?, ?, ?)";

        Connection conn = BBDDConector.GetInstance().GetConn();
        PreparedStatement ps = conn.prepareStatement(query);

        ps.setString(1, listas.getNombreLista());
        ps.setString(2, listas.getProducto());
        ps.setString(3, listas.getCantidad());
        ps.setString(4, listas.getObservaciones());
        ps.setString(5, listas.getNombreUsuario());

        int rows = ps.executeUpdate();

        return rows > 0;
    }


    public static boolean UpdateLista(Listas listas) throws SQLException {
        String query = "UPDATE LISTA SET nombreLista=?, producto=?, cantidad=?, observaciones=?, nombreUsuario=? WHERE idLista=?";

        Connection conn = BBDDConector.GetInstance().GetConn();
        PreparedStatement ps = conn.prepareStatement(query);

        ps.setString(1, listas.getNombreLista());
        ps.setString(2, listas.getProducto());
        ps.setString(3, listas.getCantidad());
        ps.setString(4, listas.getObservaciones());
        ps.setString(5, listas.getNombreUsuario());
        ps.setInt(6, listas.getIdListas());

        int rows = ps.executeUpdate();

        return rows > 0;
    }

}
