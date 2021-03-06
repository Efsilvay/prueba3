package com.iplacex;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PersonaServlet
 */
@WebServlet("/PersonaServlet")
public class PersonaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //int id = Integer.parseInt(request.getParameter("id"));
        //Persona registroBorrar = ListarPersona.buscarRegistro(id);
        //ListarRegistros.eliminarRegistro(registroBorrar);
        //request.setAttribute("mensaje", "Se ha eliminado el nacimiento correctamente");
        request.getRequestDispatcher("/home.jsp").forward(request, response);
    }

}
