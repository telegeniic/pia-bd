package controller;

import model.Eventos;
import model.EventosDAO;
import model.Grupo_Vecinos;
import model.Grupo_VecinosDAO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Grupo_VecinosController", value = "/Grupo_VecinosController")
public class Grupo_VecinosController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Grupo_VecinosDAO grupo_vecinosDAO = new Grupo_VecinosDAO();
        String action;
        RequestDispatcher dispatcher = null;

        action = request.getParameter("action");

        if (action == null || action.isEmpty()){
            dispatcher = request.getRequestDispatcher("Grupo_de_Vecinos/index.jsp");
            List<Grupo_Vecinos> lista = grupo_vecinosDAO.listar();
            request.setAttribute("lista", lista);
        }
        else if ("nuevo".equals(action)){
            dispatcher = request.getRequestDispatcher("Grupo_de_Vecinos/nuevo.jsp");
        }
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
