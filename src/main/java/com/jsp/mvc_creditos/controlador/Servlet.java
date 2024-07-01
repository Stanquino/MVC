package com.jsp.mvc_creditos.controlador;


import com.jsp.mvc_creditos.modelo.DATOS;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet ("/ServertControlador")

public class Servlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // creamos un objeto de java beans
        //instanciamos el objeto

        DATOS datos = new DATOS();

        String nombre = req.getParameter("nombre");
        String apellido = req.getParameter("apellido");
        Integer edad = Integer.valueOf(req.getParameter("edad"));
        String genero = req.getParameter("genero");
        Integer sueldo = Integer.valueOf(req.getParameter("sueldo"));


        req.setAttribute("nombre: ", datos.getNombre());
        req.setAttribute("apellido: ", datos.getApellido());
        req.setAttribute("edad: ", datos.getEdad());
        req.setAttribute("genero", datos.getGenero());
        req.setAttribute("saldo", datos.getSueldo());

        // capturamos la sesion
        // creo el objeto seccion / seteo mediante la sesion
        HttpSession session = req.getSession();
        session.setAttribute("nombre: ", datos.getNombre());
        session.setAttribute("apellido: ", datos.getApellido());
        session.setAttribute("edad: ", datos.getEdad());
        session.setAttribute("genero", datos.getGenero());
        session.setAttribute("saldo", datos.getSueldo());


        // informacion se desplieja en un jsp
        // ayuda a dirijirme
        RequestDispatcher rd = req.getRequestDispatcher("vistas/Variables.jsp");
        rd.forward(req, resp);


    }
}