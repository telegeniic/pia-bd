package controller;

import model.Rey_Mago;
import model.Rey_MagoDAO;
import model.Vecinos;
import model.VecinosDAO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "VecinosController", value = "/VecinosController")
public class VecinosController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        VecinosDAO vecinosDAO = new VecinosDAO();
        String action;
        RequestDispatcher dispatcher = null;

        action = request.getParameter("action");

        if (action == null || action.isEmpty()){
            dispatcher = request.getRequestDispatcher("Vecinos/index.jsp");
            List<Vecinos> lista = vecinosDAO.listar();
            request.setAttribute("lista", lista);
        }
        else if ("nuevo".equals(action)){
            dispatcher = request.getRequestDispatcher("Vecinos/nuevo.jsp");
        }
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
