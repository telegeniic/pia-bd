package controller;

import model.Asisten;
import model.AsistenDAO;
import model.Ninnos;
import model.NinnosDAO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AsistenController", value = "/AsistenController")
public class AsistenController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AsistenDAO asistenDAO = new AsistenDAO();
        String action;
        RequestDispatcher dispatcher = null;

        action = request.getParameter("action");

        if (action == null || action.isEmpty()){
            dispatcher = request.getRequestDispatcher("Asisten/index.jsp");
            List<Asisten> lista = asistenDAO.listar();
            request.setAttribute("lista", lista);
        }
        else if ("nuevo".equals(action)){
            dispatcher = request.getRequestDispatcher("Asisten/nuevo.jsp");
        }
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
