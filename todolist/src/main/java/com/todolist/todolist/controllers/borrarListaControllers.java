package com.todolist.todolist.controllers;

import com.todolist.todolist.BBDD.DAO.ListasDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name="borrarLista", urlPatterns={"/borrarLista"})
public class borrarListaControllers extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("idListas");

        int idNumber = Integer.parseInt(id);

        try {
            ListasDAO.DeleteLista(idNumber);
        } catch (SQLException e) {
            throw new RuntimeException(e);
            //redireciconar??
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //esto no funciona, creo por async asincronia
        RequestDispatcher dispacher = req.getRequestDispatcher("ImprimirListas.jsp");
        dispacher.forward(req, resp);
    }
}
