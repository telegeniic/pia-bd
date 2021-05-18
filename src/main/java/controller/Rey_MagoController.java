package controller;

import model.Grupo_Vecinos;
import model.Grupo_VecinosDAO;
import model.Rey_Mago;
import model.Rey_MagoDAO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Rey_MagoController", value = "/Rey_MagoController")
public class Rey_MagoController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Rey_MagoDAO rey_magoDAO = new Rey_MagoDAO();
        String action;
        RequestDispatcher dispatcher = null;

        action = request.getParameter("action");

        if (action == null || action.isEmpty()){
            dispatcher = request.getRequestDispatcher("Rey_Mago/index.jsp");
            List<Rey_Mago> lista = rey_magoDAO.listar();
            request.setAttribute("lista", lista);
        }
        else if ("nuevo".equals(action)){
            dispatcher = request.getRequestDispatcher("Rey_Mago/nuevo.jsp");
        }
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
