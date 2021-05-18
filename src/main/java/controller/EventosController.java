package controller;

import model.Convencidos;
import model.ConvencidosDAO;
import model.Eventos;
import model.EventosDAO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EventosController", value = "/EventosController")
public class EventosController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EventosDAO eventosDAO = new EventosDAO();
        String action;
        RequestDispatcher dispatcher = null;

        action = request.getParameter("action");

        if (action == null || action.isEmpty()){
            dispatcher = request.getRequestDispatcher("Eventos/index.jsp");
            List<Eventos> lista = eventosDAO.listar();
            request.setAttribute("lista", lista);
        }
        else if ("nuevo".equals(action)){
            dispatcher = request.getRequestDispatcher("Convencidos/nuevo.jsp");
        }
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
