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
import java.util.ArrayList;

@WebServlet(name="obtenerListas", urlPatterns={"/obtenerListas"})
public class ObtenerListasControllers extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       try {
           ArrayList <Listas> listas = ListasDAO.GetAll();

           req.setAttribute("lista",listas);

       }catch (Exception e){
           //redirecciono a pagina de error
       }


        RequestDispatcher dispatcher = req.getRequestDispatcher("ImprimirListas.jsp");
        dispatcher.forward(req,resp);
    }
}
