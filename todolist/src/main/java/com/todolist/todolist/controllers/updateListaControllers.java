package com.todolist.todolist.controllers;

import com.todolist.todolist.BBDD.DAO.ListasDAO;
import com.todolist.todolist.models.Listas;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name="updateProducto", urlPatterns={"/updateProducto"})
public class updateListaControllers extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String idListas = req.getParameter("idLista"); //******
        String nombreListas = req.getParameter("nombreLista");
        String producto = req.getParameter("producto");
        String cantidad = req.getParameter("cantidad");
        String observaciones = req.getParameter("observaciones");
        String nombreUsuario = req.getParameter("nombreUsuario");

        int idLista = Integer.parseInt(idListas);

        Listas list = new Listas(idListas ,nombreListas, producto, cantidad, observaciones, nombreUsuario);

        try {
            ListasDAO.UpdateLista(list);
        } catch (SQLException e) {
            throw new RuntimeException(e);
            //redireccionar a pagina de error
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("ImprimirListas.jsp");
        dispatcher.forward(req, resp);
    }
}
