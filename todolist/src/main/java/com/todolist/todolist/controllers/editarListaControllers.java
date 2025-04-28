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

@WebServlet(name="editarLista", urlPatterns={"/editarLista"})
public class editarListaControllers extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("idListas");  //lista?? id??

        int idNumber = Integer.parseInt(id);

   req.setAttribute("idListas", idNumber); //*****


        //esto no funciona, creo por async asincronia
        RequestDispatcher dispacher = req.getRequestDispatcher("editarListas.jsp");
        dispacher.forward(req, resp);
    }
}
