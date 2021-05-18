package controller;

import model.Ninnos;
import model.NinnosDAO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "NinnosController", value = "/NinnosController")
public class NinnosController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        NinnosDAO ninnosDAO = new NinnosDAO();
        String action;
        RequestDispatcher dispatcher = null;

        action = request.getParameter("action");

        if (action == null || action.isEmpty()){
            dispatcher = request.getRequestDispatcher("Ninnos/index.jsp");
            List<Ninnos> listaNinnos = ninnosDAO.listar();
            request.setAttribute("lista", listaNinnos);
        }
        else if ("nuevo".equals(action)){
            dispatcher = request.getRequestDispatcher("Ninnos/nuevo.jsp");
        }
        else if ("insert".equals(action)){
            int clave = Integer.parseInt(request.getParameter("clave"));
            int numero = Integer.parseInt(request.getParameter("numero"));
            String regalo = request.getParameter("regalo");
            String colonia = request.getParameter("colonia");
            String calle = request.getParameter("calle");
            String apellido_paterno = request.getParameter("apellido_paterno");
            String apellido_materno = request.getParameter("apellido_materno");
            String nombres = request.getParameter("nombres");

            Ninnos ninno = new Ninnos(clave, numero, regalo, colonia, calle, apellido_paterno, apellido_materno, nombres);
            ninnosDAO.insertar(ninno);

            dispatcher = request.getRequestDispatcher("Ninnos/index.jsp");
            List<Ninnos> listaNinnos = ninnosDAO.listar();
            request.setAttribute("lista", listaNinnos);
        }

        dispatcher.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);

    }
}
